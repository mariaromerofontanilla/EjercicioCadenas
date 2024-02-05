package arraysFunciones;

import java.util.Random;

public class Ejercicio03 {
	
	 // Función para crear y devolver una tabla de longitud especificada con números pares aleatorios
    public static int[] rellenaPares(int longitud, int fin) {
    	// Creación de la tabla
        int[] tabla = new int[longitud];
        Random rand = new Random();

        for (int i = 0; i < longitud; i++) {
            // Generar un número par aleatorio entre 2 y fin
            int numeroPar = 2 + 2 * rand.nextInt((fin - 1) / 2 + 1);
            tabla[i] = numeroPar;
        }
        // Devuelve resultado de la tabla
        return tabla;
    }

    // Método main para probar la función
    public static void main(String[] args) {
        // Especifica la longitud y el valor máximo
        int longitud = 10;
        int fin = 20;

        // Llamada a la función para obtener la tabla de pares
        int[] tablaPares = rellenaPares(longitud, fin);

        // Imprimir el resultado
        System.out.print("Tabla de pares aleatorios: ");
        for (int valor : tablaPares) {
            System.out.print(valor + " ");
        }
    }
}