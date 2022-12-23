package com.binance.client.impl;

import com.binance.client.BinanceFuturesRestClient;
import com.binance.client.model.ResponseResult;
import com.binance.client.model.enums.NewOrderRespType;
import com.binance.client.model.enums.OrderSide;
import com.binance.client.model.enums.OrderType;
import com.binance.client.model.enums.PositionSide;
import com.binance.client.model.enums.TimeInForce;
import com.binance.client.model.enums.WorkingType;
import com.binance.client.model.market.ExchangeInformation;
import com.binance.client.model.market.PriceChangeTicker;
import com.binance.client.model.market.SymbolPrice;
import com.binance.client.model.trade.AccountInformation;
import com.binance.client.model.trade.Leverage;
import com.binance.client.model.trade.Order;

import java.util.List;

import static com.binance.client.impl.BinanceFuturesApiServiceGenerator.createService;

public class BinanceFuturesRestClientImpl implements BinanceFuturesRestClient {

    private final BinanceFuturesApiService binanceFuturesApiService;

    public BinanceFuturesRestClientImpl(String apiKey, String secret) {
        this.binanceFuturesApiService = createService(BinanceFuturesApiService.class, apiKey, secret);
    }


    @Override
    public ExchangeInformation getExchangeInformation() {
        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getExchangeInfo());
    }

    //    @Override
//    public OrderBook getOrderBook(String symbol, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getOrderBook(symbol, limit));
//    }
//
//    @Override
//    public List<Trade> getRecentTrades(String symbol, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getRecentTrades(symbol, limit));
//    }
//
//    @Override
//    public List<Trade> getOldTrades(String symbol, Integer limit, Long fromId) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getOldTrades(symbol, limit, fromId));
//    }
//
//    @Override
//    public List<AggregateTrade> getAggregateTrades(String symbol, Long fromId, Long startTime,
//                                                   Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getAggregateTrades(symbol, fromId, startTime, endTime, limit));
//    }
//
//    @Override
//    public List<Candlestick> getCandlestick(String symbol, CandlestickInterval interval, Long startTime,
//                                            Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getCandlestick(symbol, interval, startTime, endTime, limit));
//    }
//
//    @Override
//    public List<MarkPrice> getMarkPrice(String symbol) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getMarkPrice(symbol));
//    }
//
//    @Override
//    public List<FundingRate> getFundingRate(String symbol, Long startTime, Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getFundingRate(symbol, startTime, endTime, limit));
//    }
//
    @Override
    public List<PriceChangeTicker> get24hrTickerPriceChange() {
        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.get24hrTickerPriceChange());
    }

    @Override
    public PriceChangeTicker get24hrTickerPriceChange(String symbol) {
        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.get24hrTickerPriceChange(symbol));
    }

    @Override
    public List<SymbolPrice> getSymbolPriceTicker() {
        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getSymbolPriceTicker());
    }

    @Override
    public SymbolPrice getSymbolPriceTicker(String symbol) {
        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getSymbolPriceTicker(symbol));
    }

    //
//    @Override
//    public List<SymbolOrderBook> getSymbolOrderBookTicker(String symbol) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getSymbolOrderBookTicker(symbol));
//    }
//
//    @Override
//    public List<LiquidationOrder> getLiquidationOrders(String symbol, Long startTime, Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getLiquidationOrders(symbol, startTime, endTime, limit));
//    }
//
//    @Override
//    public List<Object> postBatchOrders(String batchOrders) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.postBatchOrders(batchOrders));
//    }
//
    @Override
    public Order postOrder(String symbol, OrderSide side, PositionSide positionSide, OrderType orderType,
                           TimeInForce timeInForce, String quantity, String price, String reduceOnly,
                           String newClientOrderId, String stopPrice, WorkingType workingType, NewOrderRespType newOrderRespType) {
        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.postOrder(symbol, side, positionSide, orderType,
                timeInForce, quantity, price, reduceOnly,
                newClientOrderId, stopPrice, workingType, newOrderRespType, System.currentTimeMillis()));
    }

    //
//    @Override
//    public Order cancelOrder(String symbol, Long orderId, String origClientOrderId) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.cancelOrder(symbol, orderId, origClientOrderId));
//    }
//
//    @Override
//    public ResponseResult cancelAllOpenOrder(String symbol) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.cancelAllOpenOrder(symbol));
//    }
//
//    @Override
//    public List<Object> batchCancelOrders(String symbol, String orderIdList, String origClientOrderIdList) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.batchCancelOrders(symbol, orderIdList, origClientOrderIdList));
//    }
//
//    @Override
//    public ResponseResult changePositionSide(boolean dual) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.changePositionSide(dual));
//    }
//
    @Override
    public ResponseResult changeMarginType(String symbolName, String marginType) {
        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.changeMarginType(symbolName, marginType, System.currentTimeMillis()));
    }

    //
//    @Override
//    public JSONObject addIsolatedPositionMargin(String symbolName, int type, String amount, PositionSide positionSide) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.addPositionMargin(symbolName, type, amount, positionSide));
//    }
//
//    @Override
//    public List<WalletDeltaLog> getPositionMarginHistory(String symbolName, int type, long startTime, long endTime, int limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getPositionMarginHistory(symbolName, type, startTime, endTime, limit));
//    }
//
//
//    @Override
//    public JSONObject getPositionSide() {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getPositionSide());
//    }
//
//    @Override
//    public Order getOrder(String symbol, Long orderId, String origClientOrderId) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getOrder(symbol, orderId, origClientOrderId));
//    }
//
//    @Override
//    public List<Order> getOpenOrders(String symbol) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getOpenOrders(symbol));
//    }
//
//    @Override
//    public List<Order> getAllOrders(String symbol, Long orderId, Long startTime, Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getAllOrders(symbol, orderId, startTime, endTime, limit));
//    }
//
//    @Override
//    public List<AccountBalance> getBalance() {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getBalance());
//    }
//
    @Override
    public AccountInformation getAccountInformation() {
        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getAccountInformation(System.currentTimeMillis()));
    }

    @Override
    public Leverage changeInitialLeverage(String symbol, Integer leverage) {
        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.changeInitialLeverage(symbol, leverage, System.currentTimeMillis()));
    }
//
//    @Override
//    public List<PositionRisk> getPositionRisk() {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getPositionRisk());
//    }
//
//    @Override
//    public List<MyTrade> getAccountTrades(String symbol, Long startTime, Long endTime, Long fromId, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getAccountTrades(symbol, startTime, endTime, fromId, limit));
//    }
//
//    @Override
//    public List<Income> getIncomeHistory(String symbol, IncomeType incomeType, Long startTime, Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getIncomeHistory(symbol, incomeType, startTime, endTime, limit));
//    }
//
//    @Override
//    public String startUserDataStream() {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.startUserDataStream());
//    }
//
//    @Override
//    public String keepUserDataStream(String listenKey) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.keepUserDataStream(listenKey));
//    }
//
//    @Override
//    public String closeUserDataStream(String listenKey) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.closeUserDataStream(listenKey));
//    }
//
//    @Override
//    public List<OpenInterestStat> getOpenInterestStat(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getOpenInterestStat(symbol, period, startTime, endTime, limit));
//    }
//
//    @Override
//    public List<CommonLongShortRatio> getTopTraderAccountRatio(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getTopTraderAccountRatio(symbol, period, startTime, endTime, limit));
//    }
//
//    @Override
//    public List<CommonLongShortRatio> getTopTraderPositionRatio(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getTopTraderPositionRatio(symbol, period, startTime, endTime, limit));
//    }
//
//    @Override
//    public List<CommonLongShortRatio> getGlobalAccountRatio(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getGlobalAccountRatio(symbol, period, startTime, endTime, limit));
//    }
//
//    @Override
//    public List<TakerLongShortStat> getTakerLongShortRatio(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit) {
//        return BinanceFuturesApiServiceGenerator.callSync(binanceFuturesApiService.getTakerLongShortRatio(symbol, period, startTime, endTime, limit));
//    }
}
