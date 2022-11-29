//package com.binance.client.examples.trade;
//
//import com.binance.client.BinanceFuturesRestClient;
//
//import com.binance.client.examples.constants.PrivateConfig;
//
//public class GetAllOrders {
//    public static void main(String[] args) {
//        RequestOptions options = new RequestOptions();
//        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesRestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
//                options);
//        System.out.println(binanceFuturesRestClient.getAllOrders("BTCUSDT", null, null, null, 10));
//        // System.out.println(syncRequestClient.getAllOrders("BTCUSDT", null, null, null, null));
//    }
//}