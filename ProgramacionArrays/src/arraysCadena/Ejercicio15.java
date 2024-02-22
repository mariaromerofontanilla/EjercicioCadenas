package arraysCadena;

import java.util.Random;
import java.util.Scanner;
/**
 * Esta clase contiene un programa que implementa el juego del anagrama.
 * 
 * En este juego, un jugador escribe una palabra o frase, y la aplicación muestra un anagrama
 * (transposición de los caracteres) del texto introducido generado al azar.
 * Luego, otro jugador tiene que adivinar cuál es el texto original.
 * 
 * La aplicación no permite que el texto introducido por el jugador 1 sea la cadena vacía.
 * 
 * Este programa utiliza una función para realizar la desordenación del texto.
 * 
 *@author Maria
 */
public class Ejercicio15 {

    public static void main(String[] args) {
    	// Creacion del Scanner
        Scanner sc = new Scanner(System.in);

        // Solicitar al jugador 1 que introduzca una palabra o frase
        System.out.println("Jugador 1: Introduce una palabra o frase:");
        String palabraOriginal = sc.nextLine().trim(); // Se elimina cualquier espacio en blanco alrededor de la entrada

        // Verificar que la palabra o frase introducida no esté vacía
        while (palabraOriginal.isEmpty()) {
            System.out.println("La palabra o frase no puede estar vacía. Inténtalo de nuevo:");
            palabraOriginal = sc.nextLine().trim();
        }

        // Desordenar la palabra o frase introducida por el jugador 1
        String anagrama = desordenarTexto(palabraOriginal);

        // Mostrar el anagrama al jugador 2
        System.out.println("Jugador 2: Adivina cuál es el texto original:");
        System.out.println("Anagrama: " + anagrama);

        // Permitir que el jugador 2 intente adivinar el texto original
        System.out.println("Introduce tu respuesta:");
        String respuesta = sc.nextLine().trim(); // Se elimina cualquier espacio en blanco alrededor de la entrada

        // Verificar si la respuesta del jugador 2 es correcta
        if (respuesta.equalsIgnoreCase(palabraOriginal)) {
            System.out.println("¡Correcto! Has adivinado el texto original.");
        } else {
            System.out.println("Incorrecto. El texto original era: " + palabraOriginal);
        }

        sc.close();
    }

    /**
     * Desordena el texto proporcionado y devuelve el anagrama resultante.
     *
     * @param texto El texto que se va a desordenar.
     * @return El anagrama del texto original.
     */
    public static String desordenarTexto(String texto) {
        Random random = new Random();
        char[] caracteres = texto.toCharArray();

        // Algoritmo de Fisher-Yates para desordenar los caracteres
        for (int i = caracteres.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }

        return new String(caracteres);
    }
}