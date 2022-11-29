package com.binance.client;


import com.binance.client.config.BinanceApiConfig;
import com.binance.client.impl.BinanceFuturesRestClientImpl;

/**
 * A factory for creating BinanceApi client objects.
 */
public class BinanceFuturesApiClientFactory {

    /**
     * API Key
     */
    private String apiKey;

    /**
     * Secret.
     */
    private String secret;

    /**
     * Instantiates a new binance api client factory.
     *
     * @param apiKey the API key
     * @param secret the Secret
     */
    private BinanceFuturesApiClientFactory(String apiKey, String secret) {
        this.apiKey = apiKey;
        this.secret = secret;
        BinanceApiConfig.useTestnet = false;
        BinanceApiConfig.useTestnetStreaming = false;
    }

    /**
     * Instantiates a new binance api client factory.
     *
     * @param apiKey              the API key
     * @param secret              the Secret
     * @param useTestnet          true if endpoint is spot test network URL; false if endpoint is production spot API URL.
     * @param useTestnetStreaming true for spot test network websocket streaming; false for no streaming.
     */
    private BinanceFuturesApiClientFactory(String apiKey, String secret, boolean useTestnet, boolean useTestnetStreaming) {
        this(apiKey, secret);
        if (useTestnet) {
            BinanceApiConfig.useTestnet = true;
            BinanceApiConfig.useTestnetStreaming = useTestnetStreaming;
        }
    }

    /**
     * New instance.
     *
     * @param apiKey the API key
     * @param secret the Secret
     * @return the binance api client factory
     */
    public static BinanceFuturesApiClientFactory newInstance(String apiKey, String secret) {
        return new BinanceFuturesApiClientFactory(apiKey, secret);
    }

    /**
     * New instance with optional Spot Test Network endpoint.
     *
     * @param apiKey              the API key
     * @param secret              the Secret
     * @param useTestnet          true if endpoint is spot test network URL; false if endpoint is production spot API URL.
     * @param useTestnetStreaming true for spot test network websocket streaming; false for no streaming.
     * @return the binance api client factory.
     */
    public static BinanceFuturesApiClientFactory newInstance(String apiKey, String secret, boolean useTestnet, boolean useTestnetStreaming) {
        return new BinanceFuturesApiClientFactory(apiKey, secret, useTestnet, useTestnetStreaming);
    }

    /**
     * New instance without authentication.
     *
     * @return the binance api client factory
     */
    public static BinanceFuturesApiClientFactory newInstance() {
        return new BinanceFuturesApiClientFactory(null, null);
    }

    /**
     * New instance without authentication and with optional Spot Test Network endpoint.
     *
     * @param useTestnet          true if endpoint is spot test network URL; false if endpoint is production spot API URL.
     * @param useTestnetStreaming true for spot test network websocket streaming; false for no streaming.
     * @return the binance api client factory.
     */
    public static BinanceFuturesApiClientFactory newInstance(boolean useTestnet, boolean useTestnetStreaming) {
        return new BinanceFuturesApiClientFactory(null, null, useTestnet, useTestnetStreaming);
    }

    /**
     * Creates a new synchronous/blocking REST client.
     */
    public BinanceFuturesRestClient newRestClient() {
        return new BinanceFuturesRestClientImpl(apiKey, secret);
    }

//  /**
//   * Creates a new asynchronous/non-blocking REST client.
//   */
//  public BinanceApiAsyncRestClient newAsyncRestClient() {
//    return new BinanceApiAsyncRestClientImpl(apiKey, secret);
//  }

//  /**
//   * Creates a new asynchronous/non-blocking Margin REST client.
//   */
//  public BinanceApiAsyncMarginRestClient newAsyncMarginRestClient() {
//    return new BinanceApiAsyncMarginRestClientImpl(apiKey, secret);
//  }
//
//  /**
//   * Creates a new synchronous/blocking Margin REST client.
//   */
//  public BinanceApiMarginRestClient newMarginRestClient() {
//    return new BinanceApiMarginRestClientImpl(apiKey, secret);
//  }
//
//  /**
//   * Creates a new web socket client used for handling data streams.
//   */
//  public BinanceApiWebSocketClient newWebSocketClient() {
//    return new BinanceApiWebSocketClientImpl(getSharedClient());
//  }
//
//  /**
//   * Creates a new synchronous/blocking Swap REST client.
//   */
//  public BinanceApiSwapRestClient newSwapRestClient() {
//    return new BinanceApiSwapRestClientImpl(apiKey, secret);
//  }
}
