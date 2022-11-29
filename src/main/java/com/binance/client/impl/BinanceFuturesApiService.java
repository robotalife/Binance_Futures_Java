package com.binance.client.impl;

import com.binance.client.impl.constant.BinanceApiConstants;
import com.binance.client.model.market.ExchangeInformation;
import com.binance.client.model.market.PriceChangeTicker;
import com.binance.client.model.market.SymbolPrice;
import com.binance.client.model.trade.AccountInformation;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

import java.util.List;

public interface BinanceFuturesApiService {

    @GET("/fapi/v1/exchangeInfo")
    Call<ExchangeInformation> getExchangeInfo();

    @Headers(BinanceApiConstants.ENDPOINT_SECURITY_TYPE_SIGNED_HEADER)
    @GET("/fapi/v2/account")
    Call<AccountInformation> getAccountInformation(@Query("timestamp") Long timestamp);

    @GET("/fapi/v1/ticker/price")
    Call<List<SymbolPrice>> getSymbolPriceTicker();

    @GET("/fapi/v1/ticker/price")
    Call<SymbolPrice> getSymbolPriceTicker(@Query("symbol") String symbol);

    @GET("/fapi/v1/ticker/24hr")
    Call<List<PriceChangeTicker>> get24hrTickerPriceChange();

    @GET("/fapi/v1/ticker/24hr")
    Call<PriceChangeTicker> get24hrTickerPriceChange(@Query("symbol") String symbol);
}
