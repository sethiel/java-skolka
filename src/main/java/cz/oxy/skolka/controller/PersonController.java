package cz.oxy.skolka.controller;

import cz.oxy.skolka.dto.PersonDto;
import cz.oxy.skolka.entity.PersonEntity;
import cz.oxy.skolka.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public PersonDto getPerson(@PathVariable Integer id) {
        return personService.getPerson(id);
    }

    @GetMapping
    public List<PersonDto> getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping
    public PersonDto createPerson(@RequestBody PersonDto person) {
        return personService.createPerson(person);
    }
}
