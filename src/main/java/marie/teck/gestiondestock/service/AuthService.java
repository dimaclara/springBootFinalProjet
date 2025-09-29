package marie.teck.gestiondestock.service;

import marie.teck.gestiondestock.dto.AuthResponseDto;
import marie.teck.gestiondestock.dto.LoginRequestDto;
import marie.teck.gestiondestock.dto.RegisterRequestDto;

public interface AuthService {

    AuthResponseDto register(RegisterRequestDto request);

    AuthResponseDto login(LoginRequestDto request);

}
