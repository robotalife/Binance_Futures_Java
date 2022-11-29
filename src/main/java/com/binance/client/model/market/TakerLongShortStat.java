package com.binance.client.model.market;

import com.binance.client.impl.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class TakerLongShortStat {
    
    private BigDecimal buySellRatio;
    private BigDecimal sellVol;
    private BigDecimal buyVol;
    private Long timestamp;

    public BigDecimal getBuySellRatio() {
        return buySellRatio;
    }

    public void setBuySellRatio(BigDecimal buySellRatio) {
        this.buySellRatio = buySellRatio;
    }

    public BigDecimal getSellVol() {
        return sellVol;
    }

    public void setSellVol(BigDecimal sellVol) {
        this.sellVol = sellVol;
    }

    public BigDecimal getBuyVol() {
        return buyVol;
    }

    public void setBuyVol(BigDecimal buyVol) {
        this.buyVol = buyVol;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("buySellRatio", buySellRatio)
                .append("sellVol", sellVol)
                .append("buyVol", buyVol)
                .append("timestamp", timestamp)
                .toString();
    }
}
