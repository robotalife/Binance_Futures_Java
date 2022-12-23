package com.binance.client.examples.trade;

import com.binance.client.BinanceFuturesApiClientFactory;
import com.binance.client.examples.constants.PrivateConfig;

public class ChangeInitialLeverage {
    public static void main(String[] args) {
        var binanceFuturesRestClient =
                BinanceFuturesApiClientFactory.newInstance(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY).newRestClient();
        System.out.println(binanceFuturesRestClient.changeInitialLeverage("BTCUSDT", 1));
    }
}