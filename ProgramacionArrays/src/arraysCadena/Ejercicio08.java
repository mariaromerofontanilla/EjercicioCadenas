package arraysCadena;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Crear el string frase con la frase que pide el ejercicio
		String frase = "Dábale arroz a la zorra el abad";
		
		// if para decir de que si la fase es un palindromo que haga una cosa y si no es asi que haga otra cosa
		if (esPalindromo(frase)) {
			System.out.println("La frase '" + frase + "' es un palíndromo.");
		} else {
			System.out.println("La frase '" + frase + "' no es un palíndromo.");
		}
	}

	public static boolean esPalindromo(String frase) {
		// Eliminar los espacios en blanco y las tildes de la frase y convertirla a
		// minúsculas
		frase = frase.replaceAll(" ", "").toLowerCase().replaceAll("[áéíóú]", "a").replaceAll("[ñ]", "n");

		// Obtener la longitud de la frase
		int longitud = frase.length();

		// Iterar sobre la mitad de la frase (sin contar los caracteres especiales)
		for (int i = 0; i < longitud / 2; i++) {
			// Comparar el caracter actual con su correspondiente al final de la frase
			if (frase.charAt(i) != frase.charAt(longitud - i - 1)) {
				return false; // Si no coinciden, la frase no es un palíndromo
			}
		}

		return true; // Si se completa el bucle sin devolver false, la frase es un palíndromo
	}

}