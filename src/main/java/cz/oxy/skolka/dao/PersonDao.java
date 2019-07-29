package cz.oxy.skolka.dao;

import cz.oxy.skolka.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<PersonEntity, Integer> {

    @Query("select p from PersonEntity p join fetch p.hobbies where p.id = :personId")
    PersonEntity getPersonWithHobbies(int personId);
}
