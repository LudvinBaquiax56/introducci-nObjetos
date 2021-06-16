package src.Ejercicio1;

public class Contador {

	private int contador;

	public Contador(){
		contador = 0;
	}

	public Contador (int contador){
		this.contador = contador;
	}

	public void aumentarContador(){
		contador++;
	}

	public void aumentarContador(int aumento){
		contador += aumento;
	}

	public void disminuirContador(){
		contador--;
	}

	public void disminuirContador(int decremento){
		contador -= decremento;
	}

	public void setContador(int contador){
		this.contador = contador;
	}

	public int getContador(){
		return contador;
	}
}