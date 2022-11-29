//package com.binance.client.examples.trade;
//
//import com.binance.client.BinanceFuturesRestClient;
//import com.binance.client.examples.constants.PrivateConfig;
//
///**
// * @author : wangwanlu
// * @since : 2020/4/23, Thu
// **/
//public class ChangeMarginType {
//
//    public static void main(String[] args) {
//        RequestOptions options = new RequestOptions();
//        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesRestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
//                options);
//
//        // margin type: ISOLATED, CROSSED
//        System.out.println(binanceFuturesRestClient.changeMarginType("BTCUSDT", "ISOLATED"));
//    }
//}
