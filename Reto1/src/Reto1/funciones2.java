package Reto1;

public class funciones2 {
	//multiplicar dos enteros y devolver el resultado
	public static int multiplicar (int n1, int n2) {
		return n1*n2;
	}
	//dividir dos enteros y devolver el resultado
	public static int dividir (int n1, int n2) { 
		return n1/n2;
	}
	//esPositivo
	public static boolean esPositivo  (int n1) {
		//si es mayor o igual que 0, devuelve que es positivo
		if (n1 >=0) {
			return true;
		} //si no, devuelve que no lo es
		return false;
	}
	//esNegativo
	public static boolean esNegativo  (int n1) {
		//si es menor que 0, devuelve que es negativo
		if (n1<0) {
			return true;
		} // si no, devuelve que no lo es
		return false;
	}
}
