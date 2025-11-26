package ejercicios;

import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
	
	public static void main(String[] args) {
	Scanner escaner=new Scanner(System.in);
	
	System.out.println("Introduce un número entero y te digo su factorial");
	if (!escaner.hasNextInt()) {
		System.out.println("Error: Debes introducir un número entero válido.");
		escaner.close();
		return;
	}
	
	int numero=escaner.nextInt();
	
	if (numero < 0) {
		System.out.println("El número es negativo y no tiene factorial");
	}else {
	 if (numero == 0) {
	 System.out.println("El factorial de 0 es: 1");
		} else {
			BigInteger factorial = BigInteger.ONE;
			
			
			for (int i =1; i<=numero; i++){
				BigInteger iBig = BigInteger.valueOf(i);
				factorial = factorial.multiply(iBig);
			}
			System.out.println("\nEl factorial de " + numero + " es: " + factorial);
		}
	}
		
	escaner.close();
	}

}
