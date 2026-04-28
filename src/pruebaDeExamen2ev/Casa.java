package pruebaDeExamen2ev;

import java.util.ArrayList;

public class Casa extends Inmueble{

	private int numeroHabitacionesMax;
	private int numeroBaños;
	private int numeroPlantas;
	private ArrayList<Habitacion> habitaciones;
	
	public Casa(int identificador, String direccion, double precioVenta, int metrosCuadrados, int numeroHabitacionesMax,
			int numeroBaños, int numeroPlantas) {
		super(identificador, direccion, precioVenta, metrosCuadrados);
		this.numeroHabitacionesMax = numeroHabitacionesMax;
		this.numeroBaños = numeroBaños;
		this.numeroPlantas = numeroPlantas;
		this.habitaciones= new ArrayList<>();
	}
	
	public void añadirHabitacion(Habitacion habitacion) {
	    if (habitaciones.size() < numeroHabitacionesMax) {
	        habitaciones.add(habitacion);
	    }else {
	    	System.out.println("Te has pasado del número de habitaciones posibles");
	    }
	}

	public int getNumeroHabitacionesMax() {
		return numeroHabitacionesMax;
	}

	public void setNumeroHabitacionesMax(int numeroHabitacionesMax) {
		this.numeroHabitacionesMax = numeroHabitacionesMax;
	}

	public int getNumeroBaños() {
		return numeroBaños;
	}

	public void setNumeroBaños(int numeroBaños) {
		this.numeroBaños = numeroBaños;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public String toString() {
		String resultado = "Casa [numeroHabitacionesMax=" + numeroHabitacionesMax + ", numeroBaños=" + numeroBaños
				+ ", numeroPlantas=" + numeroPlantas + "]";
		for(Habitacion h : habitaciones) {
			resultado += "\n  " + h;
		}
		return resultado;
	}
	
	
}
