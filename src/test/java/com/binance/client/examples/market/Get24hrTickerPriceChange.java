package com.binance.client.examples.market;

import com.binance.client.BinanceFuturesApiClientFactory;
import com.binance.client.examples.constants.PrivateConfig;

public class Get24hrTickerPriceChange {
    public static void main(String[] args) {
        var binanceFuturesRestClient =
                BinanceFuturesApiClientFactory.newInstance(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY).newRestClient();
        System.out.println(binanceFuturesRestClient.get24hrTickerPriceChange("BTCUSDT"));
        //System.out.println(binanceFuturesRestClient.get24hrTickerPriceChange());
    }
}
