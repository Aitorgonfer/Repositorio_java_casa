package copiaExamen2Ev;

public class Coche extends Vehiculo{

	private int numPuertas;
	private boolean aireAcondicionado;
	
	public Coche(String matricula, String marca, double precioDia, double kilometros, int numPuertas,
			boolean aireAcondicionado) {
		super(matricula, marca, precioDia, kilometros);
		this.numPuertas = numPuertas;
		this.aireAcondicionado = aireAcondicionado;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	@Override
	public String toString() {
		return "Coche [" + super.toString() + "puertas=" + numPuertas + ", aireAcondicionado=" + aireAcondicionado + "]";
	}
	
	
	
}
