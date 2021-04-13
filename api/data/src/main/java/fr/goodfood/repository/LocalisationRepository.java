package fr.goodfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.goodfood.entity.Localisation;
import fr.goodfood.entity.keys.LocalisationKey;

@Repository
public interface LocalisationRepository extends JpaRepository<Localisation, LocalisationKey> {

}
