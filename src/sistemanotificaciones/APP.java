package sistemanotificaciones;

import java.util.ArrayList;

public class APP {

	public static void main(String[] args) {

		//Notificadpr n = new Notificadpr("Genérico");
		
		ArrayList<Notificadpr> listaNotificaciones = new ArrayList<>();
		
		listaNotificaciones.add(new NotificadorEmail());
        listaNotificaciones.add(new NotificadorSMS());
        
        String mensajeUrgente = "Alerta de seguridad: Intento de acceso detectado.";
        
        System.out.println("--- Iniciando Sistema de Alertas ---");
        for (Notificadpr n : listaNotificaciones) {
            n.enviarMensaje(mensajeUrgente);
        }
	}

}
