package hotelBoutique;

import java.util.ArrayList;

public class Hotel {

	private Habitacion[] habitaciones;
	private Reserva[] reservas;
	private int contadorReservas;

	public Hotel() {
		this.habitaciones = new Habitacion [10];
		this.reservas = new Reserva [50];
		this.contadorReservas = 0;
		inicializarHabitaciones();
	}

	private void inicializarHabitaciones() {
		// 8 Habitaciones Dobles
		habitaciones[0] = new HabitacionDoble(101, 80.0, "Habitación doble estándar");
		habitaciones[1] = new HabitacionDoble(102, 80.0, "Habitación doble con vistas");
		habitaciones[2] = new HabitacionDoble(103, 90.0, "Habitación doble premium");
		habitaciones[3] = new HabitacionDoble(104, 85.0, "Habitación doble interior");
		habitaciones[4] = new HabitacionDoble(105, 80.0, "Habitación doble estándar");
		habitaciones[5] = new HabitacionDoble(106, 95.0, "Habitación doble superior");
		habitaciones[6] = new HabitacionDoble(107, 80.0, "Habitación doble estándar");
		habitaciones[7] = new HabitacionDoble(108, 88.0, "Habitación doble con terraza");
		// 2 Suites
		habitaciones[8] = new Suite(201, 200.0, "Vistas al mar", "Suite Imperial", 2, "Jacuzzi, Minibar");
		habitaciones[9] = new Suite(202, 250.0, "Ático", "Suite Real", 4, "Jacuzzi, Minibar, Terraza privada");

	}

	public boolean agregarReserva(Reserva r) {
		if (contadorReservas >= reservas.length) return false;
		reservas[contadorReservas] = r;
		contadorReservas++;
		return true;
	}


	public boolean consultarDisponibilidad(int numeroHabitacion) {
		for (int i=0; i < contadorReservas; i++) {
			if(reservas[i].getHabitacion().getNumero() == numeroHabitacion) {
				return false;
			}
		}return true;
	}

	public ArrayList<Habitacion> obtenerHabitacionesDisponibles(String tipo) {
        ArrayList<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion h : habitaciones) {
            boolean esDelTipo = tipo.equalsIgnoreCase("doble") && h instanceof HabitacionDoble
                    || tipo.equalsIgnoreCase("suite") && h instanceof Suite;
            if (esDelTipo && consultarDisponibilidad(h.getNumero())) {
                disponibles.add(h);
            }
        }
        return disponibles;
    }











}