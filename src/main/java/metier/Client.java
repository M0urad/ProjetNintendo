package metier;

import java.util.List;

public class Client {

	public String nom;
	public String prenom;
	public List<Achat> jeux;
	public Client(String nom, String prenom, List<Achat> jeux) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.jeux = jeux;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Achat> getAchat() {
		return jeux;
	}
	public void setAchat(List<Achat> jeux) {
		this.jeux = jeux;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	};
	


}
