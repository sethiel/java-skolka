package cz.oxy.skolka.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasketDto implements PricedCollection {
    private List<BasketRowDto> basketRows;

    @Override
    public Collection<BasketRowDto> getRows() {
        return basketRows;
    }
}
