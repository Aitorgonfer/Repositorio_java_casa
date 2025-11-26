package ejercicios;

import java.util.Scanner;

public class AreaPerimetro {

	public static double perimetro(double radio) {
		return 2*Math.PI*radio;
	}
	
	public static double area(double radio) {
		return Math.PI*Math.pow(radio, 2);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el radio de la circunferencia: ");
		double radio=sc.nextDouble();	
		
		double resultadoArea = area(radio);
		double resultadoPerimetro = perimetro(radio);
		
		
		System.out.println("Área de la circunferencia: " + resultadoArea);
		System.out.println("Perímetro de la circunferencia: " + resultadoPerimetro);
		
		
	}
}
