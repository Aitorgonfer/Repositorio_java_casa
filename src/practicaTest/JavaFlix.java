package practicaTest;

import java.util.ArrayList;

public class JavaFlix {

	public static void main(String[] args) {
		// Creamos una lista que SOLO acepta objetos de tipo Usuario
		ArrayList<Usuario> listaUsuarios = new ArrayList<>();

		UsuarioPremium u1= new UsuarioPremium("Ana", "1234");
		u1.reproducirVideo("matrix");
		u1.descargar();
		// Intentamos añadir diferentes tipos
		listaUsuarios.add(new Usuario("gratis@mail.com", "123"));
		listaUsuarios.add(new UsuarioPremium("vip@mail.com", "456"));
		listaUsuarios.add(new UsuarioPremium("vip@mail.com", "456"));
		
		for (Usuario u : listaUsuarios) {
		    // 1. Todos pueden reproducir porque el método está en el padre
		    u.reproducirVideo("Interestelar");

		    // 2. EL ARREGLO PARA TU ERROR:
		    // Preguntamos si el objeto que hay dentro de 'u' es un Premium
		    if (u instanceof UsuarioPremium) {
		        // Hacemos "Casting": Convertimos temporalmente a 'u' en un UsuarioPremium
		        UsuarioPremium vip = (UsuarioPremium) u; 
		        vip.descargar(); 
		    }
		}
	}
}
