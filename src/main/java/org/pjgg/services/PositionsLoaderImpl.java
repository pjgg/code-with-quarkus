package org.pjgg.services;


import org.pjgg.model.Position;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class PositionsLoaderImpl implements PositionsLoader{

    private static final Random RANDOM = new Random();

    @Override
    public List<Position> load() {
        return List.of(
                new Position("AAPL", nextRandomNumber(), nextRandomNumber()),
                new Position("GOOG", nextRandomNumber(), nextRandomNumber()),
                new Position("AMZN", nextRandomNumber(), nextRandomNumber())
        );
    }

    private BigDecimal nextRandomNumber() {
        return BigDecimal.valueOf(RANDOM.nextInt(5000));
    }

}
