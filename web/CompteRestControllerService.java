package ma.epolytechnique.gestinCompte.web;

import java.util.List;

import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.epolytechnique.gestinCompte.data.CompteRepository;
import ma.epolytechnique.gestinCompte.entities.Compte;
import ma.epolytechnique.gestinCompte.metier.IcompteMetier;

@RestController
@RequestMapping(path="/cih")
public class CompteRestControllerService implements IcompteService{
	@Autowired
	IcompteMetier  metier;
	
	@PostMapping(path="/comptes")
	public Compte addCompte(@RequestBody Compte compte) {
		return metier.addCompte(compte);
	}

	@PutMapping(path="/comptes/{code}")
	public Compte updateCompte(@PathVariable("code") Long code, @RequestBody Compte compte) {
		compte.setCode(code);
		return metier.updateCompte(code,compte);
	}

	@DeleteMapping(path="/comptes/{code}")
	public void deleteCompte(@PathVariable Long code) {
		metier.deleteCompte(code);
	}

	@GetMapping(path="/comptes",produces = 
		{MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Compte> getComptes() {
		// TODO Auto-generated method stub
		return metier.getComptes();
	}

	@GetMapping(path="/comptes/{code}",produces = 
		{MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Compte getCompte(@PathVariable Long code) {
		// TODO Auto-generated method stub
		return metier.getCompte(code);

}
}
