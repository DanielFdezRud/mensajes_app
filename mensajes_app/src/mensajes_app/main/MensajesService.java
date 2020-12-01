package mensajes_app.main;

import java.util.Scanner;

public class MensajesService {

		static Scanner input = new Scanner(System.in);
		public static void crearMensaje() {
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
			System.out.println("Id del mensaje a borrar: ");
			int id_mensaje = input.nextInt();
			
			MensajesDAO.borrarMensajeDB(id_mensaje);
		}
		
		public static void editarMensaje() {
			
		}
}
