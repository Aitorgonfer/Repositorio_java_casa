package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
	
	public static void main(String[] args) {
		
		// El objeto Scanner se llama 'escanner', no 'scanner'
		Scanner escanner = new Scanner(System.in);
		Random random = new Random();
		
		final int MAX_INTENTOS = 10;
        final int LIMITE_SUPERIOR = 100;
        int intentosRestantes = MAX_INTENTOS;
        int intentoActual = 0;
        boolean adivinado = false;
		
        int numeroSecreto = random.nextInt(LIMITE_SUPERIOR) + 1;
        
        System.out.println("🎉 ¡Bienvenido al juego Adivina el Número! 🎉");
        System.out.println("He generado un número entre 1 y " + LIMITE_SUPERIOR + ". Tienes " + MAX_INTENTOS + " intentos para adivinarlo.");
        System.out.println("---");
        
        while (intentosRestantes > 0 && !adivinado ) {
        	System.out.println("\nIntento " + (intentoActual + 1) + "/" + MAX_INTENTOS + ". Te quedan " + intentosRestantes + " intentos.");
            System.out.print("Introduce tu número: ");
            
            // CORRECCIÓN 1: 'escanner' en lugar de 'scanner'
            // CORRECCIÓN 2: 'hasNextInt()' en lugar de 'NextInt()' (la 'h' es minúscula y se usa 'has')
            if (escanner.hasNextInt()) {
            	int suposicion = escanner.nextInt(); // CORRECCIÓN 3: 'escanner' en lugar de 'scanner'
            	intentoActual++;
            	intentosRestantes--;
            	
            if (suposicion == numeroSecreto) {
            	adivinado = true;
            } else if (suposicion < numeroSecreto) {
            	// CORRECCIÓN 4: Se eliminaron las comillas y barras invertidas de más.
            	System.out.println("El número a adivinar es **MAYOR** que " + suposicion + ".");
            } else {
            	// CORRECCIÓN 4: Se eliminaron las comillas y barras invertidas de más.
            	System.out.println("El número a adivinar es **MENOR** que " + suposicion + ".");
            	
            }
            
           } else {
        	   // CORRECCIÓN 5: Se eliminaron las comillas del final del string.
        	   System.out.println("⚠️ Entrada no válida. Por favor, introduce un número entero.");
        	   // CORRECCIÓN 6: El método 'next()' se llama sobre la INSTANCIA 'escanner', no sobre la clase 'Scanner'.
        	   escanner.next();
          
         	
            }
            
        }
		
        System.out.println("\n--- FIN DEL JUEGO ---");
        if (adivinado) {
            System.out.println("🏆 ¡Felicidades! ¡Has adivinado el número " + numeroSecreto + "!");
            System.out.println("Lo lograste en " + intentoActual + " intentos.");
        } else {
            System.out.println("😔 ¡Oh no! Has agotado tus " + MAX_INTENTOS + " intentos.");
            System.out.println("El número secreto era **" + numeroSecreto + "**.");
        }
        
        // CORRECCIÓN 7: Se cierra la instancia 'escanner'
        escanner.close();
       
	
		
	}

}