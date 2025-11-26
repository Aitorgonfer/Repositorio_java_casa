package ejercicios;

import java.util.Scanner;

public class ConvertidorTemperatura {

	public static double calcularTemperatura(double temperatura) {
	double F;
	F=(temperatura * 1.8)+32;
	return F;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.print("Dime una temperatura en Celsius y te lo paso a Fahremheit.");
	double t = sc.nextDouble();
		System.out.print("El resultado de la conversión es: " + calcularTemperatura(t));
	}
}