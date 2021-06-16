package src.Ejercicio4;

public class Rectangulo {

	private int base;
	private int altura;

	public Rectangulo (int base, int altura){
		this.base = base;
		this.altura = altura;
	}

	public int getbase () {
		return base;
	}

	public void setbase(int base){
		this.base = base;
	}

	public int getAltura(){
		return altura;
	}

	public void setAltura(int altura){
		this.altura = altura;
	}

	public int calcularArea(){
		return base*altura;
	}

	public int calcularPerimetro(){
		return 2*base + 2*altura;
	}
}