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
	 * Este metodo realizar? el prestamo del libro
	 */

	// public void para la orden del prestamo
	public void prestamo() {

		System.out.println("Iniciando el pr?stamo...");

		if (super.getNumEjemplares() == super.getNumEjemplaresPrestados()) {
			System.out.println("No se pueden prestar m?s libros, ?est?n todos prestados!");
			System.out.println("");
		} else {

			super.incrementaNumEjemplaresPrestados();
			System.out.println("El libro se ha prestado correctamente.");
			System.out.println("");
		}
	}

	/**
	 * Este metodo realizar? la devolucion del libro
	 */
	
	// public void para la orden de la devolucion
	public void devolucion() {
		System.out.println("Iniciando la devoluci?n...");

		if (super.getNumEjemplaresPrestados() == 0) {
			System.out.println("No se pueden devolver m?s libros, ?est?n todos devueltos!.");
			System.out.println("");
			
		} else {

			super.decrementaNumEjemplaresPrestados();
			System.out.println("El libro se ha devuelto correctamente.");
			System.out.println("");
		}
	}
	
	/**
	 * Este metodo nos devolver? todos los datos pedidos de los libros
	 */

	// public void para la informacion requerida de los libros
	public void displayInfo() {
		System.out.println("");
		System.out.println("== Informaci?n del libro - " + this.getTitulo() + " ==");
		System.out.println("Autor: " + this.getAutor());
		System.out.println("N? de p?ginas: " + this.getNumPaginas() + " p?ginas");
		System.out.println("N?mero de ejemplares en posesi?n: " + this.getNumEjemplares());
		System.out.println("N?mero de ejemplares prestados: " + this.getNumEjemplaresPrestados());
		System.out.println("");
	}
	

}
