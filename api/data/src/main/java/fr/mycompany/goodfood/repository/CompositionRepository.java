package fr.mycompany.goodfood.repository;

import fr.mycompany.goodfood.entity.Composition;
import fr.mycompany.goodfood.entity.keys.CompositionKey;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompositionRepository extends JpaRepository<Composition, CompositionKey>{

}
