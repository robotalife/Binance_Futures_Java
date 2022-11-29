package com.binance.client.model.trade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Position {

    private Boolean isolated;

    private String leverage;

    private String initialMargin;

    private String maintMargin;

    private String openOrderInitialMargin;

    private String positionInitialMargin;

    private String symbol;

    private String unrealizedProfit;

    private String entryPrice;

    private String maxNotional;

    private String positionSide;

    public Boolean getIsolated() {
        return isolated;
    }

    public void setIsolated(Boolean isolated) {
        this.isolated = isolated;
    }

    public String getLeverage() {
        return leverage;
    }

    public void setLeverage(String leverage) {
        this.leverage = leverage;
    }

    public String getInitialMargin() {
        return initialMargin;
    }

    public void setInitialMargin(String initialMargin) {
        this.initialMargin = initialMargin;
    }

    public String getMaintMargin() {
        return maintMargin;
    }

    public void setMaintMargin(String maintMargin) {
        this.maintMargin = maintMargin;
    }

    public String getOpenOrderInitialMargin() {
        return openOrderInitialMargin;
    }

    public void setOpenOrderInitialMargin(String openOrderInitialMargin) {
        this.openOrderInitialMargin = openOrderInitialMargin;
    }

    public String getPositionInitialMargin() {
        return positionInitialMargin;
    }

    public void setPositionInitialMargin(String positionInitialMargin) {
        this.positionInitialMargin = positionInitialMargin;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getUnrealizedProfit() {
        return unrealizedProfit;
    }

    public void setUnrealizedProfit(String unrealizedProfit) {
        this.unrealizedProfit = unrealizedProfit;
    }

    public String getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(String entryPrice) {
        this.entryPrice = entryPrice;
    }

    public String getMaxNotional() {
        return maxNotional;
    }

    public void setMaxNotional(String maxNotional) {
        this.maxNotional = maxNotional;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    @Override
    public String toString() {
        return "Position{" +
                "isolated=" + isolated +
                ", leverage='" + leverage + '\'' +
                ", initialMargin='" + initialMargin + '\'' +
                ", maintMargin='" + maintMargin + '\'' +
                ", openOrderInitialMargin='" + openOrderInitialMargin + '\'' +
                ", positionInitialMargin='" + positionInitialMargin + '\'' +
                ", symbol='" + symbol + '\'' +
                ", unrealizedProfit='" + unrealizedProfit + '\'' +
                ", entryPrice='" + entryPrice + '\'' +
                ", maxNotional='" + maxNotional + '\'' +
                ", positionSide='" + positionSide + '\'' +
                '}';
    }
}
