package edu.calArit.controladores;

import java.util.Scanner;

import edu.calArit.servicios.menuImplementacion;
import edu.calArit.servicios.menuInterfaz;
import edu.calArit.servicios.operadorImplementacion;
import edu.calArit.servicios.operadorInterfaz;

/**
 * clase inicial donde se encuentra nuestro metodo main.
 * @author jpr-4/11-23
 */
public class inicioApp {

	/**
	 * Metodo principal denuestra aplicacion
	 * @author jpr-4/11-23
	 * @param args
	 */
	public static void main(String[] args) {
		
		menuInterfaz mi = new menuImplementacion();
		operadorInterfaz op = new operadorImplementacion();
		
		mi.mensajeBienvenida();
		int opcionSeleccionada;
		boolean cerrarMenu=false;
		Scanner seleccionarOpcionM = new Scanner(System.in);
		
		
		while(!cerrarMenu) 
		{
			
			opcionSeleccionada=mi.menuApp(seleccionarOpcionM);
			
			switch(opcionSeleccionada) 
			{
			case 0:
				System.out.println("Se ejecuta caso 0");
				System.out.println("[INFo]-Se va a cerrar la aplicación.");
				cerrarMenu=true;
				break;
			case 1:
				System.out.println("Se ejecuta caso 1");
				op.suma();
				break;
			case 2:
				System.out.println("Se ejecuta caso 2");
				op.resta();
				break;
			case 3:
				System.out.println("Se ejecuta caso 3");
				op.multiplicar();
				break;
			case 4:
				System.out.println("Se ejecuta caso 4");
				op.dividir();
				break;
			case 5:
				System.out.println("Se ejecuta caso 5");
				op.modulo();
				break;
			default:
				System.out.println("[INFO]-Error no se ha elegido ninguna de las anteriores opciones. Vuelve a intentarlo");
					break;
			}
		}

	}

}
