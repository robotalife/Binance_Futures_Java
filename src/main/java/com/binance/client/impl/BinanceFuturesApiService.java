package com.binance.client.impl;

import com.binance.client.impl.constant.BinanceApiConstants;
import com.binance.client.model.ResponseResult;
import com.binance.client.model.enums.NewOrderRespType;
import com.binance.client.model.enums.OrderSide;
import com.binance.client.model.enums.OrderType;
import com.binance.client.model.enums.PositionSide;
import com.binance.client.model.enums.TimeInForce;
import com.binance.client.model.enums.WorkingType;
import com.binance.client.model.market.ExchangeInformation;
import com.binance.client.model.market.MarkPrice;
import com.binance.client.model.market.PriceChangeTicker;
import com.binance.client.model.market.SymbolPrice;
import com.binance.client.model.trade.AccountInformation;
import com.binance.client.model.trade.Leverage;
import com.binance.client.model.trade.Order;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
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

    @Headers(BinanceApiConstants.ENDPOINT_SECURITY_TYPE_SIGNED_HEADER)
    @POST("/fapi/v1/order")
    Call<Order> postOrder(@Query("symbol") String symbol,
                          @Query("side") OrderSide side,
                          @Query("positionSide") PositionSide positionSide,
                          @Query("type") OrderType orderType,
                          @Query("timeInForce") TimeInForce timeInForce,
                          @Query("quantity") String quantity,
                          @Query("price") String price,
                          @Query("reduceOnly") String reduceOnly,
                          @Query("newClientOrderId") String newClientOrderId,
                          @Query("stopPrice") String stopPrice,
                          @Query("workingType") WorkingType workingType,
                          @Query("newOrderRespType") NewOrderRespType newOrderRespType,
                          @Query("timestamp") Long timestamp);

    @Headers(BinanceApiConstants.ENDPOINT_SECURITY_TYPE_SIGNED_HEADER)
    @POST("/fapi/v1/leverage")
    Call<Leverage> changeInitialLeverage(@Query("symbol") String symbol,
                                         @Query("leverage") int leverageValue,
                                         @Query("timestamp") Long timestamp);

    @Headers(BinanceApiConstants.ENDPOINT_SECURITY_TYPE_SIGNED_HEADER)
    @POST("/fapi/v1/marginType")
    Call<ResponseResult> changeMarginType(@Query("symbol") String symbol,
                                          @Query("marginType") String marginType,
                                          @Query("timestamp") Long timestamp);

    @Headers(BinanceApiConstants.ENDPOINT_SECURITY_TYPE_SIGNED_HEADER)
    @GET("/fapi/v1/order")
    Call<Order> queryOrder(@Query("symbol") String symbol,
                           @Query("orderId") Long orderId,
                           @Query("timestamp") Long timestamp);

    @GET("/fapi/v1/premiumIndex")
    Call<MarkPrice> getMarkPrice(@Query("symbol") String symbol);
}
