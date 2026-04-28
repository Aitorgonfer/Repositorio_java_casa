package ejerciciosGemini;

public class Monedero {

	private double saldo;

	public Monedero() {
		this.saldo=0;
	}
	
	public void meterDinero(double cantidad) {
		if(cantidad>0) {
			this.saldo=this.saldo + cantidad;
			System.out.println("Has ingresado: " + cantidad + "€");
		}else {
			System.out.println("Mete una cantidad correcta.");
		}
	}
	
	public void sacarDinero(double cantidad) {
		if(saldo>=cantidad) {
			this.saldo=this.saldo-cantidad;
			System.out.println("Has retirado: " + cantidad + "€");
		}else {
			System.out.println("Error. Dinero negativo.");
		}
	}

	@Override
	public String toString() {
		return "Monedero [saldo=" + saldo + "]";
	}
	
}
