package ejercicios;

import java.util.Scanner;

public class DetectorCapicuas {

	public static boolean detectorCapicua(int numero) {
		
		int invertido=0;
		int auxiliar= numero;
		while (auxiliar>0) {
			int cifra =auxiliar%10;
			invertido = (invertido * 10 + cifra);
			auxiliar = auxiliar/10;
		}
		if (invertido==numero) {
			return true;
		}else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.print("Introduce un número y te digo si es capicua: ");
	int numero = sc.nextInt();
	System.out.print("¿El número que has introducido es capicua?: " + detectorCapicua(numero));
	}
}