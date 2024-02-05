package arraysBidimencionales;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Crear y mostrar la matriz original
		int[][] matrizOriginal = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// Imprime la matriz original
		System.out.println("Matriz Original:");
		mostrarMatriz(matrizOriginal);

		// Girar la matriz 90 grados
		int[][] matrizGirada = gira90(matrizOriginal);

		// Mostrar la matriz girada
		System.out.println("\nMatriz Girada 90 grados:");
		mostrarMatriz(matrizGirada);
	}

	// Método para girar una matriz 90 grados
	private static int[][] gira90(int[][] matrizInicio) {
		int tamano = matrizInicio.length;
		int[][] matrizGirada = new int[tamano][tamano];

		for (int i = 0; i < tamano; i++) {
			for (int j = 0; j < tamano; j++) {
				matrizGirada[j][tamano - 1 - i] = matrizInicio[i][j];
			}
		}
		// Devuelve la matriz girada
		return matrizGirada;
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
