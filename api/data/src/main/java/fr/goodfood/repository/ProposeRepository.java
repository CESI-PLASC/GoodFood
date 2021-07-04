package fr.goodfood.repository;

import fr.goodfood.entity.Propose;
import fr.goodfood.entity.keys.ProposeKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposeRepository extends JpaRepository<Propose, ProposeKey> {}
