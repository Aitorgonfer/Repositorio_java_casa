package copiaExamen2Ev;

import java.util.ArrayList;

public class Grupo {
	
	private String nombre;
	private ArrayList<Double> notas;
		
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.notas = new ArrayList<>();
	}

	public Grupo(String nombre, double[] notas) {
		this.nombre = nombre;
		this.notas = new ArrayList<>();
		for(double nota : notas) {
			this.notas.add(nota);
		}
	}

	public Grupo(String nombre, ArrayList<Double> notas) {
		this.nombre = nombre;
		this.notas = new ArrayList<>(notas);
	}
	
	public void añadirNota(double nota) {
		this.notas.add(nota);
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}
	
	
}
