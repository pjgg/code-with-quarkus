package org.pjgg.services;

import java.math.BigDecimal;

public interface StocksService {

    BigDecimal getCurrentValue(String ticker);

}
