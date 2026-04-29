package pruebaDeExamen2ev;

public class Habitacion {
	
	private int superficie;
	private int numeroVentanas;
	private String uso;
	
	public Habitacion(int superficie, int numeroVentanas, String uso) {
		this.superficie = superficie;
		this.numeroVentanas = numeroVentanas;
		this.uso = uso;
	}

	public int getSuperficie() {
		return superficie;
	}

	public int getNumeroVentanas() {
		return numeroVentanas;
	}

	public String getUso() {
		return uso;
	}

	@Override
	public String toString() {
		return "Habitacion [superficie=" + superficie + ", numeroVentanas=" + numeroVentanas + ", uso=" + uso + "]";
	}
	
	
}
