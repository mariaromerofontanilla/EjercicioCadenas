package arraysBidimencionales;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Crear y mostrar la matriz original
		int filas = 3; // Variable de filas con longitud 3
		int columnas = 4; // variable de columnas con longitud 4
		int[][] matrizOriginal = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matrizOriginal[i][j] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 100
			}
		}
		// Imprime matriz original
		System.out.println("Matriz Original:");
		mostrarMatriz(matrizOriginal);

		// Calcular y mostrar la transposición de la matriz
		int[][] matrizTranspuesta = new int[columnas][filas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matrizTranspuesta[j][i] = matrizOriginal[i][j];
			}
		}
		// Imprime matriz Transpuesta
		System.out.println("\nMatriz Transpuesta:");
		mostrarMatriz(matrizTranspuesta);
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
