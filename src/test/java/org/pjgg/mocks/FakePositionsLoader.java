package org.pjgg.mocks;


import org.pjgg.model.Position;
import org.pjgg.services.PositionsLoader;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;
import java.util.List;

@ApplicationScoped
@TestMode
public class FakePositionsLoader implements PositionsLoader {

    @Override
    public List<Position> load() {
        return List.of(
                new Position("AAPL", BigDecimal.TEN, BigDecimal.valueOf(60)),
                new Position("GOOG", BigDecimal.valueOf(3), BigDecimal.valueOf(110)),
                new Position("AMZN", BigDecimal.valueOf(2), BigDecimal.valueOf(25))
        );
    }
}
