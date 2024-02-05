package sinArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Integrar los pares y los impares en la tabla
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		// Crea la tabla con longitud 8
		int tabla[] = new int[8];
		// Creacion del Scanner
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			// Mensaje de que introduzca 8 numeros enteros
			System.out.print("Introduce 8 numeros enteros: ");
			// Scanner de tabla para añadir los valores que de el usuario a la tabla
			tabla[i] = sc.nextInt();
			// Calcular los que son pares y los impares para añadirlos a la tabla
			if (tabla[i] % 2 == 0) {
				pares.add(tabla[i]);
			} else {
				impares.add(tabla[i]);
			}
		}
		// Imprime por pantalla los numeros que son pares
		System.out.println("Los numeros pares son: ");
		for (Integer n : pares) {
			System.out.print(n);
		}
		// Salto de línea
		System.out.println();
		// Imprime por pantalla los numeros que son impares
		System.out.println("Los numeros impares son: ");
		for (Integer n : impares) {
			System.out.print(n);
		}
		
		// Cierre del Scanner
		sc.close();

	}

}
