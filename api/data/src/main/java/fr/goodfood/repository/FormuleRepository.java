package fr.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import fr.goodfood.entity.Formule;
import java.util.List;
import java.lang.Long;

@Repository
public interface FormuleRepository extends JpaRepository<Formule, Long> {

    @Query(value = "select * from goodfood.formule f, goodfood.propose p where f.id = p.formule_id and p.franchise_id = :id ;", nativeQuery = true)
    public List<Formule> findAllByFranchiseId(@Param("id") Long id);
}
