package arraysBidimencionales;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Crear y mostrar la matriz
		int filas = 3; // variable de filas con longitud 3
		int columnas = 3; // variable de columnas con longitud 3
		int[][] matriz = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 100
			}
		}
		// Imprime matriz
		System.out.println("Matriz:");
		mostrarMatriz(matriz);

		// Verificar si la matriz es simétrica
		boolean esSimetrica = esMatrizSimetrica(matriz);

		// Mostrar el resultado
		if (esSimetrica) {
			System.out.println("\nLa matriz es simétrica.");
		} else {
			System.out.println("\nLa matriz no es simétrica.");
		}
	}

	// Método para verificar si una matriz es simétrica
	private static boolean esMatrizSimetrica(int[][] matriz) {
		int filas = matriz.length;
		int columnas = matriz[0].length;

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					// Devuelve falso
					return false;
				}
			}
		}
		// Devuleve verdadero
		return true;
	}

	// Método para mostrar una matriz por pantalla
	private static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			// Salto de linea
			System.out.println();
		}

	}

}
