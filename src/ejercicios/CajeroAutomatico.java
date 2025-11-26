package ejercicios;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void cajeroAutomatico() {
		Scanner sc = new Scanner(System.in);
		int saldo = 1000;
		int opcion=0;
		
		

		while(opcion!=4) {
		System.out.println("Elige una de las opciones:");
		System.out.println("1.Consultar saldo");
		System.out.println("2.Ingresar");
		System.out.println("3.Retirar");
		System.out.println("4.Salir");
			opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Tu saldo es: " + saldo);
			break;
		case 2:
			System.out.println("Introduce la cantidad que quieres ingresar: ");
			int ingreso = sc.nextInt();
			saldo = saldo+ingreso;
			break;
		case 3:
			System.out.println("Introduce la cantidad que quieres retirar: ");
			int retiro = sc.nextInt();
			if (retiro<=saldo) {
			saldo = saldo-retiro;	
			}else
				System.out.print("Introduce una cantidad válida");
			break;
		case 4:
			System.out.println("Hasta la proxima!");
			break;
		default:
			System.out.println("Opción no válida");
			}

		}
	}
	public static void main(String[] args) {
		cajeroAutomatico();


	}

}