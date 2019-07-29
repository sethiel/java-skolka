package cz.oxy.skolka.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HobbyDto {

    private int id;

    private String name;

    private Set<PersonDto> persons;

}
