package ma.epolytechnique.gestinCompte.data;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.epolytechnique.gestinCompte.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
