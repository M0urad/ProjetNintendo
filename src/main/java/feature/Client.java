package feature;

import java.util.List;

public class Client {

	public String nom;
	public String prenom;
	public List<Jeu> jeu;
	public Client(String nom, String prenom, List<Jeu> jeu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.jeu = jeu;
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
	public List<Jeu> getJeu() {
		return jeu;
	}
	public void setJeu(List<Jeu> jeu) {
		this.jeu = jeu;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	};
	


}
