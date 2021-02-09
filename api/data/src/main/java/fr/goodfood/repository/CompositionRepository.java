package fr.goodfood.repository;

import fr.goodfood.entity.Composition;
import fr.goodfood.entity.keys.CompositionKey;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompositionRepository extends JpaRepository<Composition, CompositionKey>{

}
