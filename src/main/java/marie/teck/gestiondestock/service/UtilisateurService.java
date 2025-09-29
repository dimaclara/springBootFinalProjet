package marie.teck.gestiondestock.service;

import marie.teck.gestiondestock.dto.UtilisateurRequestDto;
import marie.teck.gestiondestock.dto.UtilisateurResponseDto;

import java.util.List;

public interface UtilisateurService {
    UtilisateurResponseDto save(UtilisateurRequestDto utilisateurDto);

    UtilisateurResponseDto findById(Integer id);

    UtilisateurResponseDto findByEmailUser(String email);

    List<UtilisateurResponseDto> findAll();

    void delete(Integer id);

    UtilisateurResponseDto update(Integer id, UtilisateurRequestDto utilisateurDto);
}
