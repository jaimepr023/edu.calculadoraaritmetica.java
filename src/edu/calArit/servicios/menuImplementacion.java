package edu.calArit.servicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz {
	
	public void mensajeBienvenida() {
		
		System.out.println("Bienvenido a la calculadora aritmetica.\n"+"Elija una opción:");
	}

	
	public int menuApp(Scanner seleccionarOpcion ) {
		
		int seleccionadaOpcion;
		System.out.println("----------------------------------");
		System.out.println("Caso 0. Cerrar menú.");
		System.out.println("Caso 1. Suma.");
		System.out.println("Caso 2. Resta.");
		System.out.println("Caso 3. Multiplicar.");
		System.out.println("Caso 4. Dividir.");
		System.out.println("Caso 5. Módulo.");
		System.out.println("----------------------------------");

		seleccionadaOpcion = seleccionarOpcion.nextInt();
		return seleccionadaOpcion;
	}

}
