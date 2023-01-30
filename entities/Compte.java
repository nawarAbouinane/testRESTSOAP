package ma.epolytechnique.gestinCompte.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long code ;
	double solde;
	@Temporal(TemporalType.DATE)
	Date datec;
	@ManyToOne
	@JoinColumn(name="id_client")
	Client client ;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(Long code, double solde, Date datec, Client client) {
		super();
		this.code = code;
		this.solde = solde;
		this.datec = datec;
		this.client = client;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDatec() {
		return datec;
	}
	public void setDatec(Date datec) {
		this.datec = datec;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	
	
	

}
