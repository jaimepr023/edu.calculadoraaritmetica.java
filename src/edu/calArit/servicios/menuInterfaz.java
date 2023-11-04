package edu.calArit.servicios;

import java.util.Scanner;

public interface menuInterfaz {
	/**
	 * metodo que muestra el mensaje de bienvenida por pantalla.
	 * @author jpr-4/11-23
	 */
	
	public void mensajeBienvenida();
	
	/**
	 * Se trata de nuestro menu donde devolvera la opcion que hqa elegido.
	 * @author jpr-4/11-23
	 * @return numero entero que da la opcion del usuario
	 */
	public int menuApp(Scanner seleccionarOpcion);

}
