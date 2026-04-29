package copiaExamen2Ev;

import java.util.ArrayList;

public class Moto extends Vehiculo{

	private int cilindrada;
	private boolean carenado;
	private int maxAccesorios;
	private ArrayList<Accesorio> accesorios;

	public Moto(String matricula, String marca, double precioDia, double kilometros, int cilindrada, boolean carenado, int maxAccesorios) {
		super(matricula, marca, precioDia, kilometros);
		this.cilindrada = cilindrada;
		this.carenado = carenado;
		this.maxAccesorios = maxAccesorios;
		this.accesorios = new ArrayList<>();

	}

	public void añadirAccesorio(Accesorio accesorio) {
		if( accesorios.size() < maxAccesorios) {
			accesorios.add(accesorio);
		}else {
			System.out.println("Te has pasado del número de accesorios posibles");
		}
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public boolean isCarenado() {
		return carenado;
	}

	public int getMaxAccesorios() {
		return maxAccesorios;
	}

	public ArrayList<Accesorio> getAccesorios() {
		return accesorios;
	}

	@Override
	public String toString() {
		String resultado = "Moto [" + super.toString() + "cilindrada=" + cilindrada + ", carenado=" + carenado + "]\n";
		for(Accesorio a : accesorios) {
			resultado += " " + a.toString() + "\n";
		}
		return resultado;
	}



}
