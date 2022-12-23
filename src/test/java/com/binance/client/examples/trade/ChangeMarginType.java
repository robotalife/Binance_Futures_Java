package com.binance.client.examples.trade;

import com.binance.client.BinanceFuturesApiClientFactory;
import com.binance.client.examples.constants.PrivateConfig;

/**
 * @author : wangwanlu
 * @since : 2020/4/23, Thu
 **/
public class ChangeMarginType {

    public static void main(String[] args) {
        var binanceFuturesRestClient = BinanceFuturesApiClientFactory.newInstance(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY).newRestClient();
        // margin type: ISOLATED, CROSSED
        System.out.println(binanceFuturesRestClient.changeMarginType("BTCUSDT", "ISOLATED"));
    }
}
