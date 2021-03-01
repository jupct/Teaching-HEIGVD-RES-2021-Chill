package ch.heigvd.res.chill.domain.sist1998;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Lav implements IProduct {

    public final static String NAME = "Lav";
    public final static BigDecimal PRICE = new BigDecimal(2.8);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
