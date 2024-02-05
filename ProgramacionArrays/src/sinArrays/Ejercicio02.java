package sinArrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creacion de tabla tipo double (decimal) de longitud 5
		double tabla[] = new double[5];
		// Creacion del Scanner para leer variables
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < tabla.length; i++) {
			// Mensaje de que introduzcas 5 numero decimales
			System.out.print("Introduce 5 numeros decimales: ");
			// Scanner de la variable
			tabla[i] = sc.nextDouble();
		}

		for (int i = 0; i < tabla.length; i++) {
			// Imprime resultado
			System.out.println(tabla[i]);
		}
		// Salto de línea
		System.out.println();
		// Cierre del Scanner
		sc.close();

	}

}
