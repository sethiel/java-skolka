package cz.oxy.skolka.service;

import cz.oxy.skolka.dto.BasketRowDto;
import cz.oxy.skolka.dto.Priced;
import cz.oxy.skolka.dto.PricedCollection;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Service
public class PriceService {

    public BigDecimal getPrice(PricedCollection pc) {
        Collection<? extends Priced> rows = pc.getRows();

        if (rows == null) {
            return BigDecimal.ZERO;
        }

        BigDecimal sum = new BigDecimal(0);
        for (Priced row : rows) {
            sum = sum.add(row.getPrice());
        }

        return sum;
    }
}
