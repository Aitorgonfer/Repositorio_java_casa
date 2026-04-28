package ejerciciosGemini;

public class Motor {

	private boolean encender;
	
	public void encender() {
		this.encender=true;
	}
	
	public void apagar() {
		this.encender=false;
	}

	@Override
	public String toString() {
		return "Motor [encender=" + encender + "]";
	}

	
}
