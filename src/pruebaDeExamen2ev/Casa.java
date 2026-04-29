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

	public int getNumeroBaños() {
		return numeroBaños;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	@Override
	public String toString() {
        String resultado = "Casa [id=" + getIdentificador() + ", dir=" + getDireccion()
                + ", precio=" + getPrecioVenta() + "€, m²=" + getMetrosCuadrados()
                + ", hab=" + numeroHabitacionesMax + ", baños=" + numeroBaños 
                + ", plantas=" + numeroPlantas + "]\n";
        for (Habitacion h : habitaciones) {
            resultado += "  " + h.toString() + "\n";
        }
        return resultado;
	}
	
	
}
