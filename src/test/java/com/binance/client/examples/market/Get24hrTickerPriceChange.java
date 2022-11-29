//package com.binance.client.examples.market;
//
//import com.binance.client.RequestOptions;
//import com.binance.client.BinanceFuturesRestClient;
//
//import com.binance.client.examples.constants.PrivateConfig;
//
//public class Get24hrTickerPriceChange {
//    public static void main(String[] args) {
//        RequestOptions options = new RequestOptions();
//        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesRestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
//                options);
//        System.out.println(binanceFuturesRestClient.get24hrTickerPriceChange("BTCUSDT"));
//        // System.out.println(syncRequestClient.get24hrTickerPriceChange(null));
//    }
//}
