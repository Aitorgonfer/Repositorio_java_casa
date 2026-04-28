package hotelBoutique;

public class Servicio implements Cobrable{

	private String nombre;
	private double precio;
	
	@Override
	public double getImporte() {
		return precio;
	}

	public Servicio(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
