package fr.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.goodfood.entity.Contenu;

@Repository
public interface ContenuRepository extends JpaRepository<Contenu, Long> {
}
