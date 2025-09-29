package marie.teck.gestiondestock.service;

import marie.teck.gestiondestock.dto.FournisseurRequestDto;
import marie.teck.gestiondestock.dto.FournisseurResponseDto;

import java.util.List;

public interface FournisseurService {

    FournisseurResponseDto save(FournisseurRequestDto fournisseurDto);

    FournisseurResponseDto findById(Integer id);

    FournisseurResponseDto findByNomFournisseur(String nom);

    List<FournisseurResponseDto> findAll();

    void delete(Integer id);

    FournisseurResponseDto update(Integer id, FournisseurRequestDto fournisseurDto);
}
