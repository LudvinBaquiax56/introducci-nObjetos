package src;

import src.Ejercicio1.*;
import src.Ejercicio2.*;
import src.Ejercicio3.*;
import src.Ejercicio4.*;
import src.Ejercicio5.*;

public class Principal {

	public static void main (String [] args) {
		Principal ejemplo = new Principal();		
	}

	public Principal (){
		Contador a = new Contador();
		a.aumentarContador();
		System.out.println(a.getContador());
		a.aumentarContador(5);
		System.out.println(a.getContador());
		a.disminuirContador();
		System.out.println(a.getContador());

		Cuadrado b = new Cuadrado(3);
		System.out.println(b.calcularArea());
		System.out.println(b.calcularPerimetro());


		Circulo c = new Circulo(3);
		System.out.println(c.calcularArea());
		System.out.println(c.calcularPerimetro());

		Rectangulo d = new Rectangulo(5,6);
		System.out.println(d.calcularArea());
		System.out.println(d.calcularPerimetro());

		Libro libro = new Libro("La divina comedia","Mexican", "Dante", 2007);
		libro.mostrarDatos2();
		libro.prestamo();
		libro.mostrarDatos2();
		libro.devolucion();
		libro.mostrarDatos2();
	}
}