package exRetangulo;
import java.util.Scanner;

public class ClienteRetangulo {

	private int larguraR;
	private int alturaR;
	Retangulo r1 = new Retangulo();
	Scanner entrada = new Scanner(System.in);

	public void setarBaseAltura() {
		System.out.println("Digite a altura do retangulo: ");
		alturaR = entrada.nextInt();
		if((alturaR >= 1) || (alturaR <= 20)) {
			r1.setAltura(alturaR);
		}else {
			System.out.println("O intervalo da largura tem que estar entre 0 e 20");
		}
		System.out.println("Digite a largura do retangulo: ");
		larguraR = entrada.nextInt();
		if((larguraR >= 1) || (larguraR <= 20)) {
			r1.setLargura(larguraR);
		}else {
			System.out.println("O intervalo da largura tem que estar entre 0 e 20");
		}
	}

	public void CalculoareaRetangulo() {
		System.out.println("A area do retangulo �: " + r1.areaRetangulo());
	}

	public void CalculoPerimetroTriangulo() {
		System.out.println("O perimetro do retangulo �: " + r1.perimetroRetangulo());
	}

	public void imprimirRetangulo() {
		r1.displayRetangulo();
	}
}
