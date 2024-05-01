package ejercicio03;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		// Creamos un HashMap llamado "num" para almacenar la frecuencia de cada letra
		// del texto.
		HashMap<Character, Integer> num = new HashMap<>();

		// Definimos el texto en el que contaremos la frecuencia de cada letra.
		String texto = "En un agujero en el suelo, vivía un hobbit. "
				+ "No un agujero húmedo, sucio, repugnante, con restos de "
				+ "gusanos y olor a fango, ni tampoco un agujero, seco, "
				+ "desnudo y arenoso, sin nada en que sentarse o que comer:"
				+ " era un agujero-hobbit, y eso significa comodidad";

		// Recorremos cada caracter del texto.
		for (char letra : texto.toCharArray()) {
			// Verificamos si el caracter es una letra.
			if (Character.isLetter(letra)) {
				letra = Character.toLowerCase(letra); // Convertimos la letra a minúscula.
				// Actualizamos la frecuencia de la letra en el HashMap.
				num.put(letra, num.getOrDefault(letra, 0) + 1);
			}
		}

		// Imprimimos en consola la frecuencia de cada letra.
		System.out.println("Frecuencia de cada letra:");
		for (Map.Entry<Character, Integer> entry : num.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
