package fr.goodfood.service;

import fr.goodfood.dto.categorie.CategorieDTO;
import fr.goodfood.entity.Franchise;
import fr.goodfood.repository.CategorieRepository;
import fr.goodfood.service.mapper.CategorieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.util.List;

@Service
public class CatalogueService {

    @Autowired
    CategorieRepository categorieRepository;

    @Inject
    CategorieMapper categorieMapper;

    public List<CategorieDTO> getCatalogueByFranchiseId(Long id) {
        // RestTemplate restTemplate = new RestTemplate();
        // Franchise result = restTemplate.getForObject("http://localhost:5001/???", Franchise.class);
        // return categorieMapper.toDtos(categorieRepository.findAllByFranchises(result));
        return categorieMapper.toDtos(categorieRepository.findAll());
    }
}
