package fr.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.goodfood.entity.Formule;

public interface FormuleRepository extends JpaRepository<Formule, Long> {
    
}
