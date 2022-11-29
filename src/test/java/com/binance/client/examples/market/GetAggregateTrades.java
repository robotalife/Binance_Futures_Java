//package com.binance.client.examples.market;
//
//import com.binance.client.RequestOptions;
//import com.binance.client.BinanceFuturesRestClient;
//
//import com.binance.client.examples.constants.PrivateConfig;
//
//public class GetAggregateTrades {
//    public static void main(String[] args) {
//        RequestOptions options = new RequestOptions();
//        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesRestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
//                options);
//        System.out.println(binanceFuturesRestClient.getAggregateTrades("BTCUSDT", null, null, null, 5));
//    }
//}
