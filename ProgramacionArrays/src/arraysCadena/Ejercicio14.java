package arraysCadena;

import java.util.Scanner;

/**
 * Esta clase contiene un programa que cuenta la frecuencia de cada letra en una frase ingresada por el usuario.
 * 
 * El programa utiliza un arreglo de caracteres que representa el abecedario para contar la frecuencia de cada letra en la frase.
 * 
 * Se proporciona un arreglo de caracteres abecedario que contiene todas las letras del abecedario en minúsculas, incluida la letra 'ñ'.
 * 
 * El programa solicita al usuario que introduzca una frase y luego cuenta la frecuencia de cada letra en la frase.
 *
 * Se utiliza un bucle for anidado para recorrer cada letra del abecedario y cada letra de la frase para contar su frecuencia.
 *
 * Se muestra por pantalla la frecuencia de cada letra que aparece al menos una vez en la frase.
 *
 * El objeto Scanner se cierra después de la lectura de entrada del usuario.
 * 
 * Este código asume que todas las letras de la frase están en minúsculas y que la frase no contiene caracteres especiales o números.
 *
 * Si se desea contar la frecuencia de las letras sin distinguir entre mayúsculas y minúsculas, se debe modificar el código para convertir la frase a minúsculas antes de contar.
 * 
 * Si se desea contar la frecuencia de las letras sin considerar la letra 'ñ', se debe modificar el arreglo abecedario.
 * 
 * Este código proporciona un punto de partida para implementar la funcionalidad de contar la frecuencia de las letras en una frase.
 * 
 * La funcionalidad para contar la frecuencia de las letras se implementa en el método main.
 * 
 * El objeto Scanner se cierra después de la lectura de entrada del usuario.
 * 
 * Se utiliza un arreglo de caracteres letras para almacenar las letras de la frase.
 * 
 * Se utiliza un contador cont para contar la frecuencia de cada letra en el abecedario.
 * 
 * Se utiliza un bucle for anidado para recorrer cada letra del abecedario y cada letra de la frase y contar su frecuencia.
 *
 * Se muestra por pantalla la frecuencia de cada letra que aparece al menos una vez en la frase.
 * 
 * El objeto Scanner se cierra después de la lectura de entrada del usuario.
 *
 * @author Maria
 */
public class Ejercicio14 {
	// Arreglo de caracteres que representa el abecedario
	private static final char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
			'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void main(String[] args) {
		//Creación del Scanner
		Scanner sc = new Scanner(System.in);

		// Declaración e inicialización de una variable frase de tipo String para almacenar la frase ingresada por el usuario
		String frase = "";

		// Declaración e inicialización de un contador cont de tipo int para contar la frecuencia de cada letra
		int cont = 0;

		// Declaración de un arreglo de caracteres letras para almacenar las letras de la frase
		char[] letras;

		// Mensaje solicitando al usuario que introduzca una frase
		System.out.println("Introduzca una frase");
		// Lectura de la frase ingresada por el usuario y asignación a la variable frase
		frase = sc.nextLine();

		// Convierte la frase a minúsculas y la asigna nuevamente a la variable frase
		frase = frase.toLowerCase();

		// Convierte la frase en un arreglo de caracteres y lo asigna al arreglo letras
		letras = frase.toCharArray();

		// Bucle for externo que recorre cada letra del abecedario
		for (int i = 0; i < abecedario.length; i++) {
			// Reinicia el contador a cero en cada iteración del bucle externo
			cont = 0;
			 // Bucle for interno que recorre cada letra de la frase
			for (int j = 0; j < letras.length; j++) {
				// Comprueba si la letra del abecedario actual coincide con la letra de la frase actual
				if (abecedario[i] == letras[j]) {
					// Incrementa el contador si hay coincidencia
					cont++;
				}
			}

			// Comprueba si la letra del abecedario actual tiene una frecuencia mayor que cero en la frase
			if (cont > 0) {
				// Si la letra aparece al menos una vez en la frase, muestra su frecuencia por pantalla
				System.out.println(abecedario[i] + ": " + cont + " veces");
			}
		}

		// Cierre del Scanner
		sc.close();
	}

}