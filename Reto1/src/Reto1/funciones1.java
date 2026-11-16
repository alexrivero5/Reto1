package Reto1;

public class funciones1 {
	//suma de dos enteros y da una respuesta
	public static int suma(int n1, int n2) {
		return n1+n2;
	}
	//resta de dos enteros y da una respuesta

	public static int resta (int n1, int n2) {
		return n1-n2;
	}
	//te indica del numero que imprime si es par
	public static boolean esPar (int n1) {
		if (n1%2==0) {
			return true;
		}
		return false;		
	}
//te indica del numero que imprime si es impar
	public static boolean esImpar (int n1) {
		if (n1%2!=0) {
			return true;
		}
		return false;		
	}
	 

}
