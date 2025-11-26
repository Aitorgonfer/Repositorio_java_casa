package ejercicios;

import java.util.Scanner;

public class ConstructorEscalera {

	public static void constructorEscalera(int cantidad) {

		for(int i=0;i<=cantidad;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Dime de cuantas filas quieres la escalera: ");
		int escaleras = sc.nextInt();
		System.out.print("Esta es tu escalera: ");
		constructorEscalera(escaleras);
	}
}