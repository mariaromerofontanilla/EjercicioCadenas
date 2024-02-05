package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creacion del Scanner
		Scanner sc = new Scanner(System.in);
		// Creacion de la tabla1 con longitud de 10
		int tabla1[] = new int[10];
		// Creacion de la tabla2 con longitud de 10
		int tabla2[] = new int[10];
		// Creacion de la variable numero
		int num;
		
		for (int i = 0; i < tabla1.length; i++) {
			// Mensaje para que introduzcas 10 numeros enteros
			System.out.print("Introduce 10 numeros enteros: ");
			// Scanner de la variable numero, con los valores que de ek usuario
			num = sc.nextInt();
			// Igualamos la tabla1 a los valores de la variable numero
			tabla1[i] = num;
		}

		for (int i = 0; i < tabla2.length; i++) {
			// Mensaje para que introduzcas 10 numeros enteros
			System.out.print("Introduce 10 numeros enteros: ");
			// Scanner de la variable numero
			num = sc.nextInt();
			tabla2[i] = num;
		}
		// Salto de línea
		System.out.println();
		// Imprime el resultado
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Los numeros de las tablas son iguales");
		} else {
			System.out.println("Los numeros de la tabla no son iguales");
		}
		// Cierre del Scanners
		sc.close();
	}

}
