package exercicios1;

public class calculosGerais {
	private double resultado;
	private double valor;
	private double valorTres;
	private double mediaTres;
	private double mediaDois;
	
	//Calculos
	public double somaDois(double n1, double n2) {
		valor = (n1 + n2);
		resultado = valor;
		return resultado;
	}
	
	public double somaTres(double n1, double n2, double n3) {
		valorTres = (n1 + n2 + n3);
		resultado = valorTres;
		return resultado;
	}
	
	public double mediaDois(double n1, double n2) {
		mediaDois = (n1 + n2)/2;
		resultado = mediaDois;
		return resultado;
	}
	
	public double mediaTres(double n1, double n2, double n3) {
		mediaTres = (n1 + n2 + n3)/3;
		resultado = mediaTres;
		return resultado;
	}
	
	//Imprimir os resultados
	public void displaySomaDois() {
		System.out.println("O valor da soma é: " + resultado);
	}
	
	public void displaySomaTres() {
		System.out.println("O valor da soma é: " + resultado);
	}
	
	public void displayMediaDois() {
		System.out.println("O valor da media é: " + resultado);
	}
	
	public void displayMediaTres() {
		System.out.println("O valor da media é: " + resultado);
	}
}
