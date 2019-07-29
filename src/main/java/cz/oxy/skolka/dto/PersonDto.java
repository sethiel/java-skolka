package cz.oxy.skolka.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDto {

    private int id;

    private String name;

    private Set<HobbyDto> hobbies;

}
