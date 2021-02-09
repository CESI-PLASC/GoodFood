package fr.mycompany.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.mycompany.goodfood.entity.Formule;

public interface FormuleRepository extends JpaRepository<Formule, Long> {
    
}
