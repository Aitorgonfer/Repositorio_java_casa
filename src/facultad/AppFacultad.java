package facultad;

public class AppFacultad {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Hector");
		Estudiante e2 = new Estudiante("Mauricio");
		Estudiante e3 = new Estudiante("Gay");
		
		System.out.println(e1.getNombre() + " tiene la matrícula: " + e1.getMatricula());
		System.out.println(e2.getNombre() + " tiene la matrícula: " + e2.getMatricula());
		System.out.println(e3.getNombre() + " tiene la matrícula: " + e3.getMatricula());
		
		System.out.println("Proxima matrícula: " + Estudiante.contadorMatriculas);
	}
}