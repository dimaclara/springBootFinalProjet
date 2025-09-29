package marie.teck.gestiondestock.dto.auth;

import marie.teck.gestiondestock.dto.UtilisateurResponseDto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String token;
    private UtilisateurResponseDto user;
} 