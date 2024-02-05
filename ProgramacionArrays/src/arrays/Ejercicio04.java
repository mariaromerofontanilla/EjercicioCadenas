package arrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creacion de la tabla con longitud 30
		int tabla[] = new int[30];
		
		for (int i = 0; i < tabla.length; i++) {
			// Calcula numeros entero entre 1 y 10
			tabla[i] = (int) (Math.random() * 10);
		}
		// Ordena la tabla
		Arrays.sort(tabla);
		// Imprime resultado
		System.out.println(Arrays.toString(tabla));

	}

}
