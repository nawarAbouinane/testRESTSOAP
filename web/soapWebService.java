package ma.epolytechnique.gestinCompte.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.epolytechnique.gestinCompte.entities.Compte;
import ma.epolytechnique.gestinCompte.metier.Ic
import ma.epolytechnique.gestinCompte.metier.IcompteMetier;


public class soapWebService {


	@Component
	@WebService
	public class CompteSouapService {
		
		 @Autowired
			IcompteMetier metier;
			
			@WebMethod(operationName = "ajouterCompte")
			public Compte addCompte( @WebParam(name="compte") Compte compte) {
				// TODO Auto-generated method stub
				return metier.addCompte(compte);
			}

			@WebMethod
			public Compte updateCompte(@WebParam(name="code") Long code, @WebParam(name="compte") Compte compte) {
				compte.setCode(code);
				return metier.updateCompte(code,compte);
			}

			@WebMethod
			public void deleteCompte(@WebParam(name="code")  Long code) {
				metier.deleteCompte(code);
				
			}

			@WebMethod
			public List<Compte> getComptes() {
				// TODO Auto-generated method stub
				return metier.getComptes();
			}

			@WebMethod
			public Compte getCompte( @WebParam(name="code") Long code) {
				// TODO Auto-generated method stub
				return metier.getCompte(code);
			}



	}

