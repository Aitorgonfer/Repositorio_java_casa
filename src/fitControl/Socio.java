package fitControl;

import java.util.ArrayList;

public abstract class Socio {

	private String nombre;
	private double cuotaBase;
	
	ArrayList<Actividad> listaActividades = new ArrayList<>();

	public Socio(String nombre, double cuotaBase) {
		this.nombre = nombre;
		this.cuotaBase = cuotaBase;
		this.listaActividades = new ArrayList<>();
	}
	
	public void añadirActividad(Actividad a) {
		if (listaActividades.size() < getLimiteActividades()) {
	        listaActividades.add(a);
	        System.out.println("Actividad " + a.getNombre() + " añadida con éxito.");
	    } else {
	        System.out.println("Error: Límite de actividades alcanzado para " + nombre);
	    }
	}
	
	protected abstract double calcularPrecio();
	protected abstract int getLimiteActividades();

	public String getNombre() {
		return nombre;
	}

	public double getCuotaBase() {
		return cuotaBase;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", cuotaBase=" + cuotaBase + ", listaActividades=" + listaActividades + "]";
	}
	
	
}
