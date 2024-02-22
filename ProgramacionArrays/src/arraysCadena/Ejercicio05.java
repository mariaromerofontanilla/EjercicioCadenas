package arraysCadena;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Cadena que se le pasa
		String frase = "Hola Mundo";

		String fraseAlr = "";
		
		fraseAlr = alreves(frase);
		
		System.out.println(fraseAlr);
		
	}
	
	public static String alreves(String frase) {
		String fraseAlr= "";
		
		char letras;
		
		for(int i = frase.length()-1; i >= 0 ; i--) {
			letras = frase.charAt(i);
			fraseAlr += letras;
		}
		return fraseAlr;
	}

}
