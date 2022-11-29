//package com.binance.client.examples.trade;
//
//import com.binance.client.BinanceFuturesRestClient;
//import com.binance.client.examples.constants.PrivateConfig;
//
///**
// * @author : wangwanlu
// * @since : 2020/4/23, Thu
// **/
//public class GetPositionMarginHistory {
//
//    static int INCREASE_MARGIN_TYPE = 1;
//    static int DECREASE_MARGIN_TYPE = 2;
//
//    public static void main(String[] args) {
//        RequestOptions options = new RequestOptions();
//        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesRestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
//                options);
//
//        long endTime = System.currentTimeMillis();
//        long startTime = endTime - (24 * 60 * 60 * 1000);
//        int limit = 500;
//        System.out.println(binanceFuturesRestClient.getPositionMarginHistory("BTCUSDT", INCREASE_MARGIN_TYPE, startTime, endTime, limit));
//    }
//}
