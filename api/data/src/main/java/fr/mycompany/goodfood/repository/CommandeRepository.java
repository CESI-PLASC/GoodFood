package fr.mycompany.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.mycompany.goodfood.entity.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {}
