package sinArrays;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creacion de la tabla con longitud de 10
		int tabla[] = new int[10];
		// Creacion del Scanner
		Scanner sc = new Scanner(System.in);
		// Variables necesarias para realizar los ejercicios
		int suma = 0; // Suma que sera para calcular y se iguala a 0
		int max = Integer.MIN_VALUE; // Max para sacar el valor maximo
		int min = Integer.MAX_VALUE; // Min para sacar el valor minnimo

		for (int i = 0; i < tabla.length; i++) {
			// Mensaje para que introduzcas 10 numeros enteros
			System.out.print("Introduce 10 numeros enteros: ");
			// Scanner de tabla para añadir los valores que de el usuario a la tabla
			tabla[i] = sc.nextInt();
		}

		for (int i = 0; i < tabla.length; i++) {
			// Calculo de la variable suma
			suma = suma + tabla[i];
		}
		for (int i = 0; i < tabla.length; i++) {
			// Calcular los valores maximos y minimos de la tabla
			if (max < tabla[i]) {
				max = tabla[i];
			}
			if (min > tabla[i]) {
				min = tabla[i];
			}
		}
		// Imprime resultados
		System.out.println("El maximo es: " + max); // Imprime cual es el maximo
		System.out.println("El minimo es: " + min); // Imprime cual es el minimo
		System.out.println("La suma de los numeros es: " + suma); // Imprime la suma
		// Cierre del Scanner
		sc.close();

	}

}
