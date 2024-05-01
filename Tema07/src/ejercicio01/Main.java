package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		// Creamos una nueva lista llamada "numeros" que contendrá números enteros.
		ArrayList<Integer> numeros = new ArrayList<>();

		// Llenamos la lista "numeros" con números del 1 al 10 mediante un bucle for.
		for (int i = 1; i <= 10; i++) {
			numeros.add(i);
		}

		// Imprimimos en consola el mensaje "Lista original:" seguido de la lista
		// original de números y un espacio en blanco.
		System.out.println("Lista original:");
		System.out.println(numeros);
		System.out.println();

		// Mezclamos aleatoriamente los elementos de la lista "numeros" utilizando el
		// método "shuffle" de la clase Collections.
		Collections.shuffle(numeros);

		// Imprimimos en consola el mensaje "Lista mezclada:" seguido de los números
		// mezclados, uno por uno, separados por espacios.
		System.out.println("Lista mezclada:");
		for (int i : numeros) {
			System.out.print(i + " ");
		}
		System.out.println(); // Imprimimos una nueva línea para un formato más limpio.
	}
}
