package com.binance.client.examples.market;

import com.binance.client.BinanceFuturesApiClientFactory;
import com.binance.client.examples.constants.PrivateConfig;

public class GetExchangeInformation {
    public static void main(String[] args) {
        BinanceFuturesApiClientFactory factory = BinanceFuturesApiClientFactory.newInstance(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        System.out.println(factory.newRestClient().getExchangeInformation());
    }
}
