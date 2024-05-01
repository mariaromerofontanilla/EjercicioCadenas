package ejercicio02;

import java.util.LinkedHashSet;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// Creamos un LinkedHashSet llamado "num" para almacenar números enteros únicos.
		LinkedHashSet<Integer> num = new LinkedHashSet<>();

		// Creamos una instancia de la clase Random para generar números aleatorios.
		Random random = new Random();

		// Generamos números aleatorios y los agregamos a "num" hasta que tenga 10
		// elementos únicos.
		while (num.size() < 10) {
			int randomNumber = random.nextInt(20) + 1; // Generamos números aleatorios entre 1 y 20.
			num.add(randomNumber); // Agregamos el número aleatorio a "num".
		}

		// Imprimimos en consola el mensaje "Números únicos generados:" seguido de los
		// números generados.
		System.out.println("Números únicos generados:");
		System.out.println(num);
	}
}
