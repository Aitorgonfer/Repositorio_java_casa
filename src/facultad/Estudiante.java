package facultad;

public class Estudiante {

	private String nombre;
	
	static int contadorMatriculas = 1000;
	
	private int matricula; // Cada estudiante tiene la suya propia

    public Estudiante(String nombre) {
        this.nombre = nombre;
        // Usamos el contador global y lo aumentamos para el próximo
        this.matricula = contadorMatriculas; 
        contadorMatriculas++; 
    }
    
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }
    
    public int getMatricula() {
    	return matricula;
    }
}