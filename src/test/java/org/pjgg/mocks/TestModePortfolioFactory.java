package org.pjgg.mocks;

import org.pjgg.services.Portfolio;
import org.pjgg.services.PositionsLoader;
import org.pjgg.services.StocksService;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class TestModePortfolioFactory {

    @Inject
    @TestMode
    StocksService fakeStocksService;

    @Inject
    @TestMode
    PositionsLoader fakePositionsLoader;

    @Produces
    @TestMode
    public Portfolio createPortfolio() {
        return new Portfolio(this.fakeStocksService, this.fakePositionsLoader);
    }

}
