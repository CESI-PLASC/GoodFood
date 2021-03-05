package fr.goodfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Composition;
import fr.goodfood.entity.keys.CompositionKey;
import fr.goodfood.repository.CompositionRepository;
import fr.goodfood.ressource.error.NotFoundException;

@Service
public class CompositionService {
    
    @Autowired
    private CompositionRepository compositionRepository;

    @Autowired
    private CommandeService commandeService;

    @Autowired
    private FormuleService formuleService;

    @Autowired
    private ProduitService produitService;

    public Composition create(Composition composition){
        CompositionKey id = composition.getId();

        composition.setCommande(this.commandeService.one(id.getCommandeId()));
        composition.setFormule(this.formuleService.one(id.getFormuleId()));
        composition.setProduit(this.produitService.one(id.getProduitId()));
        return this.compositionRepository.save(composition);
    }

    public Composition update(Composition composition){
        if(composition != null && composition.getId() != null){
            composition = this.compositionRepository.save(composition);
        } else {
            composition = this.create(composition);
        }

        return composition;
    }

    public Composition one(CompositionKey id){
        return this.compositionRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
    }

    public List<Composition> all(){
        return this.compositionRepository.findAll();
    }

    public void delete(CompositionKey id){
        this.compositionRepository.deleteById(id);
    }
}
