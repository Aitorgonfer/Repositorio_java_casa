package ejercicios;

import java.util.Scanner;

public class NumeroSecreto {

	public static void adivinarNumero() {
		Scanner sc = new Scanner(System.in);
		int intento=10;
		int secreto = (int) (Math.random()*100)+1;

		boolean heGanado=false;

		while (intento!=0) {
			System.out.println("Introduce un número y te digo si es mayor o no: ");
			System.out.println("Te quedan " + intento + " intentos.");
			int numero = sc.nextInt();
			intento--;
			if (numero < secreto) {
			    System.out.println("El secreto es MAYOR (tu número es muy pequeño).");
			} 
			else if (numero > secreto) {
			    System.out.println("El secreto es MENOR (tu número es muy grande).");
			} 
			else {
			    System.out.println("¡HAS ACERTADO! 🎉");
			    heGanado=true;
			    break; // Esto nos saca del while
			}
		}
		if (heGanado==false) {
			System.out.print("Has perdido te quedaste sin intentos. El numero secreto era: " + secreto);
		}
	}
	public static void main(String[] args) {

		adivinarNumero();

	}

}