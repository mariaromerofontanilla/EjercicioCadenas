package arraysBidimencionales;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Definir las dimensiones de la tabla
		int filas = 4; // variable de filaes igual a 4
		int columnas = 5; // variable de columna igual a 5

		// Crear la tabla bidimensional
		int[][] miTabla = new int[filas][columnas];

		// Rellenar la tabla directamente en el main
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				miTabla[i][j] = 10 * i + j;
			}
		}

		// Mostrar la tabla por consola
		System.out.println("Tabla Rellenada:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(miTabla[i][j] + "\t");
			}
			// Salto de linea
			System.out.println();
		}
	}

}
