package fr.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.goodfood.entity.Franchise;

public interface FranchiseRepository extends JpaRepository<Franchise, Long> {
    
}
