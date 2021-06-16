package src;

import src.Ejercicio1.*;

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
	}
}