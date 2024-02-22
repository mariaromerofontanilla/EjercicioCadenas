package arraysCadena;

/**
 * Esta clase contiene una función para convertir una frase en formato
 * CamelCase.
 * 
 * @author Maria
 */
public class Ejercicio19 {

	/**
	 * El método principal es el punto de entrada del programa. Aquí se prueba la
	 * función convertirACamelCase con una frase específica.
	 *
	 * @param args Los argumentos de la línea de comandos (no se utilizan en este
	 *             programa).
	 */
	public static void main(String[] args) {
		String frase = "Me GUsta merenDAR gaLLEtas"; // Frase a convertir
		String camelCase = convertirACamelCase(frase); // Convertir la frase a CamelCase
		System.out.println(camelCase); // Imprimir el resultado
	}

	/**
	 * Esta función convierte una frase en formato CamelCase.
	 *
	 * @param frase La frase a convertir.
	 * @return La frase convertida en formato CamelCase.
	 */
	public static String convertirACamelCase(String frase) {
		StringBuilder resultado = new StringBuilder(); // Inicializar un StringBuilder para construir la frase CamelCase
		boolean nuevaPalabra = true; // Indicador para determinar si el próximo carácter debe ser mayúscula
		for (int i = 0; i < frase.length(); i++) { // Iterar sobre cada carácter de la frase
			char caracter = frase.charAt(i); // Obtener el carácter actual
			if (caracter == ' ') { // Si el carácter es un espacio
				nuevaPalabra = true; // Indicar que el próximo carácter debe ser mayúscula
			} else {
				if (nuevaPalabra) { // Si es el primer carácter de una palabra
					resultado.append(Character.toLowerCase(caracter)); // Convertir a minúscula y añadir al resultado
					nuevaPalabra = false; // Indicar que el próximo carácter no debe ser mayúscula
				} else {
					resultado.append(Character.toUpperCase(caracter)); // Convertir a mayúscula y añadir al resultado
				}
			}
		}
		return resultado.toString(); // Devolver la frase convertida a CamelCase
	}
}