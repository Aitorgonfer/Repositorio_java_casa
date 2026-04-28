package pruebaDeExamen2ev;

import java.util.ArrayList;

public class Main {
	
	public static void main (String [] args) {
		
		ArrayList<Inmueble> inmuebles = new ArrayList<>();
		
		Local local1 = new Local(1,"Calle Soto", 67.67, 67, true);
		inmuebles.add(local1);
		
		Casa casa1 = new Casa(1,"Calle Coslada", 67, 68, 2, 2, 2);
		inmuebles.add(casa1);
		
		Habitacion h1 = new Habitacion(34, 1, "Salon");
		casa1.añadirHabitacion(h1);
		
		Habitacion h2 = new Habitacion(34, 1, "Salon");
		casa1.añadirHabitacion(h2);
		
		Habitacion h3 = new Habitacion(34, 1, "Salon");
		casa1.añadirHabitacion(h3);
		
		for(Inmueble i : inmuebles) {
			System.out.println(i);
		}
	}
}
