package cz.oxy.skolka.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasketRowDto {
    private int quantity;
    private ProductDto product;
}
