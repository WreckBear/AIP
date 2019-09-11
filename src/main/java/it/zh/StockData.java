package it.zh;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 股票/指数数据
 */
public class StockData {

    private LocalDate date;
    private BigDecimal openPrice;
    private BigDecimal closePrice;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }
}
