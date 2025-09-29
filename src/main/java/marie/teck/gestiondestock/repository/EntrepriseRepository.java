package marie.teck.gestiondestock.repository;

import marie.teck.gestiondestock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {
    Optional<Entreprise> findByNomEntreprise(String nomEntreprise);
}
