package fr.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.goodfood.entity.Contient;
import fr.goodfood.entity.keys.ContientKey;

@Repository
public interface ContientRepository extends JpaRepository<Contient, ContientKey> {
}
