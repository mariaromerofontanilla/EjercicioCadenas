package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creacion del Scanner
		Scanner sc = new Scanner(System.in);
		// Creacion del Random
		Random r = new Random();
		// Creacion de tabla ganadora con los valores ganadores
		int ganadora[] = { 8, 45, 24, 3, 6, 49 };
		// Creacion de tabla con longitud 6
		int apuesta[] = new int[6];
		// Variable contador que se iguala a 0
		int cuenta = 0;

		for (int i = 0; i < apuesta.length; i++) {
			// Calculo de apuesta que pone valores aleatoriopara adivinar la convinación correcta
			apuesta[i] = r.nextInt(1, 50);
		}
		// Ordena la tabla apuesta
		Arrays.sort(apuesta);
		// Ordena la tabla ganadora
		Arrays.sort(ganadora);
		// Muestra la tabla apuesta
		System.out.println(Arrays.toString(apuesta));
		// Muestra la tabla ganadora
		System.out.println(Arrays.toString(ganadora));
		// Salto de linea
		System.out.println();
		// Calculo de que si la apuesta es igual a ganadora te dice que es coorecto, de lo contrario dara erronea
		if (apuesta == ganadora) {
			System.out.println("Combinación perfecta");
		} else {
			System.out.println("Convinación erronea");
		}

		for (int i = 0; i < apuesta.length; i++) {
			// Recorre la tabla ganadora y la tabla apuesta para ver cuantos numeros se ha acertado
			int indice = Arrays.binarySearch(ganadora, apuesta[i]);

			if (indice >= 0) {
				// Cuenta los numero acertados
				cuenta++;
			}
		}
		// Imprime resultado
		System.out.println("Acertatste un total de " + cuenta + " numeros");
		// Cierre del Scanner
		sc.close();

	}

}
