package arraysFunciones;

public class Ejercicio01 {
	// Función para calcular la suma de una tabla de enteros
    public static int sumaTabla(int[] tabla) {
    	// Variable de suma que se iguala a 0
        int suma = 0;
        for (int valor : tabla) {
        	// Calculo de la suma de la tabla
            suma += valor;
        }
        // Devolver el resultado de la suma
        return suma;
    }

    // Método main para probar la función
    public static void main(String[] args) {
        // Ejemplo de una tabla de enteros
        int[] tablaEnteros = {1, 2, 3, 4, 5};

        // Llamada a la función para obtener la suma
        int resultadoSuma = sumaTabla(tablaEnteros);

        // Imprimir el resultado
        System.out.println("La suma de la tabla de enteros es: " + resultadoSuma);
    }
}
