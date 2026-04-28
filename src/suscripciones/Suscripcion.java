package suscripciones;

import java.util.ArrayList;

public abstract class Suscripcion {
	private String nombreDeUsuario;
	private double precioBase;
	private ArrayList<Perfil> listaPerfiles;
	
	public Suscripcion(String nombreDeUsuario, double precioBase) {
		this.nombreDeUsuario = nombreDeUsuario;
		this.precioBase = precioBase;
		this.listaPerfiles = new ArrayList<>();
	}	
	
	public void añadirPerfil(Perfil p) {
		if(listaPerfiles.size() < getLimitePerfiles() ) {
			listaPerfiles.add(p);
			System.out.println("Perfil " + p.getNombre() + " añadido.");
		}else {
			System.out.println("Error: Límite de perfiles alcanzado para " + nombreDeUsuario);System.out.println("Error: Límite de perfiles alcanzado para " + nombreDeUsuario);
		}
	}
	
	public abstract double calcularPrecio();

	public abstract int getLimitePerfiles();

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public ArrayList<Perfil> getListaPerfiles() {
		return listaPerfiles;
	}


}
