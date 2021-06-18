package fr.goodfood.service;

import fr.goodfood.dto.categorie.CategorieDTO;
import fr.goodfood.repository.CategorieRepository;
import fr.goodfood.service.mapper.CategorieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CatalogueService {

    @Autowired
    CategorieRepository categorieRepository;

    @Inject
    CategorieMapper categorieMapper;

    public List<CategorieDTO> getCatalogueByFranchiseId(Long idFranchise){
        return categorieMapper.toDtos(categorieRepository.findAll());
        //return this.categorieRepository.findAllByFranchiseById(idFranchise);
    }
}
