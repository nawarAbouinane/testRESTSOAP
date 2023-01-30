package ma.epolytechnique.gestinCompte.data;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.epolytechnique.gestinCompte.entities.Compte;

public interface CompteRepository extends JpaRepository <Compte , Long>{

}
