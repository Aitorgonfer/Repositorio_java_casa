package ejercicios;

import java.util.Scanner;

public class Blackjack {

	public static void jugarBlackjack() {
		Scanner sc = new Scanner(System.in);
		int tusPuntos=0;
		int opcion=1;
		do {
			int carta=(int)(Math.random()*10)+1;
			tusPuntos=tusPuntos+carta;
			System.out.println("Te ha salido un " + carta + " y tienes " + tusPuntos + ".");
			if (tusPuntos>21) {
				System.out.print("Te has pasado, has perdido.");
				opcion=0;
			}else { 
				System.out.print("Quieres otra carta? (si=1/no=0): ");
				opcion=sc.nextInt();
			}
		}while (opcion==1);

		if(tusPuntos<=21) {
			int puntosBanca=0;

			while (puntosBanca<17) {
				int cartaBanca=(int)(Math.random()*10)+1;
				puntosBanca=puntosBanca+cartaBanca;
				System.out.println("Los puntos de la banca son " + puntosBanca + " y le ha tocado un " + cartaBanca);
			}
			if (puntosBanca>21) {
				System.out.print("Has ganado, la banca se paso de 21");
			}else if (puntosBanca<tusPuntos) {
				System.out.print("Has ganado, has sacado mas puntos que la banca");
			}else if(puntosBanca>tusPuntos) {
				System.out.print("Has perdido la banca saco más puntos que tú");
			}else
				System.out.print("Habeis sacado los mismos puntos, habeis empatado");
			}
		}
	public static void main(String[] args) {
		jugarBlackjack();
	}
}