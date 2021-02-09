package fr.goodfood.service;

import fr.goodfood.entity.Categorie;
import fr.goodfood.repository.CategorieRepository;
import fr.goodfood.ressource.error.CategorieNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public Categorie create(Categorie newCategorie){
        return this.categorieRepository.save(newCategorie);
    }

    public Categorie update(Categorie categorie){
        if(categorie != null && categorie.getId() != null){
            categorie = this.categorieRepository.save(categorie);
        } else {
            categorie = this.create(categorie);
        }

        return categorie;
    }

    public Categorie one(Long id){
        return this.categorieRepository.findById(id).orElseThrow(() -> new CategorieNotFoundException(id));
    }

    public List<Categorie> all(){
        return this.categorieRepository.findAll();
    }

    public void delete(Long id){
        this.categorieRepository.deleteById(id);
    }
}
