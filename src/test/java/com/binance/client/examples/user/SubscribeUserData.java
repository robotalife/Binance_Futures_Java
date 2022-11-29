//package com.binance.client.examples.user;
//
//import com.binance.client.BinanceFuturesRestClient;
//import com.binance.client.SubscriptionClient;
//import com.binance.client.examples.constants.PrivateConfig;
//
//public class SubscribeUserData {
//
//    public static void main(String[] args) {
//
//        RequestOptions options = new RequestOptions();
//        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesRestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
//                options);
//
//        // Start user data stream
//        String listenKey = binanceFuturesRestClient.startUserDataStream();
//        System.out.println("listenKey: " + listenKey);
//
//        // Keep user data stream
//        binanceFuturesRestClient.keepUserDataStream(listenKey);
//
//        // Close user data stream
//        binanceFuturesRestClient.closeUserDataStream(listenKey);
//
//        SubscriptionClient client = SubscriptionClient.create();
//
//
//        client.subscribeUserDataEvent(listenKey, System.out::println, null);
//
//    }
//
//}