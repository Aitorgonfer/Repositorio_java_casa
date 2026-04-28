package sistemanotificaciones;

public abstract class Notificadpr {

	protected String canal;

	public Notificadpr(String canal) {
		this.canal = canal;
	}

	public abstract void enviarMensaje(String texto);
}
