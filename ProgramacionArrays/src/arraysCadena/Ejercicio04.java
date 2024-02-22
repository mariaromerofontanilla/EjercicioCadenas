package arraysCadena;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos la variable frase y la igualamaos a cadena vacia
		String frase = "Hola Mi nombre es Antonia";
		
		// Creamos el arrays de palabras y lo igualamos a frase.split para que cuente espacios
		String[] palabras = frase.split(" ");
		
		// Ordenador el arrays alfabeticamente
		Arrays.sort(palabras);
		
		// convertimos el arrays en una cadena
		for(int i=0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " ");
		}

	}

}
