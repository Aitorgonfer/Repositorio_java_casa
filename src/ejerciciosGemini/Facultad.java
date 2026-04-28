package ejerciciosGemini;

import java.util.ArrayList;

public class Facultad {

	ArrayList<Estudiante>listaEstudiantes=new ArrayList<>();

	public Facultad() {
		this.listaEstudiantes = new ArrayList<>();
	}
	
	public void agregarEstudiante(Estudiante e) {
		listaEstudiantes.add(e);
	}
	
	public void mostrarEstudiante() {
		for(Estudiante e: listaEstudiantes) {
			System.out.println(e);
		}
	}
}
