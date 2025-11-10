package ejercicios;

import java.util.Scanner;

public class MCDEduclides {
	
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("--- 🔎 Calculadora de MCD usando el Algoritmo de Euclides 🔎 ---");
		
		System.out.print("Introduce el primer número entero (a): ");
		if (!scanner.hasNextInt()) {
			System.out.println("Error: Debes introducir un número entero válido.");
			scanner.close();
			return;
		}
		
		int a = scanner.nextInt();
		
		System.out.print("Introduce el segundo número entero (b): ");
		if (!scanner.hasNextInt()) {
			System.out.println("Error: Debes introducir un número entero válido.");
			scanner.close();
			return;
		}
		
		int b = scanner.nextInt();
		
		if (a==0 && b==0) {
			System.out.println("El MCD de 0 y 0 es indefinido (o a veces se considera 0).");
		}else {
			int mcd = calcularMCD(a, b);
			System.out.println("\n✅ El Máximo Común Divisor (MCD) de " + a + " y " + b + " es: **" + mcd + "**");
		}
		
		scanner.close();
		
	}
	
	
	public static int calcularMCD(int a, int b) {
		while (b !=0) {
			int resto = a % b;
			a =b;
			b = resto;
			
		}
		
		return a;
	}
}
