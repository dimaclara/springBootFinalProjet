package marie.teck.gestiondestock.service;

import marie.teck.gestiondestock.dto.EntrepriseRequestDto;
import marie.teck.gestiondestock.dto.EntrepriseResponseDto;

import java.util.List;

public interface EntrepriseService {

    EntrepriseResponseDto save(EntrepriseRequestDto entrepriseDto);

    EntrepriseResponseDto findById(Integer id);

    EntrepriseResponseDto findByNomEntreprise(String nom);

    List<EntrepriseResponseDto> findAll();

    void delete(Integer id);

    EntrepriseResponseDto update(Integer id, EntrepriseRequestDto entrepriseDto);
}
