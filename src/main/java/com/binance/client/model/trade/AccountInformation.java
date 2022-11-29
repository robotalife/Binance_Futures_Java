package com.binance.client.model.trade;

import com.binance.client.impl.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountInformation {
    /**
     * {
     * "totalInitialMargin": "0.00000000",    // the sum of USD value of all cross positions/open order initial margin
     * "totalMaintMargin": "0.00000000",     // the sum of USD value of all cross positions maintenance margin
     * "totalWalletBalance": "23.72469206",     // total wallet balance in USD
     * "totalUnrealizedProfit": "0.00000000",   // total unrealized profit in USD
     * "totalMarginBalance": "23.72469206",     // total margin balance in USD
     * "totalPositionInitialMargin": "0.00000000",    // the sum of USD value of all cross positions initial margin
     * "totalOpenOrderInitialMargin": "0.00000000",   // initial margin required for open orders with current mark price in USD
     * "totalCrossWalletBalance": "23.72469206",      // crossed wallet balance in USD
     * "totalCrossUnPnl": "0.00000000",      // unrealized profit of crossed positions in USD
     * "availableBalance": "23.72469206",       // available balance in USD
     * "maxWithdrawAmount": "23.72469206"     // maximum virtual amount for transfer out in USD
     * "assets": [
     * {
     * "asset": "USDT",            // asset name
     * "walletBalance": "23.72469206",      // wallet balance
     * "unrealizedProfit": "0.00000000",    // unrealized profit
     * "marginBalance": "23.72469206",      // margin balance
     * "maintMargin": "0.00000000",        // maintenance margin required
     * "initialMargin": "0.00000000",    // total initial margin required with current mark price
     * "positionInitialMargin": "0.00000000",    //initial margin required for positions with current mark price
     * "openOrderInitialMargin": "0.00000000",   // initial margin required for open orders with current mark price
     * "crossWalletBalance": "23.72469206",      // crossed wallet balance
     * "crossUnPnl": "0.00000000"       // unrealized profit of crossed positions
     * "availableBalance": "23.72469206",       // available balance
     * "maxWithdrawAmount": "23.72469206",     // maximum amount for transfer out
     * "marginAvailable": true,    // whether the asset can be used as margin in Multi-Assets mode
     * "updateTime": 1625474304765 // last update time
     * },
     * {
     * "asset": "BUSD",            // asset name
     * "walletBalance": "103.12345678",      // wallet balance
     * "unrealizedProfit": "0.00000000",    // unrealized profit
     * "marginBalance": "103.12345678",      // margin balance
     * "maintMargin": "0.00000000",        // maintenance margin required
     * "initialMargin": "0.00000000",    // total initial margin required with current mark price
     * "positionInitialMargin": "0.00000000",    //initial margin required for positions with current mark price
     * "openOrderInitialMargin": "0.00000000",   // initial margin required for open orders with current mark price
     * "crossWalletBalance": "103.12345678",      // crossed wallet balance
     * "crossUnPnl": "0.00000000"       // unrealized profit of crossed positions
     * "availableBalance": "103.12345678",       // available balance
     * "maxWithdrawAmount": "103.12345678",     // maximum amount for transfer out
     * "marginAvailable": true,    // whether the asset can be used as margin in Multi-Assets mode
     * "updateTime": 1625474304765 // last update time
     * }
     * ],
     * "positions": [  // positions of all symbols in the market are returned
     * // only "BOTH" positions will be returned with One-way mode
     * // only "LONG" and "SHORT" positions will be returned with Hedge mode
     * {
     * "symbol": "BTCUSDT",    // symbol name
     * "initialMargin": "0",   // initial margin required with current mark price
     * "maintMargin": "0",     // maintenance margin required
     * "unrealizedProfit": "0.00000000",  // unrealized profit
     * "positionInitialMargin": "0",      // initial margin required for positions with current mark price
     * "openOrderInitialMargin": "0",     // initial margin required for open orders with current mark price
     * "leverage": "100",      // current initial leverage
     * "isolated": true,       // if the position is isolated
     * "entryPrice": "0.00000",    // average entry price
     * "maxNotional": "250000",    // maximum available notional with current leverage
     * "bidNotional": "0",  // bids notional, ignore
     * "askNotional": "0",  // ask notional, ignore
     * "positionSide": "BOTH",     // position side
     * "positionAmt": "0",         // position amount
     * "updateTime": 0           // last update time
     * }
     * ]
     * }
     */

    // account commission tier
    private String feeTier;

    private Boolean canTrade;

    private Boolean canDeposit;

    private Boolean canWithdraw;

    private String maxWithdrawAmount;

    private String totalInitialMargin;

    private String totalMaintMargin;

    private String totalMarginBalance;

    private String totalOpenOrderInitialMargin;

    private String totalPositionInitialMargin;

    private String totalUnrealizedProfit;

    private String totalWalletBalance;

    private Long updateTime;

    private List<Asset> assets;

    private List<Position> positions;

    public Boolean getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(Boolean canDeposit) {
        this.canDeposit = canDeposit;
    }

    public Boolean getCanTrade() {
        return canTrade;
    }

    public void setCanTrade(Boolean canTrade) {
        this.canTrade = canTrade;
    }

    public Boolean getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public String getFeeTier() {
        return feeTier;
    }

    public void setFeeTier(String feeTier) {
        this.feeTier = feeTier;
    }

    public String getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(String maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public String getTotalInitialMargin() {
        return totalInitialMargin;
    }

    public void setTotalInitialMargin(String totalInitialMargin) {
        this.totalInitialMargin = totalInitialMargin;
    }

    public String getTotalMaintMargin() {
        return totalMaintMargin;
    }

    public void setTotalMaintMargin(String totalMaintMargin) {
        this.totalMaintMargin = totalMaintMargin;
    }

    public String getTotalMarginBalance() {
        return totalMarginBalance;
    }

    public void setTotalMarginBalance(String totalMarginBalance) {
        this.totalMarginBalance = totalMarginBalance;
    }

    public String getTotalOpenOrderInitialMargin() {
        return totalOpenOrderInitialMargin;
    }

    public void setTotalOpenOrderInitialMargin(String totalOpenOrderInitialMargin) {
        this.totalOpenOrderInitialMargin = totalOpenOrderInitialMargin;
    }

    public String getTotalPositionInitialMargin() {
        return totalPositionInitialMargin;
    }

    public void setTotalPositionInitialMargin(String totalPositionInitialMargin) {
        this.totalPositionInitialMargin = totalPositionInitialMargin;
    }

    public String getTotalUnrealizedProfit() {
        return totalUnrealizedProfit;
    }

    public void setTotalUnrealizedProfit(String totalUnrealizedProfit) {
        this.totalUnrealizedProfit = totalUnrealizedProfit;
    }

    public String getTotalWalletBalance() {
        return totalWalletBalance;
    }

    public void setTotalWalletBalance(String totalWalletBalance) {
        this.totalWalletBalance = totalWalletBalance;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("feeTier", feeTier)
                .append("canTrade", canTrade)
                .append("canDeposit", canDeposit)
                .append("canWithdraw", canWithdraw)
                .append("maxWithdrawAmount", maxWithdrawAmount)
                .append("totalInitialMargin", totalInitialMargin)
                .append("totalMaintMargin", totalMaintMargin)
                .append("totalMarginBalance", totalMarginBalance)
                .append("totalOpenOrderInitialMargin", totalOpenOrderInitialMargin)
                .append("totalPositionInitialMargin", totalPositionInitialMargin)
                .append("totalUnrealizedProfit", totalUnrealizedProfit)
                .append("totalWalletBalance", totalWalletBalance)
                .append("updateTime", updateTime)
                .append("assets", assets)
                .append("positions", positions)
                .toString();
    }
}
