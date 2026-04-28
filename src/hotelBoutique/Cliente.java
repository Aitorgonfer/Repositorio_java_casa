package hotelBoutique;

public class Cliente extends Huesped{

	private String tarjetaCredito;

	public Cliente(String nombre, String DNI, int edad, String tarjetaCredito) {
		super(nombre, DNI, edad);
		this.tarjetaCredito = tarjetaCredito;
	}

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	
}
