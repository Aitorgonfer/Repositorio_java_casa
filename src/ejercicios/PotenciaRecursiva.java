package ejercicios;

import java.util.Scanner;

public class PotenciaRecursiva {

	public static int calcularPotencia(int base, int exp) {

		if (exp == 0) {
			return 1;
		}else
			return base*calcularPotencia(base,exp -1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una base y un exponente y te digo la potencia: ");
		int base = sc.nextInt();
		int exp = sc.nextInt();
		System.out.print("El resultado de la potencia de base " + base + " y de exponente " + exp +
				" es: " + calcularPotencia(base,exp));
	}
}