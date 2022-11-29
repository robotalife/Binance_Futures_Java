//package com.binance.client.examples.trade;
//
//import com.binance.client.BinanceFuturesRestClient;
//import com.binance.client.examples.constants.PrivateConfig;
//import com.binance.client.model.enums.PositionSide;
//
///**
// * @author : wangwanlu
// * @since : 2020/4/23, Thu
// **/
//public class AddIsolatedPositionMargin {
//
//    static int INCREASE_MARGIN_TYPE = 1;
//    static int DECREASE_MARGIN_TYPE = 2;
//
//    public static void main(String[] args) {
//        RequestOptions options = new RequestOptions();
//        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesRestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
//                options);
//
//        System.out.println(binanceFuturesRestClient.addIsolatedPositionMargin("BTCUSDT", INCREASE_MARGIN_TYPE, "100", PositionSide.BOTH));
//    }
//}
