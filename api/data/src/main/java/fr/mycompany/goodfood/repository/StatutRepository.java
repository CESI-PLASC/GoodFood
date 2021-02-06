package fr.mycompany.goodfood.repository;

import org.springframework.stereotype.Repository;

import fr.mycompany.goodfood.entity.Statut;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StatutRepository extends JpaRepository<Statut, Long>{}
