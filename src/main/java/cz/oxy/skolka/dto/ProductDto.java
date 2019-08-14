package cz.oxy.skolka.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto implements Priced {
    private String title;
    private BigDecimal price;
}
