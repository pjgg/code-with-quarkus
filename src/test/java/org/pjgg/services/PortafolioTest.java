package org.pjgg.services;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.pjgg.mocks.TestMode;

import javax.inject.Inject;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class PortafolioTest {

    @Inject
    @TestMode
    Portfolio portfolio;

    @Test
    void computePortfolioProfit() {
        assertEquals(BigDecimal.valueOf(520), portfolio.computePortfolioProfit());
    }
}
