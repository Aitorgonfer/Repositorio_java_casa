package copiaExamen2Ev;

import java.util.ArrayList;

public class Main {

	public static void main(String [] args) {
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		
		Coche coche1 = new Coche("fwk23007", "Mercedes", 64.43, 2345, 3, true);
		
		Moto moto1 = new Moto("kwe4764", "Ferrari", 67.67, 56, 45, false, 2);
		
		Accesorio ac1 = new Accesorio("Poder", 67);
		
		vehiculos.add(coche1);
		vehiculos.add(moto1);
		moto1.añadirAccesorio(ac1);
		
		for(Vehiculo v: vehiculos) {
			System.out.println(v);
		}
	}
}
