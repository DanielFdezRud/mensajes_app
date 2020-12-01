package mensajes_app.main;

import java.util.Scanner;

public class MensajesService {

		public static void crearMensaje() {
			Scanner input = new Scanner(System.in);
			String mensaje, nombre;
			
			System.out.println("Escribe el mensaje:");
			
			mensaje = input.nextLine();
			
			System.out.println("Tu nombre:");
			
			nombre = input.nextLine();
			
			Mensajes registro = new Mensajes();
			registro.setMensaje(mensaje);
			registro.setAutor_mensaje(nombre);
			MensajesDAO.crearMensajeDB(registro);			
		}
		
		public static void listarMensajes() {
			MensajesDAO.leerMensajeDB();
		}
		
		public static void borrarMensajes() {
			
		}
		
		public static void editarMensaje() {
			
		}
}
