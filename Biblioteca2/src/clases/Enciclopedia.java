package clases;

/**
 * Esta clase sirve para crear Enciclopedias
 * 
 * @author David Quesada Valls
 * @version 1.0
 */

public class Enciclopedia extends Documento {

	/**
	 * Este atributo sirve para que cada Enciclopedia pueda tener su editorial
	 */

	// Atributos
	private String editorial;

	/**
	 * Este es el constructor de la clase
	 * 
	 * @param editorial Es la editorial de la enciclopedia
	 */

	// Constructor
	public Enciclopedia(String titulo, String autor, String editorial, int numEjemplares, int numEjemplaresPrestados) {
		super(titulo, autor, numEjemplares, numEjemplaresPrestados);
		this.editorial = editorial;

	}

	/**
	 * Getters and setters de la clase
	 * 
	 * @return editorial Es la editorial de la enciclopedia
	 */

	// Getters and setters
	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	// Metodos Extra

	/**
	 * Este metodo realizará el prestamo de la enciclopedia
	 */

	// public void para la orden del prestamo
	public void prestamo() {

		System.out.println("Iniciando el préstamo...");

		if (super.getNumEjemplares() == super.getNumEjemplaresPrestados()) {
			System.out.println("No se pueden prestar más enciclopedias, ¡están todas prestadas!");
			System.out.println("");
			
		} else {

			super.incrementaNumEjemplaresPrestados();
			System.out.println("La enciclopedia se ha prestado correctamente.");
			System.out.println("");
		}

	}

	/**
	 * Este metodo realizará la devolucion de la enciclopedia
	 */

	// public void para la orden de la devolucion
	public void devolucion() {

		System.out.println("Iniciando la devolución...");

		if (super.getNumEjemplaresPrestados() == 0) {
			System.out.println("No se pueden devolver más enciclopedias, ¡están todas devueltas!.");
			System.out.println("");

		} else {

			super.decrementaNumEjemplaresPrestados();
			System.out.println("La enciclopedia se ha devuelto correctamente.");
			System.out.println("");
		}

	}

	/**
	 * Este metodo nos devolverá todos los datos pedidos de la enciclopedia
	 */

	// public void para la informacion requerida de la enciclopedia
	public void displayInfo() {
		System.out.println("");
		System.out.println("== Información de la enciclopedia - " + this.getTitulo() + " ==");
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Editorial: " + this.getEditorial());
		System.out.println("Número de ejemplares en posesión: " + this.getNumEjemplares());
		System.out.println("Número de ejemplares prestados: " + this.getNumEjemplaresPrestados());
		System.out.println("");
	}

	
	
}
