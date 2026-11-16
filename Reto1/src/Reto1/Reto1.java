package Reto1;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		// scanner para leer lo que le introduces
		Scanner sc = new Scanner(System.in);
		// crear la variable n
		int n;
		
	// repite el bucle hasta que se introduzca el 9 (salir)
	do {
		//mostrar el menú de opciones
		System.out.println("Elegir una opción: ");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Par");
		System.out.println("6. Impar");
		System.out.println("7. Positivo");
		System.out.println("8. Negativo");
		System.out.println("9. Salir");
		//lee el valor que introduces y lo convierte a numero
		n = Integer.parseInt(sc.nextLine());
		//si pones el 1 hace "suma"
		if (n==1) {
			System.out.println("Sumar: "+funciones1.suma(4, 2));
		}
		//si pones el 2 hace "resta"
		if (n==2) {
			System.out.println("Restar: "+funciones1.resta(4, 2));
		}
		//si pones el 3 hace "multiplicar"
		if (n==3) {
			System.out.println("Multiplicar: "+funciones2.multiplicar(4, 2));
		}
		//si pones el 4 hace "dividir"
		if (n==4) {
			System.out.println("Dividir: "+funciones2.dividir(4, 2));
		}
		//si pones el 5 hace "esPar"
		if (n==5) {
			System.out.println("Es par: "+funciones1.esPar(4));
		}
		//si pones el 6 hace "esImpar"
		if (n==6) {
			System.out.println("Es impar: "+funciones1.esImpar(3));
		}
		//si pones el 7 hace "esPositivo"
		if (n==7) {
			System.out.println("Es positivo: "+funciones2.esPositivo(4));
		}
		//si pones el 8 hace "esNegativo"
		if (n==8) {
			System.out.println("Es negativo: "+funciones2.esNegativo(-2));
		}
	} while (n!=9);
		//si pones el 9 sale del bucle y cierra el programa
	}

}
