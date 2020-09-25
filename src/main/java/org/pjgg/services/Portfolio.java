package org.pjgg.services;


import org.pjgg.model.Position;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigDecimal;

@ApplicationScoped
public class Portfolio {

    private final StocksService stocksService;
    private final PositionsLoader positionsLoader;

    @Inject
    public Portfolio(StocksService stocksService, PositionsLoader positionsLoader) {
        this.positionsLoader = positionsLoader;
        this.stocksService = stocksService;
    }

    public BigDecimal computePortfolioProfit() {
        return this.positionsLoader.load().stream()
                .map(this::computePositionProfit)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

    private BigDecimal computePositionProfit(Position position) {
        return this.stocksService.getCurrentValue(position.getTicker())
                .subtract(position.getAveragePrice())
                .multiply(position.getQuantity());
    }

}
