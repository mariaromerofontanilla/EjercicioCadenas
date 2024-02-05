package arraysBidimencionales;

import java.util.Random;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear un array de 4x5 con números enteros aleatorios entre 100 y 999
		int[][] miArray = new int[4][5];
		Random random = new Random();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				miArray[i][j] = random.nextInt(900) + 100; // Números entre 100 y 999
			}
		}

		// Mostrar el array por consola y calcular las sumas parciales
		System.out.println("Array generado:");

		int sumaTotal = 0;

		for (int i = 0; i < 4; i++) {
			int sumaFila = 0;

			for (int j = 0; j < 5; j++) {
				System.out.print(miArray[i][j] + "\t");
				sumaFila += miArray[i][j];
			}

			System.out.println("| Suma Fila " + (i + 1) + ": " + sumaFila);
		}

		System.out.println("--------------------------------");

		for (int j = 0; j < 5; j++) {
			int sumaColumna = 0;

			for (int i = 0; i < 4; i++) {
				sumaColumna += miArray[i][j];
			}

			System.out.print(sumaColumna + "\t");
			sumaTotal += sumaColumna;
		}

		// Mostrar la suma total en la esquina inferior derecha
		System.out.println("| Suma Total: " + sumaTotal);

	}

}
