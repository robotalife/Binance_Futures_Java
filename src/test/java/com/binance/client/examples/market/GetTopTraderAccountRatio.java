//package com.binance.client.examples.market;
//
//import com.binance.client.BinanceFuturesApiClientFactory;
//import com.binance.client.RequestOptions;
//import com.binance.client.BinanceFuturesRestClient;
//import com.binance.client.examples.constants.PrivateConfig;
//import com.binance.client.model.enums.PeriodType;
//
//public class GetTopTraderAccountRatio {
//    public static void main(String[] args) {
//        BinanceFuturesApiClientFactory factory = BinanceFuturesApiClientFactory.newInstance(PrivateConfig.API_KEY,PrivateConfig.SECRET_KEY);
//        factory.newRestClient()
//        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesRestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
//                options);
//        System.out.println(binanceFuturesRestClient.getTopTraderAccountRatio("BTCUSDT", PeriodType._5m,null,null,10));
//
//
//    }
//}
