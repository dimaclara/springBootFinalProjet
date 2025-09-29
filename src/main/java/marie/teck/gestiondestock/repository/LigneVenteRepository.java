package marie.teck.gestiondestock.repository;

import marie.teck.gestiondestock.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneVenteRepository extends JpaRepository<LigneVente, Integer> {
    void deleteAllByVenteId(Integer id);
}
