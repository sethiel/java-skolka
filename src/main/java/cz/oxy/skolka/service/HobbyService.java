package cz.oxy.skolka.service;

import cz.oxy.skolka.dao.HobbyDao;
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
    private HobbyDao hobbyDao;

    @Transactional(readOnly = true)
    public List<HobbyDto> getAllHobbies() {
        return hobbyDao.findAll().stream()
                .map(x -> convert(x))
                .collect(Collectors.toList());
    }

    private PersonDto convert(PersonEntity entity) {
        return PersonDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    private HobbyDto convert(HobbyEntity entity) {
        return HobbyDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .persons(
                        entity.getPersons()
                                .stream()
                                .map(x -> convert(x))
                                .collect(Collectors.toSet())
                )
                .build();
    }
}
