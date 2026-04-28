package tamagotchi;

import facultad.Estudiante;

public class Tamagotchi {

	private int hambre;
	private int energia;
	private int felicidad;
	private String nombre;
	
	public Tamagotchi(String nombre) {
		this.nombre=nombre;
		this.hambre=5;
		this.energia=5;
		this.felicidad=5;
	}
	
	public void comer() {
		System.out.println(nombre + " está comiendo...");
		hambre -=10;
		if(hambre<0) hambre=0;
	}
	
	public void jugar() {
		System.out.println(nombre + " está jugando...");
		hambre +=15;
		energia -=20;
	}
	
	public void dormir() {
		energia=100;
	}
	
	public static void main(String[]args) {
		Tamagotchi e1 = new Tamagotchi("Hector");
		e1.jugar();
		e1.jugar();
		e1.comer();

	}
}