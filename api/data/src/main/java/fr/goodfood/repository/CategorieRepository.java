package fr.goodfood.repository;

import fr.goodfood.entity.Categorie;
import fr.goodfood.entity.Franchise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

    @Query(value = "select * from goodfood.categorie c, goodfood.fcategorie f where c.id = f.categorie_id and f.franchise_id = :id ;", nativeQuery = true)
    public List<Categorie> findAllByFranchiseById(@Param("id") Long id);
}
