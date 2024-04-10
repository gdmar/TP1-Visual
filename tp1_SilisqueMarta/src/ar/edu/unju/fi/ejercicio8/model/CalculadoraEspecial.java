package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public double calcularSumatoria(){
		double resultado =0;
		for (int i=1; i<=this.n; i++) {
			double sumatoria = Math.pow(i*(i+1)/2,2);
			resultado = resultado + sumatoria;
			
		}
		return resultado;
	}
	
	public float calcularProductoria(){
		float resultado1=1;
		for (int i=1; i<=this.n; i++) {
			float productoria = i*(i+4);
			resultado1 = resultado1 * productoria;
		}
		return resultado1;
	}
	

	public CalculadoraEspecial() {
		super();
	}

	public CalculadoraEspecial(int n) {
		super();
		this.n = n;
	}


	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	

}
