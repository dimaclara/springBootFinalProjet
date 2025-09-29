package marie.teck.gestiondestock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import marie.teck.gestiondestock.model.Roles;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RolesResponseDto {
    private Integer id;
    private String roleName;
    private Integer utilisateurId;
    private Integer entrepriseId;

    // Méthode utilitaire pour convertir une entité en DTO
    public static RolesResponseDto fromEntity(Roles roles) {
        if (roles == null) return null;
        return RolesResponseDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName() != null ? roles.getRoleName().name() : null)
                .utilisateurId(roles.getUtilisateur() != null ? roles.getUtilisateur().getId() : null)
                .entrepriseId(roles.getEntreprise_id())
                .build();
    }
}