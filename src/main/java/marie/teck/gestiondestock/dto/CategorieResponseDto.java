package marie.teck.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import marie.teck.gestiondestock.model.Categorie;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategorieResponseDto {
    private Integer id;
    private String code;
    private String designation;
    private Integer entrepriseId;

    @JsonIgnore
    private List<ArticleResponseDto> articles;

    // Méthode utilitaire pour convertir une entité en DTO
    public static CategorieResponseDto fromEntity(Categorie categorie) {
        if (categorie == null) return null;
        return CategorieResponseDto.builder()
                .id(categorie.getId())
                .code(categorie.getCode())
                .designation(categorie.getDesignation())
                .entrepriseId(categorie.getEntrepriseId())
                .build();
    }
} 