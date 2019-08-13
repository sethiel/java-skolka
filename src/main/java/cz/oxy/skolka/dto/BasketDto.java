package cz.oxy.skolka.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasketDto {
    private List<BasketRowDto> basketRows;
}
