package edu.calArit.servicios;

import java.util.Scanner;
/**
 * Interfaz donde se encuentra nuestro metodos de operaciones.
 * @author jpr-4/11-23
 */
public interface operadorInterfaz {
	/**
	 * metodo que pide un numero al usuario
	 * @author jpr-4/11-23
	 * @param num
	 * @return de vuelve el numero que ha dado el usuario
	 */
	public float pedirNumero(Scanner num);
	
	/**
	 * Metodo que reliza la suma de dos numeros y lo imprime por pantalla.
	 * @author jpr-4/11-23
	 */
	public void suma() ;
	
	/**
	 * Metodo que reliza la resta de dos numeros y lo imprime por pantalla.
	 * @author jpr-4/11-23
	 */
	public void resta() ;
	
	/**
	 * Metodo que reliza la multiplicacion de dos numeros y lo imprime por pantalla.
	 * @author jpr-4/11-23
	 */
	public void multiplicar() ;
	
	/**
	 * Metodo que reliza la division de dos numeros y lo imprime por pantalla.
	 * @author jpr-4/11-23
	 */
	public void dividir() ;
	
	/**
	 * Metodo que reliza el modulo de dos numeros y lo imprime por pantalla.
	 * @author jpr-4/11-23
	 */
	public void modulo() ;
	

}
