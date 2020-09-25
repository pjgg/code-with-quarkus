package org.pjgg.model;

import java.math.BigDecimal;

public class Position {

    private final String ticker;
    private final BigDecimal quantity;
    private final BigDecimal averagePrice;

    public Position(String ticker, BigDecimal quantity, BigDecimal averagePrice) {
        this.ticker = ticker;
        this.quantity = quantity;
        this.averagePrice = averagePrice;
    }
    public String getTicker() {
        return this.ticker;
    }
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    public BigDecimal getAveragePrice() {
        return this.averagePrice;
    }
}
