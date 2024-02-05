package arraysFunciones;

public class Ejercicio02 {

	// Función para obtener el máximo valor de una tabla de enteros
    public static int maximo(int[] t) {
    	// Suponemos que el primer elemento es el máximo inicialmente
    	int max = t[0];  

        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
            	// Actualizamos el máximo si encontramos un valor mayor
                max = t[i];  
            }
        }
        // Devuleve el maximo de la tabla de enteros
        return max;
    }

    // Método main para probar la función
    public static void main(String[] args) {
        // Ejemplo de una tabla de enteros
        int[] tablaEnteros = {12, 8, 2, 24, 48, 9};

        // Llamada a la función para obtener el máximo
        int maximoValor = maximo(tablaEnteros);

        // Imprimir el resultado
        System.out.println("El máximo valor en la tabla de enteros es: " + maximoValor);
    }
}
