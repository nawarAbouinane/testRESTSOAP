package ma.epolytechnique.gestinCompte.web;

import java.util.List;

import ma.epolytechnique.gestinCompte.entities.Compte;

public interface IcompteService {
	public Compte addCompte(Compte compte);
	public Compte updateCompte(Long code,Compte compte);
	public void deleteCompte(Long code);
	public List<Compte> getComptes();
	public Compte getCompte(Long code);
	


}
