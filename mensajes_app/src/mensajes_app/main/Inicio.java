package mensajes_app.main;

import java.util.Scanner;

public class Inicio {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion = 0;
		
		do {
			System.out.println("_______________________");
			System.out.println("Aplicacion de mensajes");
			System.out.println("1. Crear mensaje");
			System.out.println("2. Listar mensajes");
			System.out.println("3. Editar mensaje");
			System.out.println("4. Eliminar mensaje");
			System.out.println("5. Salir");
			
			System.out.println("Introduce un valor: ");
			opcion = input.nextInt();
			
			switch (opcion) {
				case 1:
					MensajesService.crearMensaje();
					break;
				case 2:
					MensajesService.listarMensajes();
					break;
				case 3:
					MensajesService.editarMensaje();
					break;
				case 4:
					MensajesService.borrarMensajes();
					break;
				default:
					break;
			}
			
		}while(opcion != 5);
	}
}
