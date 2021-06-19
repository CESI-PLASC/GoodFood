package fr.goodfood.service;

import fr.goodfood.entity.Produit;
import fr.goodfood.repository.ProduitRepository;
import fr.goodfood.ressource.error.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Produit create(Produit newProduit) {
        return this.produitRepository.save(newProduit);
    }

    public Produit update(Produit produit) {
        if (produit != null && produit.getId() != null) {
            produit = this.produitRepository.save(produit);
        } else {
            produit = this.create(produit);
        }

        return produit;
    }

    public Produit one(Long id) {
        return this.produitRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
    }

    public List<Produit> all() {
        return this.produitRepository.findAll();
    }

    public void delete(Long id) {
        Produit produit = this.produitRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
        produit.setEst_supprime(true);
        this.produitRepository.save(produit);
    }
}
