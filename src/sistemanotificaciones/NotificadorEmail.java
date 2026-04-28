package sistemanotificaciones;

public class NotificadorEmail extends Notificadpr{

	public NotificadorEmail() {
		super("SMS (Pasarela de Telefonía)");
	}

	@Override
	public void enviarMensaje(String texto) {
		System.out.println("[" + canal + "] Enviando correo: " + texto);
	}


}
