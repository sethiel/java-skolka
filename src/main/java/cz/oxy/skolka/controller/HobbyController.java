package cz.oxy.skolka.controller;

import cz.oxy.skolka.dto.HobbyDto;
import cz.oxy.skolka.dto.PersonDto;
import cz.oxy.skolka.service.HobbyService;
import cz.oxy.skolka.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hobby")
public class HobbyController {

    @Autowired
    private HobbyService hobbyService;

    @GetMapping
    public List<HobbyDto> getAllHobbies() {
        return hobbyService.getAllHobbies();
    }

}
