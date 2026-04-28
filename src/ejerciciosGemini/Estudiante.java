package ejerciciosGemini;

public class Estudiante {

	private String estudiante;
	private double notaMedia;
	
	public Estudiante(String estudiante, double notaMedia) {
		this.estudiante = estudiante;
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Estudiante [estudiante=" + estudiante + ", notaMedia=" + notaMedia + "]";
	}
}
