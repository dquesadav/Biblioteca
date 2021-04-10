package clases;

     /**
     * Esta clase sirve para crear Libros
     * 
     * @author David Quesada Valls
     * @version 1.0
     */

public class Libro extends Documento {
	
	/**
	 * Este atributo sirve para que cada Libro pueda tener su numero de paginas
	 */
	
	// Atributos
	private int numPaginas;

	/**
	 * Este es el constructor de la clase
	 * 
	 * @param numPaginas Es el numero de paginas que pueda tener el libro
	 */
	
	// Constructor
	public Libro(String titulo, String autor, int numPaginas, int numEjemplares, int numEjemplaresPrestados) {
		super(titulo, autor, numEjemplares, numEjemplaresPrestados);
		this.numPaginas = numPaginas;
	}

	/**
	 * Getters and setters de la clase
	 * 
	 * @return numPaginas Es el numero de paginas que pueda tener el libro
	 */
	
	// Getters and Setters
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	// Metodos extra
	
	/**
	 * Este metodo realizará el prestamo del libro
	 */

	// public void para la orden del prestamo
	public void prestamo() {

		System.out.println("Iniciando el préstamo...");

		if (super.getNumEjemplares() == super.getNumEjemplaresPrestados()) {
			System.out.println("No se pueden prestar más libros, ¡están todos prestados!");
			System.out.println("");
		} else {

			super.incrementaNumEjemplaresPrestados();
			System.out.println("El libro se ha prestado correctamente.");
			System.out.println("");
		}
	}

	/**
	 * Este metodo realizará la devolucion del libro
	 */
	
	// public void para la orden de la devolucion
	public void devolucion() {
		System.out.println("Iniciando la devolución...");

		if (super.getNumEjemplaresPrestados() == 0) {
			System.out.println("No se pueden devolver más libros, ¡están todos devueltos!.");
			System.out.println("");
			
		} else {

			super.decrementaNumEjemplaresPrestados();
			System.out.println("El libro se ha devuelto correctamente.");
			System.out.println("");
		}
	}
	
	/**
	 * Este metodo nos devolverá todos los datos pedidos de los libros
	 */

	// public void para la informacion requerida de los libros
	public void displayInfo() {
		System.out.println("");
		System.out.println("== Información del libro - " + this.getTitulo() + " ==");
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Nº de páginas: " + this.getNumPaginas() + " páginas");
		System.out.println("Número de ejemplares en posesión: " + this.getNumEjemplares());
		System.out.println("Número de ejemplares prestados: " + this.getNumEjemplaresPrestados());
		System.out.println("");
	}
	

}
