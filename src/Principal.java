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
		Cuadrado cuadradoA = new Cuadrado(3);
		Cuadrado cuadradoB = cuadradoA;
		cuadradoB.setLado(4);
		System.out.println("El area del primer cuadrado es " + cuadradoA.calcularArea());
		System.out.println("El perimetro del primer cuadrado es " + cuadradoA.calcularPerimetro());

		System.out.println("El area del segundo cuadrado es " + cuadradoB.calcularArea());
		System.out.println("El perimetro del segundo cuadrado es " + cuadradoB.calcularPerimetro());

		System.out.println(".....................................................");
		System.out.println("Ejercicio 3");
		Circulo circulo1 = new Circulo(3);
		Circulo circulo2 = circulo1;
		circulo2.setRadio(4);
		System.out.println("El area del primer circulo es " + circulo1.calcularArea());
		System.out.println("El perimetro del primer circulo es " + circulo1.calcularPerimetro());

		System.out.println("El area del segundo circulo es " + circulo2.calcularArea());
		System.out.println("El perimetro del segundo circulo es " + circulo2.calcularPerimetro());


		System.out.println(".....................................................");
		System.out.println("Ejercicio 4");
		Rectangulo rectangulo = new Rectangulo(5,6);
		Rectangulo rectangulo2 = rectangulo;
		rectangulo2.setBase(4);
		System.out.println("El area del primer rectangulo es " + rectangulo.calcularArea());
		System.out.println("El perimetro del segundo rectangulo es " + rectangulo2.calcularPerimetro());

		System.out.println(".....................................................");
		System.out.println("Ejercicio 5");
		Libro libro = new Libro("La divina comedia","Mexican", "Dante", 2007);
		Libro libro2 = libro;
		libro.mostrarDatos2();
		libro.prestamo();
		libro2.setAutor("Dante Alighieri");
		libro.mostrarDatos2();
		libro2.devolucion();
		libro2.mostrarDatos2();

		System.out.println(".....................................................");
		System.out.println("Ejercicio 6");
		Fraccion fra = new Fraccion(1,7,1,4);
		Fraccion fra2 = fra;
		fra.suma();
		fra.resta();
		fra2.setNumerador1(3);
		fra2.setDenominador2(7);
		fra.multiplicacion();
		fra.division();
	}
}