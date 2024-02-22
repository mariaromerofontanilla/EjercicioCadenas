package arraysCadena;

/**
 * Esta clase contiene una función para generar un código HTML básico con un
 * título y contenido.
 * 
 * @author Maria
 */
public class Ejercicio18 {

	/**
	 * El método principal es el punto de entrada del programa. Aquí se prueba la
	 * función generarCodigoHTML con un título y contenido específicos.
	 *
	 * @param args Los argumentos de la línea de comandos (no se utilizan en este
	 *             programa).
	 */
	public static void main(String[] args) {
		String titulo = "Título de la página"; // Título de la página
		String contenido = "Este es el contenido de la página web."; // Contenido de la página
		String codigoHTML = generarCodigoHTML(titulo, contenido); // Generación del código HTML
		System.out.println(codigoHTML); // Impresión del código HTML generado
	}

	/**
	 * Esta función genera un código HTML básico con un título y contenido. El
	 * título se representa como un encabezado de primer nivel (
	 * <h1>) y el contenido como un párrafo (
	 * <p>
	 * ).
	 *
	 * @param titulo    El título de la página.
	 * @param contenido El contenido de la página.
	 * @return Una cadena que representa el código HTML generado.
	 */
	public static String generarCodigoHTML(String titulo, String contenido) {
		// Construcción del código HTML con las etiquetas necesarias
		StringBuilder codigoHTML = new StringBuilder();
		codigoHTML.append("<!DOCTYPE html>\n"); // Declaración del tipo de documento HTML
		codigoHTML.append("<html>\n"); // Etiqueta de inicio de documento HTML
		codigoHTML.append("<head>\n"); // Encabezado del documento HTML
		codigoHTML.append("<title>").append(titulo).append("</title>\n"); // Título de la página
		codigoHTML.append("</head>\n"); // Fin del encabezado del documento HTML
		codigoHTML.append("<body>\n"); // Cuerpo del documento HTML
		codigoHTML.append("<h1>").append(titulo).append("</h1>\n"); // Encabezado de primer nivel con el título
		codigoHTML.append("<p>").append(contenido).append("</p>\n"); // Párrafo con el contenido
		codigoHTML.append("</body>\n"); // Fin del cuerpo del documento HTML
		codigoHTML.append("</html>"); // Etiqueta de cierre del documento HTML
		return codigoHTML.toString(); // Devuelve el código HTML generado como una cadena
	}
}