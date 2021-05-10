package feature;

import java.util.List;

public class Boutique {
	
	private String nom;
	private Adresse adresse;
	private List<Jeu> jeu;
	public Boutique(String nom, Adresse adresse, List<Jeu> jeu) {
		this.nom = nom;
		this.adresse = adresse;
		this.jeu = jeu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Jeu> getJeu() {
		return jeu;
	}
	public void setJeu(List<Jeu> jeu) {
		this.jeu = jeu;
	}
	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	

}
