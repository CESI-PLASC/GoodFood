package fr.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.goodfood.entity.Formule;

@Repository
public interface FormuleRepository extends JpaRepository<Formule, Long> {

}
