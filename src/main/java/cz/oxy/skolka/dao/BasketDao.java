package cz.oxy.skolka.dao;

import cz.oxy.skolka.entity.BasketEntity;
import cz.oxy.skolka.entity.HobbyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketDao extends JpaRepository<BasketEntity, Integer> {

}
