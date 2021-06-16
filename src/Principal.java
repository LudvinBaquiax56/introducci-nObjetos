package src;

import src.Ejercicio1.*;
import src.Ejercicio2.*;
import src.Ejercicio3.*;
import src.Ejercicio4.*;
import src.Ejercicio5.*;
import src.Ejercicio6.*;

public class Principal {

	public static void main (String [] args) {
		Principal ejemplo = new Principal();		
	}

	public Principal (){
		System.out.println(".....................................................");
		System.out.println("Ejercicio 1");
		Contador primerContador = new Contador();
		Contador segundoContador = primerContador;
		segundoContador.setContador(3);
		System.out.println("Primer contador " + primerContador.getContador());
		System.out.println("Segundo contador " + segundoContador.getContador());
		
		System.out.println(".....................................................");
		System.out.println("Ejercicio 2");
		Cuadrado b = new Cuadrado(3);
		System.out.println(b.calcularArea());
		System.out.println(b.calcularPerimetro());

		System.out.println(".....................................................");
		System.out.println("Ejercicio 3");
		Circulo c = new Circulo(3);
		System.out.println(c.calcularArea());
		System.out.println(c.calcularPerimetro());

		System.out.println(".....................................................");
		System.out.println("Ejercicio 4");
		Rectangulo d = new Rectangulo(5,6);
		System.out.println(d.calcularArea());
		System.out.println(d.calcularPerimetro());

		System.out.println(".....................................................");
		System.out.println("Ejercicio 5");
		Libro libro = new Libro("La divina comedia","Mexican", "Dante", 2007);
		//libro.mostrarDatos2();
		//libro.prestamo();
		//libro.mostrarDatos2();
		//libro.devolucion();
		//libro.mostrarDatos2();
		
		System.out.println(".....................................................");
		System.out.println("Ejercicio 6");
		Fraccion fra = new Fraccion(1,7,1,4);
		fra.suma();
		fra.resta();
		fra.multiplicacion();
		fra.division();
	}
}