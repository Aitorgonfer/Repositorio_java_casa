package superheroes;

import java.util.ArrayList;

public class AppSuperheroe {

	public static void main(String[] args) {
		
		ArrayList<Superheroe> listaHeroes = new ArrayList<>();
		Superheroe superman = new Superheroe("Superman", "Volar");
	    Superheroe batman = new Superheroe("Batman", "Dinero");
	    batman.setCapa(false);
		listaHeroes.add(superman);
		listaHeroes.add(batman);
		
		for (Superheroe h : listaHeroes) {
		    h.describir();
		}
	}
}