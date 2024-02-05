package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner sc = new Scanner(System.in);
		// Creación de tabla longitud 8
		int tabla[] = new int[8];
		// Creación de tabla2 longitud 8
		int tabla2[] = new int[8];
		// Crear variables necesarias para ejercicio
		int num; // variable numero
		int aux; // variable auxiliar del numero
		int jugador = 0; // variable jugador igualandolo a 0

		for (int i = 0; i < tabla.length; i++) {
			// contador de jugador
			jugador++;
			// Mensaje donde pide al usuario que introduzcas la puntuacion del jugador
			System.out.println("Introduce las puntuaciones del jugador " + jugador + " :");
			// Scanner de la variable numero donde se guardara los valores dado por el usuario
			num = sc.nextInt();
			// igualar tabla a numero
			tabla[i] = num;
		}
		// Ordenar tabla
		Arrays.sort(tabla);

		for (int i = 0; i < tabla.length; i++) {
			// utilizar la variable auxiliar para recoger la tabla restarle i y restarle 1
			aux = tabla.length - i - 1;
			// igualar tabla2 auxiliar a tabla i
			tabla2[aux] = tabla[i];
		}
		// Imprime resultado
		System.out.println(Arrays.toString(tabla2));
		// Cierre del Scanner
		sc.close();
	}

}
