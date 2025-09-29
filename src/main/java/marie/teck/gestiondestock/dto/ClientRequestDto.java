package marie.teck.gestiondestock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import marie.teck.gestiondestock.model.Client;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequestDto {
    private String nom;
    private String prenom;
    private AdresseRequestDto adresse;
    private String photo;
    private String email;
    private String numTel;
    private Integer entrepriseId;

    // Méthode utilitaire pour convertir en entité
    public static Client toEntity(ClientRequestDto dto) {
        if (dto == null) return null;
        Client client = new Client();
        client.setNom(dto.getNom());
        client.setPrenom(dto.getPrenom());
        client.setPhoto(dto.getPhoto());
        client.setEmail(dto.getEmail());
        client.setNumTel(dto.getNumTel());
        client.setAdresse(dto.getAdresse() != null ? AdresseRequestDto.toEntity(dto.getAdresse()) : null);
        // L'entreprise sera associée dans le service à partir de l'id
        return client;
    }
} 