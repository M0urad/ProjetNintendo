package metier;

import java.time.LocalDate;

public class Achat {
	
	private Jeu jeu;
	private LocalDate date;
	private double prix;
	private Boutique boutique;
	public Achat(Jeu jeu, LocalDate date, double prix, Boutique boutique) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
		this.boutique = boutique;
	}
	public Jeu getJeu() {
		return jeu;
	}
	public LocalDate getDate() {
		return date;
	}
	public double getPrix() {
		return prix;
	}
	public Boutique getBoutique() {
		return boutique;
	}
	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}
	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + ", boutique=" + boutique + "]";
	}
 
	

}
