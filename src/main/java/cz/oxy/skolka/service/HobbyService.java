package cz.oxy.skolka.service;

import cz.oxy.skolka.dao.PersonDao;
import cz.oxy.skolka.dto.HobbyDto;
import cz.oxy.skolka.dto.PersonDto;
import cz.oxy.skolka.entity.HobbyEntity;
import cz.oxy.skolka.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HobbyService {

    @Autowired
    private PersonDao personDao;

    @Transactional(readOnly = true)
    public PersonDto getPerson(Integer id) {
        final PersonEntity entity = personDao.getPersonWithHobbies(id);
        return convert(entity);
    }

    @Transactional(readOnly = true)
    public List<PersonDto> getAllPersons() {
        return personDao.findAll().stream()
                .map(x -> convert(x))
                .collect(Collectors.toList());
    }

    @Transactional
    public PersonDto createPerson(PersonDto person) {
        PersonEntity entity = PersonEntity.builder()
                .name(person.getName())
                .build();

        return convert(personDao.save(entity));
    }

    private PersonDto convert(PersonEntity entity) {
        return PersonDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .hobbies(
                        entity.getHobbies()
                        .stream()
                                .map(x -> convert(x))
                                .collect(Collectors.toSet())
                )
                .build();
    }

    private HobbyDto convert(HobbyEntity entity) {
        return HobbyDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

}