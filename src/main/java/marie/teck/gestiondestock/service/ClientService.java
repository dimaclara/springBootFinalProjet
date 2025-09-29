package marie.teck.gestiondestock.service;

import marie.teck.gestiondestock.dto.ClientRequestDto;
import marie.teck.gestiondestock.dto.ClientResponseDto;

import java.util.List;

public interface ClientService {

    ClientResponseDto save(ClientRequestDto clientDto);

    ClientResponseDto findById(Integer id);

    ClientResponseDto findByNomClient(String nom);

    List<ClientResponseDto> findAll();

    void delete(Integer id);

    ClientResponseDto update(Integer id, ClientRequestDto clientDto);
}
