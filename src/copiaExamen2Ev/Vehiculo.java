package copiaExamen2Ev;

import java.util.Objects;

public abstract class Vehiculo {

	private String matricula;
	private String marca;
	private double precioDia;
	private double kilometros;
	
	public Vehiculo(String matricula, String marca, double precioDia, double kilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.precioDia = precioDia;
		this.kilometros = kilometros;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrecioDia() {
		return precioDia;
	}

	public double getKilometros() {
		return kilometros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
	    return "matricula=" + matricula + ", marca=" + marca 
	            + ", precio=" + precioDia + "€/día, km=" + kilometros;
	}
	
	
	
}
