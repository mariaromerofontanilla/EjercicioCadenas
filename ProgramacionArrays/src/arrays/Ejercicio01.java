package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Introducción de las variables que van hacer utilizadas
		int tamaño = 0;
		int contenido = 0;
		// Creación del Scanner
		Scanner sc = new Scanner(System.in);
		// Mensaje para el usuario
		System.out.print("introduce el tamaño y el contenido del array: ");
		// Scanner de las variables tamaño y contenido
		tamaño = sc.nextInt();
		contenido = sc.nextInt();
		// Insertar tabla con dichos valores
		int tabla[] = new int[tamaño];
		// Arrays fill para rellena la tabla con un valor por defecto que proporcione el usuario
		Arrays.fill(tabla, contenido);
		// Imprime resultado
		System.out.println(Arrays.toString(tabla));

	}

}
