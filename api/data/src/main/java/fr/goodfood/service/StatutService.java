package fr.goodfood.service;

import java.util.List;

import fr.goodfood.repository.StatutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Statut;

@Service
public class StatutService {
    
    @Autowired
    private StatutRepository statutRepository;

    public List<Statut> all(){
        return this.statutRepository.findAll();
    }
}
