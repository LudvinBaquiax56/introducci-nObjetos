package src.Ejercicio3;

import java.util.*;

public class Circulo {

	private int radio;

	public Circulo (int radio){
		this.radio = radio;
	}

	public int getRadio () {
		return radio;
	}

	public void setRadio(int radio){
		this.radio = radio;
	}

	public double calcularArea(){
		return radio*radio*Math.PI;
	}

	public double calcularPerimetro(){
		return 2*radio*Math.PI;
	}
}