package arrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner sc = new Scanner(System.in);
		// Creacion de las variable necesarias para el ejercicio
		int cuenta = 0; // variable contador que se igualara a 0
		int n; // variable numero
		// Creacion de tabla con longitud 1000
		int tabla[] = new int[1000];

		for (int i = 0; i < tabla.length; i++) {
			// Calculo para poner valores a leatorios a la tabla de 1 a 100
			tabla[i] = (int) (Math.random() * 100);

		}
		// Mensaje para el usuario, de que introduzcas un valor
		System.out.print("Introduce un valor: ");
		// Scanner de la variable numero donde se guardara los valores introducidos por el usuario
		n = sc.nextInt();

		for (int num : tabla) {
			if (num == n) {
				cuenta++;
			}

		}
		// Imprime resultado
		System.out.println("Hay: " + cuenta + " numeros repetidos");
		// Cierre del Scanner
		sc.close();
	}

}
