package fr.goodfood.repository;

import fr.goodfood.entity.Categorie;
import fr.goodfood.entity.Franchise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

    public List<Categorie> findAllByFranchises(Franchise franchise);
}
