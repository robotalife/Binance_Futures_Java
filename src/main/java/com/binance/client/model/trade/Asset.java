package com.binance.client.model.trade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Asset {

    private String asset;

    private String initialMargin;

    private String maintMargin;

    private String marginBalance;

    private String maxWithdrawAmount;

    private String openOrderInitialMargin;

    private String positionInitialMargin;

    private String unrealizedProfit;

    private String walletBalance;

    private String crossWalletBalance;

    private String crossUnPnl;

    private String availableBalance;

    private String marginAvailable;

    private long updateTime;

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
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

    public String getMarginBalance() {
        return marginBalance;
    }

    public void setMarginBalance(String marginBalance) {
        this.marginBalance = marginBalance;
    }

    public String getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(String maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
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

    public String getUnrealizedProfit() {
        return unrealizedProfit;
    }

    public void setUnrealizedProfit(String unrealizedProfit) {
        this.unrealizedProfit = unrealizedProfit;
    }

    public String getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(String walletBalance) {
        this.walletBalance = walletBalance;
    }

    public String getCrossWalletBalance() {
        return crossWalletBalance;
    }

    public void setCrossWalletBalance(String crossWalletBalance) {
        this.crossWalletBalance = crossWalletBalance;
    }

    public String getCrossUnPnl() {
        return crossUnPnl;
    }

    public void setCrossUnPnl(String crossUnPnl) {
        this.crossUnPnl = crossUnPnl;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getMarginAvailable() {
        return marginAvailable;
    }

    public void setMarginAvailable(String marginAvailable) {
        this.marginAvailable = marginAvailable;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "asset='" + asset + '\'' +
                ", initialMargin='" + initialMargin + '\'' +
                ", maintMargin='" + maintMargin + '\'' +
                ", marginBalance='" + marginBalance + '\'' +
                ", maxWithdrawAmount='" + maxWithdrawAmount + '\'' +
                ", openOrderInitialMargin='" + openOrderInitialMargin + '\'' +
                ", positionInitialMargin='" + positionInitialMargin + '\'' +
                ", unrealizedProfit='" + unrealizedProfit + '\'' +
                ", walletBalance='" + walletBalance + '\'' +
                ", crossWalletBalance='" + crossWalletBalance + '\'' +
                ", crossUnPnl='" + crossUnPnl + '\'' +
                ", availableBalance='" + availableBalance + '\'' +
                ", marginAvailable='" + marginAvailable + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
