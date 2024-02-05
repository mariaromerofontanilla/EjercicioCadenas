package sinArrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creacion del Scanner
		Scanner sc = new Scanner(System.in);
		// Constante de los meses, ya que los meses son siempre los mismos
		final String MESES[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiempre",
				"Octuble", "Noviembre", "Diciembre" };
		// Creacion de la tabla temperatura añadiendo los la variable meses dentro de esta
		int temperatura[] = new int[MESES.length];

		for (int i = 0; i < temperatura.length; i++) {
			// Mensaje para añadir la temperatura de cada mes
			System.out.print("Introduce temperatura para cada mes de " + MESES[i] + ": ");
			// Scanner de temperatura para añadir los valores que de el usuario a la tabla
			temperatura[i] = sc.nextInt();
		}

		for (int i = 0; i < MESES.length; i++) {
			// Imprime los meses mas tabulador
			System.out.print(MESES[i] + "    \t");
			for (int j = 1; j <= temperatura[i]; j++) {
				// Imprime los asteriscos
				System.out.print("*");
			}
			// Salto de línea
			System.out.println();
		}
		// Cierre del Scanner
		sc.close();

	}

}
