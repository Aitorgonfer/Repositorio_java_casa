package copiaExamen2Ev;

public class Calculadora {

	public static double notaMasAlta(Grupo grupo) {
		double mayor = 0;
		for(Double  nota : grupo.getNotas()) {
			if(nota > mayor) {
				mayor = nota;
			}
		}return mayor;
	}


	public static double notaMasBaja(Grupo grupo) {
		double menor=10;
		for(Double  nota : grupo.getNotas()) {
			if(nota < menor) {
				menor = nota;
			}
		}return menor;
	}


	public static int numAprobados(Grupo grupo) {
	int contador = 0;
		for(Double  nota : grupo.getNotas()) {
			if(nota >= 5) {
				contador++;
			}
		}return contador;
	}
}
