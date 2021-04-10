package principal;

import clases.Enciclopedia;
import clases.Libro;

public class GestionBiblioteca {

	public static void main(String[] args) {

		gestionLibros();
		gestionEnciclopedias();

	}

	public static void gestionLibros() {

        //Libros
		Libro l1 = new Libro("IT", "Stephen King", 1504, 5, 0);
		Libro l2 = new Libro("El Señor de los Anillos - La comunidad del anillo", "J.R.R. Tolkien", 547, 10, 10);

		// Mostramos información del primer libro
		l1.displayInfo();

		// Devolvemos un ejemplar de l1 (mirad que no tenemos dejado ninguno...)
		l1.devolucion();

		// Prestamos uno
		l1.prestamo();

		// Y ahora lo devolvemos
		l1.devolucion();

		// Mostramos información del segundo libro
		l2.displayInfo();

		// fallo
		// Devolvemos un ejemplar de l2 (mirad que no tenemos dejado ninguno...)
		l2.prestamo();

		// Prestamos uno
		l2.devolucion();

		// Y ahora lo devolvemos
		l2.prestamo();

	}

	public static void gestionEnciclopedias() {

	
        //Enciclopedias
		Enciclopedia e1 = new Enciclopedia("Enciclopedia Espasa", "Antonio Ramirez", "ESPASA", 10, 5);
		Enciclopedia e2 = new Enciclopedia("Enciclopedia Encarta", "Bill Gates", "Microsoft", 20, 15);

		// Mostramos información de la primera enciclopedia
		e1.displayInfo();

		// Devolvemos un ejemplar de e1
		e1.devolucion();

		// Prestamos una
		e1.prestamo();

		// Y ahora la devolvemos
		e1.devolucion();
		
		// Mostramos información de la segunda enciclopedia
		e2.displayInfo();

		// Prestamos una
		e2.prestamo();

		// Devolvemos un ejemplar de e2
		e2.devolucion();

		// Prestamos una
		e2.prestamo();

		// Y ahora la devolvemos
		e2.devolucion();

	}

}
