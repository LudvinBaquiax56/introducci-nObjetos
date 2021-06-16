package src.Ejercicio5;

import java.util.*;

public class Libro {

	private String nombre;
	private String editorial;
	private String autor;
	private int anio;
	private boolean disponible;

	public Libro(String nombre, String editorial, String autor, int anio){
		this.nombre = nombre;
		this.editorial = autor;
		this.autor = autor;
		this.anio = anio;
		this.disponible = true;
	}

	public String getNombre(){
		return nombre;
	}

	public String getEditorial(){
		return editorial;
	}

	public String getAutor(){
		return autor;
	}

	public int getAnio(){
		return anio;
	}

	public boolean getDisponible(){
		return disponible;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setEditorial(String editorial){
		this.editorial = editorial;
	}

	public void setAutor(String autor){
		this.autor = autor;
	}

	public void setAnio(int anio){
		this.anio = anio;
	}

	public void setDisponible(boolean disponible){
		this.disponible = disponible;
	}

	public String obtenerDisponivilidad(){
		return disponible? "Disponible":"En Prestamo";
	}

	public void prestamo(){
		if (getDisponible()) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese los dias que desea prestar el libro");
			int dias = scanner.nextInt();
			setDisponible(false);			
		} else {
			System.out.println("El libro no esta disponible");
		}
	}

	public void devolucion(){
		if (getDisponible()) {
			System.out.println("Error el libro no esta prestado");
		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Desea regresar el libro " + getNombre());
			System.out.println("1. Si");
			System.out.println("2. No");
			int opcion = scanner.nextInt();
			if (opcion ==1) {
				System.out.println("El libro ha sido devuelto con exito");
				setDisponible(true);
			} else {
				System.out.println("El libro no ha sido debuelto");
			}
		}
	}

	public String mostrarDatos(){
		return nombre + "--" + editorial + "--"  + autor + "--"  + anio + "--"  + obtenerDisponivilidad();
	}

	public void mostrarDatos2(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Editorial: " +editorial);
		System.out.println("Autor: " + autor); 
		System.out.println("Anio: " + anio);
		System.out.println ("Disponible:" + obtenerDisponivilidad());
	}
}