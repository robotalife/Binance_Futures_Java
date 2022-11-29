package com.binance.client.examples.trade;

import com.binance.client.BinanceFuturesApiClientFactory;
import com.binance.client.examples.constants.PrivateConfig;

public class GetAccountInformation {
    public static void main(String[] args) {
        BinanceFuturesApiClientFactory factory = BinanceFuturesApiClientFactory.newInstance(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        System.out.println(factory.newRestClient().getAccountInformation());
    }
}