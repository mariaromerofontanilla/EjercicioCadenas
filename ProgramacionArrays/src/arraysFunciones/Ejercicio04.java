package arraysFunciones;

public class Ejercicio04 {

	  // Función para buscar de forma secuencial en la tabla
    public static int buscar(int[] t, int clave) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
            	// Devuelve la posición si encuentra la clave
                return i;  
            }
        }
        // Devuelve -1 si no encuentra la clave
        return -1; 
    }

    // Método main para probar la función
    public static void main(String[] args) {
        // Ejemplo de una tabla de enteros
        int[] tablaEnteros = {1, 2, 3, 4, 5, 6, 7, 8};
        
        // Valor a buscar
        int clave = 4;

        // Llamada a la función para buscar la clave
        int posicion = buscar(tablaEnteros, clave);

        // Imprimir el resultado
        if (posicion != -1) {
            System.out.println("La clave " + clave + " se encuentra en la posición " + posicion);
        // En caso de que no se encuentre en la tabla de dira que no esta en la tabla
        } else {
            System.out.println("La clave " + clave + " no se encuentra en la tabla");
        }
    }
}