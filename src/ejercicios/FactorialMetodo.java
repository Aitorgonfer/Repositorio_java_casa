package ejercicios;

import java.util.Scanner;

public class FactorialMetodo {

	public static int calcularFactorial(int numero) {

		if (numero== 0) {
			return 1;
		}else
			return numero*calcularFactorial(numero-1);				
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número y te digo su factorial: ");
		int numero = sc.nextInt();
		System.out.print("El factorial del número " + numero + " es " + calcularFactorial(numero));
	}

}