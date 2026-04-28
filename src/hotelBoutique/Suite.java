package hotelBoutique;

public class Suite extends Habitacion{

	private String nombre;
	private int numeroPlazas; 
	private String servicios;
	
	public Suite(int numero, double precioNoche, String descripcion, String nombre, int numeroPlazas, String servicios) {
		super(numero, precioNoche, descripcion);
		this.nombre = nombre;
		this.numeroPlazas = numeroPlazas;
		this.servicios = servicios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	public String getServicios() {
		return servicios;
	}

	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

}
