package arraysFunciones;

import java.util.Arrays;

public class Ejercicio05 {

	// Función para buscar todos los índices de un valor en la tabla
    public static int[] buscarTodos(int[] t, int valor) {
        int contador = 0;

        // Contar cuántas veces aparece el valor en la tabla
        for (int i = 0; i < t.length; i++) {
            if (t[i] == valor) {
                contador++;
            }
        }

        // Crear una tabla para almacenar los índices
        int[] indices = new int[contador];
        contador = 0;

        // Almacenar los índices donde se encuentra el valor
        for (int i = 0; i < t.length; i++) {
            if (t[i] == valor) {
                indices[contador] = i;
                contador++;
            }
        }

        return indices;
    }

    // Método main para probar la función
    public static void main(String[] args) {
        // Ejemplo de una tabla de enteros
        int[] tablaEnteros = {3, 7, 1, 9, 4, 5, 8, 4};

        // Valor a buscar
        int valor = 4;

        // Llamada a la función para buscar todos los índices del valor
        int[] indices = buscarTodos(tablaEnteros, valor);

        // Imprimir el resultado
        if (indices.length > 0) {
            System.out.println("El valor " + valor + " se encuentra en los índices: " + Arrays.toString(indices));
        } else {
            System.out.println("El valor " + valor + " no se encuentra en la tabla");
        }
    }
}
