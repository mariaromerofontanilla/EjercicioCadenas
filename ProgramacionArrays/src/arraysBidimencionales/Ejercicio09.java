package arraysBidimencionales;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Crear y mostrar la matriz
		int[][] matriz = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
		// Imprime la matriz
		System.out.println("Matriz:");
		mostrarMatriz(matriz);

		// Verificar si la matriz es mágica
		boolean esMagica = esMatrizMagica(matriz);

		// Mostrar el resultado
		if (esMagica) {
			System.out.println("\nLa matriz es mágica.");
		} else {
			System.out.println("\nLa matriz no es mágica.");
		}
	}

	// Método para verificar si una matriz es mágica
	private static boolean esMatrizMagica(int[][] matriz) {
		int tamano = matriz.length;
		int sumaFilaAnterior = 0; // variable para la suma de filas anteriones
		int sumaColumnaAnterior = 0; // variable para la suma de las columnas anteriores

		// Verificar la suma de la primera fila y primera columna
		for (int i = 0; i < tamano; i++) {
			sumaFilaAnterior += matriz[0][i];
			sumaColumnaAnterior += matriz[i][0];
		}

		// Verificar la suma de las filas y columnas restantes
		for (int i = 1; i < tamano; i++) {
			int sumaFila = 0;
			int sumaColumna = 0;

			for (int j = 0; j < tamano; j++) {
				sumaFila += matriz[i][j];
				sumaColumna += matriz[j][i];
			}

			if (sumaFila != sumaFilaAnterior || sumaColumna != sumaColumnaAnterior) {
				// Devuleve falso
				return false;
			}
		}
		// Devuelve verdadero
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
