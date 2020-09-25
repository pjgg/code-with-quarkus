package org.pjgg.mocks;


import org.pjgg.services.StocksService;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
@TestMode
public class FakeStocksService implements StocksService {

    @Override
    public BigDecimal getCurrentValue(String ticker) {
        return BigDecimal.valueOf(100);
    }
}
