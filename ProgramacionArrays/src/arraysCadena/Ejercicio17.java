package arraysCadena;

/**
 * Esta clase contiene un programa de ejemplo para eliminar comentarios de una sentencia en C.
 * La función {@code eliminarComentarios} recibe una sentencia en C con comentarios y devuelve la misma sentencia sin los comentarios.
 * 
 * @author Maria
 */
public class Ejercicio17 {
	/**
     * El método principal es el punto de entrada del programa.
     * Llama a la función {@code eliminarComentarios} con una sentencia en C y muestra la sentencia original y la sentencia sin comentarios.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
	public static void main(String[] args) {
		// Definición de la cadena de entrada que contiene la sentencia en C con comentarios
		String entrada = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		 // Llamada a la función eliminarComentarios con la cadena de entrada y asignación del resultado a una variable de salida
		String salida = eliminarComentarios(entrada);
		 // Impresión de la cadena de entrada y la cadena de salida
		System.out.println("Entrada: " + entrada);
		System.out.println("Salida: " + salida);
	}
	
	/**
     * Esta función elimina los comentarios de una sentencia en C.
     *
     * @param sentencia La sentencia en C con comentarios.
     * @return La misma sentencia sin los comentarios.
     */
	public static String eliminarComentarios(String sentencia) {
		// Inicialización de un StringBuilder para construir la cadena de salida
		StringBuilder resultado = new StringBuilder();
		// Variable para indicar si estamos dentro de un comentario
		boolean dentroComentario = false;
		// Recorrido de la cadena de entrada caracter por caracter
		for (int i = 0; i < sentencia.length(); i++) {
			// Verificar si estamos empezando un comentario (/*)
			if (!dentroComentario && i < sentencia.length() - 1 && sentencia.charAt(i) == '/'
					&& sentencia.charAt(i + 1) == '*') {
				// Indicar que estamos dentro de un comentario
				dentroComentario = true;
				i++; // Saltar el asterisco
			
			// Verificar si estamos terminando un comentario (*/)
			} else if (dentroComentario && i < sentencia.length() - 1 && sentencia.charAt(i) == '*'
					&& sentencia.charAt(i + 1) == '/') {
				// Indicar que hemos salido del comentario
				dentroComentario = false;
				i++; // Saltar el asterisco
			// Si no estamos dentro de un comentario, añadir el caracter al resultado
			} else if (!dentroComentario) {
				resultado.append(sentencia.charAt(i));
			}
		}
		// Convertir el StringBuilder a String y retornarlo como resultado
		return resultado.toString();
	}
}