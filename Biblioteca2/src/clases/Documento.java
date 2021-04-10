package clases;
/**
 * Esta clase sirve para poder ilustrar el titulo, el autor y los numeros de ejemplares
 * @author David Quesada Valls
 * @version 1.0 
 */

public abstract class Documento {
	/**
	 * Estos Atributos sirven para guardar el titulo el autor y los numeros
	 * de ejemplares  totales y prestados 
	 */
	
	
	// Atributos
	
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;
	
	
	/**
	 * Este es el constructor de la clase
	 * @param titulo El titulo del libro
	 * @param autor El nombre del autor del libro
	 * @param numEjemplares El numero de ejemplares totalesç
	 * @param numEjemplaresPrestados El numero de ejemplares prestados
	 */

	
	//Constructor
	
	public Documento(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	/**
	 * Getters and Setters de la clase
	 * @return titulo  nombre Actual del libro
	 * @return autor  nombre Actual del autor
	 * @return numEjemplares  Valor actual de numEjemplares
	 * @return numEjemplaresPrestados  Valor actual de numEjemplaresPrestados
	 */
	
	
	//Getters and Setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public void incrementaNumEjemplaresPrestados() {
		this.numEjemplaresPrestados++;
	}

	public void decrementaNumEjemplaresPrestados() {
		this.numEjemplaresPrestados--;
	}

	
	//Otros Metodos
	
	/**
	 * Este metodo abstracto nos devolverá el prestamo
	 * 
	 */
	
	public abstract void prestamo();

	
	/**
	 * Este metodo abstracto nos devolverá la devolucion
	 * 
	 */
	
	public abstract void devolucion();
	
	/**
	 * Este metodo abstracto nos devolverá la informacion actual del documento
	 */
	
	public abstract void displayInfo();
}
