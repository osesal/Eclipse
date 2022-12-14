package programas;

import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		String nombre = ("");
		int base = 0;
		int altura = 0;
		int edad = 0;
		
		
		System.out.println("Introduce tu nombre:");
		nombre = teclado.nextLine();
		
		System.out.println("Introduce la base del triangulo");
		base = teclado.nextInt();
		
		System.out.println("Introduce la altura del triangulo");
		altura = teclado.nextInt();  
		
		System.out.println("Introduce tu edad");
		edad = teclado.nextInt();
		
		saludar(nombre);
		calcular(base, altura);
		mayor(edad);
	}
	
	public static void saludar(String saludo) {
		
		System.out.println("Hola " + saludo);
	}
	
	public static void calcular(int base, int altura) {
		
		int area = (base * altura)/2;
		System.out.println("La area del triangulo es: " + area);
	}
	
	public static void mayor(int edad) {
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}

}
