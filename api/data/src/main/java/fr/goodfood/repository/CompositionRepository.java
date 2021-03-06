package fr.goodfood.repository;

import fr.goodfood.entity.Composition;
import fr.goodfood.entity.keys.CompositionKey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompositionRepository extends JpaRepository<Composition, CompositionKey>{

    public List<Composition> findByCommandeId(Long commandeId);
}
