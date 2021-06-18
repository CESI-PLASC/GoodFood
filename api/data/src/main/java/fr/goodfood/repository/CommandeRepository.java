package fr.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import fr.goodfood.entity.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

    @Query(value = "select sum(prix) from goodfood.contenu c inner join goodfood.formule f on f.id = c.formule_id where c.commande_id = :idCommande", nativeQuery = true)
    Double getPrice(@Param("idCommande") Long idCommande);
}
