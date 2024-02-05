package arraysBidimencionales;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Crear la tabla bidimensional de 10x10
		int[][] tablaMultiplicar = new int[10][10];

		// Llenar la tabla con los valores de las tablas de multiplicar
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				tablaMultiplicar[i - 1][j - 1] = i * j;
			}
		}

		// Mostrar la tabla por consola
		System.out.println("Tabla de Multiplicar:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(tablaMultiplicar[i][j] + "\t");
			}
			// Salto de linea
			System.out.println();
		}

	}

}
