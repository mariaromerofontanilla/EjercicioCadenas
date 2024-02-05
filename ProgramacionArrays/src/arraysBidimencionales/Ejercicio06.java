package arraysBidimencionales;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Rellenar la tabla con números enteros positivos entre 0 y 1000
		int filas = 6; // variable de filas con longitud 6
		int columnas = 10; // Variable de columnas longitud 10
		int[][] miTabla = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				miTabla[i][j] = (int) (Math.random() * 1001); // Números aleatorios entre 0 y 1000
			}
		}

		// Mostrar la tabla
		System.out.println("Tabla generada:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(miTabla[i][j] + "\t");
			}
			System.out.println();
		}

		// Calcular y mostrar el mínimo y máximo sin funciones separadas
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (miTabla[i][j] < min) {
					min = miTabla[i][j];
				}
				if (miTabla[i][j] > max) {
					max = miTabla[i][j];
				}
			}
		}
		// Imprime el maximo y el minimo
		System.out.println("\nMínimo: " + min);
		System.out.println("Máximo: " + max);
	}

}
