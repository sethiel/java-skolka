package cz.oxy.skolka.dao;

import cz.oxy.skolka.entity.HobbyEntity;
import cz.oxy.skolka.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyDao extends JpaRepository<HobbyEntity, Integer> {
}
