package metier;

import java.util.List;

public class Jeu {

	private String titre;
	private List<Console> consoles;
	private Boutique boutique;


	public Jeu(String titre, List<Console> consoles,Boutique boutique) {
		this.titre = titre;
		this.consoles = consoles;
		this.boutique = boutique;
	}

	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public List<Console> getConsoles() {
		return consoles;
	}



	public void setConsoles(List<Console> consoles) {
		this.consoles = consoles;
	}



	@Override
	public String toString() {
		return "Jeu [titre=" + titre + ", consoles=" + consoles + "]";
	}


}
