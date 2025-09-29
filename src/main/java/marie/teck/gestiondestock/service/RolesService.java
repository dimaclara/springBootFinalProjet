package marie.teck.gestiondestock.service;

import marie.teck.gestiondestock.dto.RolesRequestDto;
import marie.teck.gestiondestock.dto.RolesResponseDto;

import java.util.List;

public interface RolesService {
    RolesResponseDto save(RolesRequestDto rolesDto);

    RolesResponseDto findById(Integer id);

    RolesResponseDto findByRoleName(String roleName);

    List<RolesResponseDto> findAll();

    void delete(Integer id);

    RolesResponseDto update(Integer id, RolesRequestDto rolesDto);
}

 
