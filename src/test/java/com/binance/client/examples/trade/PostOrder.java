package com.binance.client.examples.trade;

import com.binance.client.BinanceFuturesApiClientFactory;
import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.enums.NewOrderRespType;
import com.binance.client.model.enums.OrderSide;
import com.binance.client.model.enums.OrderType;
import com.binance.client.model.enums.PositionSide;

public class PostOrder {
    public static void main(String[] args) {
        var binanceFuturesRestClient = BinanceFuturesApiClientFactory.newInstance(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY).newRestClient();
//        System.out.println(syncRequestClient.postOrder("BTCUSDT", OrderSide.SELL, PositionSide.BOTH, OrderType.LIMIT, TimeInForce.GTC,
//                "1", "1", null, null, null, null));

        // place dual position side order.
        // Switch between dual or both position side, call: com.binance.client.examples.trade.ChangePositionSide
        System.out.println(binanceFuturesRestClient.postOrder("SUSHIUSDT", OrderSide.BUY, PositionSide.LONG, OrderType.MARKET, null,
                "10", null, null, null, null, null, NewOrderRespType.RESULT));

        /**
         * {"clientOrderId":"vx3sn7bYrZoXRKDRl3rlqY","cumQuote":13.5100,"executedQty":10,"orderId":17915836122,"origQty":10,"price":0,"reduceOnly":false,"side":"BUY","positionSide":"LONG","status":"FILLED","stopPrice":0,"symbol":"SUSHIUSDT","timeInForce":"GTC","type":"MARKET","updateTime":1670200217635,"workingType":"CONTRACT_PRICE"}
         */
    }
}