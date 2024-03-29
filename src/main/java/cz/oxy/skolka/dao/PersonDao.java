package cz.oxy.skolka.dao;

import cz.oxy.skolka.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<PersonEntity, Integer> {
}
