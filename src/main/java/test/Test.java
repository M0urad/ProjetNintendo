package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {

		
		List<Console> consoles = new ArrayList<Console>();
		Console SNES = new Console("Super Famicom");
		List<Boutique> boutiques = new ArrayList<Boutique>();
		List<Jeu> jeux=new ArrayList<Jeu>();

		consoles.add(SNES);
		Adresse adresse = new Adresse(46,"Rue Gabriel Péri", "Saint-Denis");
		Boutique MaxxiGames = new Boutique("Maxxi Games", adresse, jeux );
		boutiques.add(MaxxiGames);
		Jeu Mario = new Jeu("Super Mario Bros. 3", consoles, MaxxiGames);
		Jeu Zelda = new Jeu("Zelda A Link to the Past", consoles, MaxxiGames);
		Jeu MarioKart = new Jeu("Mario Kart", consoles, MaxxiGames);
		jeux.add(Zelda);
		jeux.add(MarioKart);
		jeux.add(Mario);
		Jeu F0 = new Jeu ("F-Zero", consoles, MaxxiGames);
		Jeu DD = new Jeu("Double Dragon", consoles, MaxxiGames);
		
		List<Achat> achats = new ArrayList<Achat>();
		Achat achat1 = new Achat(Zelda,LocalDate.parse("2021-05-10"),3000, MaxxiGames);
		Achat achat2 = new Achat(Mario,LocalDate.parse("2021-05-10"),3000, MaxxiGames);
		Achat achat3 = new Achat(MarioKart,LocalDate.parse("2021-05-10"),3000, MaxxiGames);

		achats.add(achat1);
		achats.add(achat2);
		achats.add(achat3);
		
		Client Alphonse=new Client("Alphonse","Brown",achats);
		
	}

}
