package practicaTest;

//1. ¿Cómo indicamos que UsuarioPremium hereda de Usuario?
public class UsuarioPremium extends Usuario {

	public UsuarioPremium(String email, String password) {
		// 2. ¿Cómo le pasamos el email y password al constructor del padre?
		super(email, password); 
	}

	// 3. Queremos cambiar el comportamiento de reproducirVideo
	@Override // Pon aquí la anotación de seguridad
	public void reproducirVideo(String titulo) {
		System.out.println("Reproduciendo en 4K y sin anuncios: " + titulo);
	}
	
	public void descargar() {
		System.out.println("Descargando video para ver sin conexión...");
	}
}