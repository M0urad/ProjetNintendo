package test;

import java.util.ArrayList;
import java.util.List;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {

		Console SNES = new Console("Super Famicom");
		List<Console> consoles = new ArrayList<Console>();
		consoles.add(SNES);
		Jeu Mario = new Jeu("Super Mario Bros. 3", consoles);
		Jeu Zelda = new Jeu("Zelda A Link to the Past", consoles);
		Jeu MarioKart = new Jeu("Mario Kart", consoles);
		Jeu F0 = new Jeu ("F-Zero", consoles);
		Jeu DD = new Jeu("Double Dragon", consoles);
	}

}
