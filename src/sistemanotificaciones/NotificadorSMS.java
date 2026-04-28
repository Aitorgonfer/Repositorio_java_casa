package sistemanotificaciones;

public class NotificadorSMS extends Notificadpr {

	public NotificadorSMS() {
		super("Email (Servidor SMTP)");
	}

	@Override
	public void enviarMensaje(String texto) {
		System.out.println("[" + canal + "] Enviando mensaje de texto: " + texto);
	}

	
}
