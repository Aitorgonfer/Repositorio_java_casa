package ejerciciosGemini;

public class MainFacultad {

	public static void main(String[] args) {
		Facultad facultad = new Facultad();
		
		Estudiante e1 = new Estudiante("Ana", 8.5);
		Estudiante e2 = new Estudiante("Carlos", 7.67);
		
		facultad.agregarEstudiante(e1);
        facultad.agregarEstudiante(e2);

        facultad.mostrarEstudiante();
	}

}
