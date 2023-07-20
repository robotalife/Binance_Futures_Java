package com.binance.client.model.market;

import com.binance.client.impl.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeInfoEntry {
    /**
     * "pair": "BTCUSDT",
     * "contractType": "PERPETUAL",
     * "deliveryDate": 4133404800000,
     * "onboardDate": 1569398400000,
     * "status": "TRADING",
     * "maintMarginPercent": "2.5000",
     * "requiredMarginPercent": "5.0000",
     * "baseAsset": "BTC",
     * "quoteAsset": "USDT",
     * "marginAsset": "USDT",
     * "pricePrecision": 2,
     * "quantityPrecision": 3,
     * "baseAssetPrecision": 8,
     * "quotePrecision": 8,
     * "underlyingType": "COIN",
     * "underlyingSubType": [
     * "PoW"
     * ],
     * "settlePlan": 0,
     * "triggerProtect": "0.0500",
     * "liquidationFee": "0.017500",
     * "marketTakeBound": "0.05",
     * "filters": [
     */

    private String symbol;

    private String status;

    private BigDecimal maintMarginPercent;

    private BigDecimal requiredMarginPercent;

    private String baseAsset;

    private String quoteAsset;

    private Long pricePrecision;

    private Long quantityPrecision;

    private Long baseAssetPrecision;

    private Long quotePrecision;

    private List<String> orderTypes;

    private List<String> timeInForce;

    private List<SymbolFilter> filters;

    private ContractType contractType;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getMaintMarginPercent() {
        return maintMarginPercent;
    }

    public void setMaintMarginPercent(BigDecimal maintMarginPercent) {
        this.maintMarginPercent = maintMarginPercent;
    }

    public BigDecimal getRequiredMarginPercent() {
        return requiredMarginPercent;
    }

    public void setRequiredMarginPercent(BigDecimal requiredMarginPercent) {
        this.requiredMarginPercent = requiredMarginPercent;
    }

    public String getBaseAsset() {
        return baseAsset;
    }

    public void setBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
    }

    public String getQuoteAsset() {
        return quoteAsset;
    }

    public void setQuoteAsset(String quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    public Long getPricePrecision() {
        return pricePrecision;
    }

    public void setPricePrecision(Long pricePrecision) {
        this.pricePrecision = pricePrecision;
    }

    public Long getQuantityPrecision() {
        return quantityPrecision;
    }

    public void setQuantityPrecision(Long quantityPrecision) {
        this.quantityPrecision = quantityPrecision;
    }

    public Long getBaseAssetPrecision() {
        return baseAssetPrecision;
    }

    public void setBaseAssetPrecision(Long baseAssetPrecision) {
        this.baseAssetPrecision = baseAssetPrecision;
    }

    public Long getQuotePrecision() {
        return quotePrecision;
    }

    public void setQuotePrecision(Long quotePrecision) {
        this.quotePrecision = quotePrecision;
    }

    public List<String> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<String> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public List<String> getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(List<String> timeInForce) {
        this.timeInForce = timeInForce;
    }

    public List<SymbolFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<SymbolFilter> filters) {
        this.filters = filters;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("symbol", symbol)
                .append("status", status).append("maintMarginPercent", maintMarginPercent)
                .append("requiredMarginPercent", requiredMarginPercent).append("baseAsset", baseAsset)
                .append("quoteAsset", quoteAsset).append("pricePrecision", pricePrecision)
                .append("quantityPrecision", quantityPrecision).append("baseAssetPrecision", baseAssetPrecision)
                .append("quotePrecision", quotePrecision).append("orderTypes", orderTypes)
                .append("timeInForce", timeInForce).append("filters", filters).append("contractType", contractType).toString();
    }

    public enum ContractType {
        PERPETUAL("PERPETUAL"),
        CURRENT_QUARTER("CURRENT_QUARTER");

        private final String type;

        ContractType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
}
