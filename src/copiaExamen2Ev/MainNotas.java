package copiaExamen2Ev;

public class MainNotas {

	public static void main(String [] args) {
		Grupo grupo1 = new Grupo("Aitor");
		grupo1.añadirNota(4.45);
		grupo1.añadirNota(2.23);
		grupo1.añadirNota(6);
		grupo1.añadirNota(6.78);
		grupo1.añadirNota(5);
		
		double[] notas = {3.0, 7.5, 5.0, 9.0, 2.5, 6.0};
        Grupo grupo2 = new Grupo("4B", notas);
        
        System.out.println("Grupo: " + grupo2.getNombre());
        System.out.println("Nota más alta: " + Calculadora.notaMasAlta(grupo1));
        System.out.println("Nota más baja: " + Calculadora.notaMasBaja(grupo1));
        System.out.println("Aprobados: " + Calculadora.numAprobados(grupo1));
		
		System.out.println("Nota más alta: " + Calculadora.notaMasAlta(grupo1));
		System.out.println("Nota más baja: " + Calculadora.notaMasBaja(grupo1));
		System.out.println("Aprobados: " + Calculadora.numAprobados(grupo1));
		
	}
}
