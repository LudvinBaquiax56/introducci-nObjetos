package src.Ejercicio6;

public class Fraccion {

	private int numerador1;
	private int denominador1;

	private int numerador2;
	private int denominador2;

	public Fraccion(int numerador1, int denominador1, int numerador2, int denominador2){
		this.numerador1 = numerador1;
		this.denominador1 = denominador1;
		this.numerador2 = numerador2;
		this.denominador2 = denominador2;
	}

	public int getNumerador1(){
		return numerador1;
	}

	public void setNumerador1(int numerador1){
		this.numerador1 = numerador1;
	}

	public int getNumerador2(){
		return numerador1;
	}

	public void setNumerador2(int numerador1){
		this.numerador1 = numerador1;
	}

	public int getDenominador1(){
		return denominador1;
	}

	public void setDenominador1(int denominador1){
		this.denominador1 = denominador1;
	}

	public int getDenominador2(){
		return denominador2;
	}

	public void setDenominador2(int denominador2){
		this.denominador2 = denominador2;
	}

	public void suma(){
		int nResultado;
		int dResultado;
		if (denominador1 == denominador2) {
			dResultado = denominador1;
			nResultado = numerador1 + numerador2;
		} else {
			dResultado = denominador1*denominador2;
			nResultado = ((int)(dResultado/denominador1) * numerador1) + ((int)(dResultado/denominador2) * numerador2); 
		}
		System.out.println("La suma es " + nResultado + "/" + dResultado);
	}

	public void resta(){
		int nResultado;
		int dResultado;
		if (denominador1 == denominador2) {
			dResultado = denominador1;
			nResultado = numerador1 - numerador2;
		} else {
			dResultado = denominador1*denominador2;
			nResultado = ((int)(dResultado/denominador1) * numerador1) - ((int)(dResultado/denominador2) * numerador2); 
		}
		System.out.println("La resta es " + nResultado + "/" + dResultado);
	}

	public void multiplicacion(){
		int nResultado;
		int dResultado;
		
		dResultado = denominador1*denominador2;
		nResultado = numerador1*numerador2;
		System.out.println("La multiplicacion es " + nResultado + "/" + dResultado);
	}

	public void division(){
		int nResultado;
		int dResultado;
		
		dResultado = denominador1*numerador2;
		nResultado = numerador1*denominador2;
		System.out.println("La division es " + nResultado + "/" + dResultado);
	}

}