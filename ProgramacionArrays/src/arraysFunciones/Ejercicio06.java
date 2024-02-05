package arraysFunciones;

import java.util.Arrays;

public class Ejercicio06 {
	
	// Función para buscar en la tabla de enteros
	public static int[] buscarTodos(int t[], int valor) {
		// Crear tabla que suma los datos entre sí
		int[] tablaSumas = new int[t.length-valor+1];
		
		for(int i=0; i<tablaSumas.length; i++) {
			for(int j=i; j<i+valor; j++) {
				tablaSumas[i] += t[j]; 
			}
		}
		// Devuelve el resultado de la tabla Suma
		return tablaSumas;
	}
	
	// Main
	public static void main(String[] args) {
		// Variables necesarias para el ejercicio, la tabla con los valores que queramos introducir, y seguidamente
		// la variable resultado y la variable de numero de elementos
		int tabla[] = {10,1,5,8,9,2};
		int resultado[];
		int numElementos = 2;
		// Calculo de la variable resultado
		resultado = buscarTodos(tabla, numElementos);
		// Imprime el resultado
		System.out.println(Arrays.toString(resultado));
		
	}

}
