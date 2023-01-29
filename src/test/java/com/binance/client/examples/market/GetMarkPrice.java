package com.binance.client.examples.market;

import com.binance.client.BinanceFuturesApiClientFactory;
import com.binance.client.BinanceFuturesRestClient;

public class GetMarkPrice {
    public static void main(String[] args) {
        BinanceFuturesRestClient binanceFuturesRestClient = BinanceFuturesApiClientFactory.newInstance().newRestClient();
        System.out.println(binanceFuturesRestClient.getMarkPrice("BNBUSDT"));
    }
}
