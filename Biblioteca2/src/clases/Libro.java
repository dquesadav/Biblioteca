package clases;

public class Libro extends Documento {
	
	//Atributos
	private int numPaginas;

	//Constructor
	public Libro(String titulo, String autor, int numPaginas, int numEjemplares, int numEjemplaresPrestados) {
		super(titulo, autor, numEjemplares, numEjemplaresPrestados);
		this.numPaginas = numPaginas;
	}

	
	//Getters and Setters
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
	//Metodos extra 
	
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
}
