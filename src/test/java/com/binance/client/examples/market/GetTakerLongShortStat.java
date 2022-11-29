//package com.binance.client.examples.market;
//
//import com.binance.client.BinanceFuturesRestClient;
//import com.binance.client.examples.constants.PrivateConfig;
//import com.binance.client.model.enums.PeriodType;
//
//public class GetTakerLongShortStat {
//    public static void main(String[] args) {
//        RequestOptions options = new RequestOptions();
//        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesRestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
//                options);
//        System.out.println(binanceFuturesRestClient.getOpenInterestStat("BTCUSDT", PeriodType._5m,null,null,10));
//
//
//    }
//}
