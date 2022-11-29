package com.binance.client.examples.market;

import com.binance.client.BinanceFuturesApiClientFactory;
import com.binance.client.BinanceFuturesRestClient;

public class GetSymbolPriceTicker {
    public static void main(String[] args) {
        BinanceFuturesRestClient client = BinanceFuturesApiClientFactory.newInstance().newRestClient();
        System.out.println(client.getSymbolPriceTicker("BTCUSDT"));
        System.out.println(client.getSymbolPriceTicker());
    }
}
