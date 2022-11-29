package com.binance.client.impl;

import com.binance.client.BinanceApiError;
import com.binance.client.config.BinanceApiConfig;
import com.binance.client.exception.BinanceApiException;
import com.binance.client.security.AuthenticationInterceptor;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.apache.commons.lang3.StringUtils;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

abstract class BinanceFuturesApiServiceGenerator {


    private static final OkHttpClient sharedClient;
    private static final Converter.Factory converterFactory = JacksonConverterFactory.create();

    static {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(500);
        dispatcher.setMaxRequests(500);
        sharedClient = new OkHttpClient.Builder()
                .dispatcher(dispatcher)
                .pingInterval(20, TimeUnit.SECONDS)
                .build();
    }

    @SuppressWarnings("unchecked")
    private static final Converter<ResponseBody, BinanceApiError> errorBodyConverter =
            (Converter<ResponseBody, BinanceApiError>) converterFactory.responseBodyConverter(
                    BinanceApiError.class, new Annotation[0], null);

    /**
     * Create a Binance API service.
     *
     * @param serviceClass the type of service.
     * @param apiKey       Binance API key.
     * @param secret       Binance secret.
     * @return a new implementation of the API endpoints for the Binance API service.
     */
    public static <S> S createService(Class<S> serviceClass, String apiKey, String secret) {
        String baseUrl = null;
        if (!BinanceApiConfig.useTestnet) {
            baseUrl = BinanceApiConfig.getApiBaseUrl();
        } else {
            baseUrl = /*BinanceApiConfig.useTestnetStreaming ?
                BinanceApiConfig.getStreamTestNetBaseUrl() :*/
                    BinanceApiConfig.getTestNetBaseUrl();
        }

        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(converterFactory);

        if (StringUtils.isEmpty(apiKey) || StringUtils.isEmpty(secret)) {
            retrofitBuilder.client(sharedClient);
        } else {
            // `adaptedClient` will use its own interceptor, but share thread pool etc with the 'parent' client
            AuthenticationInterceptor interceptor = new AuthenticationInterceptor(apiKey, secret);
            OkHttpClient adaptedClient = sharedClient.newBuilder().addInterceptor(interceptor).build();
            retrofitBuilder.client(adaptedClient);
        }

        Retrofit retrofit = retrofitBuilder.build();
        return retrofit.create(serviceClass);
    }

    /**
     * Execute a REST call and block until the response is received.
     */
    public static <T> T callSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                BinanceApiError apiError = getBinanceApiError(response);
                throw new BinanceApiException(apiError);
            }
        } catch (IOException e) {
            throw new BinanceApiException(e);
        }
    }

    /**
     * Extracts and converts the response error body into an object.
     */
    public static BinanceApiError getBinanceApiError(Response<?> response) throws IOException, BinanceApiException {
        return errorBodyConverter.convert(response.errorBody());
    }

    static WebSocket createWebSocket(Request request, WebSocketListener listener) {
        return sharedClient.newWebSocket(request, listener);
    }

}
