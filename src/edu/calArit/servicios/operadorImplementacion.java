package edu.calArit.servicios;

import java.util.Scanner;

public class operadorImplementacion implements operadorInterfaz{
	
	Scanner num = new Scanner(System.in);
	
	public float pedirNumero(Scanner num) {
		float num1 = num.nextFloat();
		return num1;
	}


	public void suma() {
		System.out.println("Dame un numero:");
		float num1=pedirNumero(num);
		System.out.println("Dame un numero:");
		float num2=pedirNumero(num);
		System.out.println("El resultado de la suma es:");
		System.out.println(num1+num2);

		
	}



	public void resta() {
		System.out.println("Dame un numero:");
		float num1=pedirNumero(num);
		System.out.println("Dame un numero:");
		float num2=pedirNumero(num);
		System.out.println("El resultado de la resta es:");
		System.out.println(num1-num2);
		
	}



	public void multiplicar() {
		System.out.println("Dame un numero:");
		float num1=pedirNumero(num);
		System.out.println("Dame un numero:");
		float num2=pedirNumero(num);
		System.out.println("El resultado de la multiplicacion es:");
		System.out.println(num1*num2);
		
	}



	public void dividir() {
		System.out.println("Dame un numero:");
		float num1=pedirNumero(num);
		System.out.println("Dame un numero:");
		float num2=pedirNumero(num);
		System.out.println("El resultado de la división es:");
		System.out.println(num1/num2);
		
	}



	public void modulo() {
		System.out.println("Dame un numero:");
		float num1=pedirNumero(num);
		System.out.println("Dame un numero:");
		float num2=pedirNumero(num);
		System.out.println("El resultado del módulo es:");
		System.out.println(num1%num2);
		
	}
	

}
