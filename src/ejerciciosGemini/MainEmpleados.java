package ejerciciosGemini;

import java.util.ArrayList;

public class MainEmpleados {

	public static void main(String[] args) {
		
		ArrayList<Empleado> empresa = new ArrayList<>();
		empresa.add(new Programador("Ana", 2500, "Java"));
		empresa.add(new Diseñador("Luis", 2200, "Photoshop"));
		
		for (Empleado e : empresa) {
			e.mostrarDatos();
		}
	}

}
