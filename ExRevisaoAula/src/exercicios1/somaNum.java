package exercicios1;
import java.util.Scanner;

public class somaNum {
	
	Scanner entrada = new Scanner(System.in);
	calculosGerais objetoCalculosGerais = new calculosGerais();
	
	
	public void somaDoisNum() {
		System.out.println("Digite o primeiro numero: ");
		double n1 = entrada.nextDouble(); //this.n1 ??

		System.out.println("Digite o segundo numero: ");
		double n2 = entrada.nextDouble();

		objetoCalculosGerais.somaDois(n1, n2);
		objetoCalculosGerais.displaySomaDois();
	}

	public void somaTresNum() {
		System.out.println("Digite o primeiro numero: ");
		double n1 = entrada.nextDouble();

		System.out.println("Digite o segundo numero: ");
		double n2 = entrada.nextDouble();

		System.out.println("Digite o terceiro numero: ");
		double n3 = entrada.nextDouble();

		objetoCalculosGerais.somaTres(n1, n2, n3);
		objetoCalculosGerais.displaySomaTres();

	}

	public void mediaDois() {
		System.out.println("Digite o primeiro numero: ");
		double n1 = entrada.nextDouble();

		System.out.println("Digite o segundo numero: ");
		double n2 = entrada.nextDouble();
		
		objetoCalculosGerais.mediaDois(n1, n2);
		objetoCalculosGerais.displayMediaDois();

	}
	
	public void mediaTres() {
		System.out.println("Digite o primeiro numero: ");
		double n1 = entrada.nextDouble();

		System.out.println("Digite o segundo numero: ");
		double n2 = entrada.nextDouble();
		
		System.out.println("Digite o terceiro numero: ");
		double n3 = entrada.nextDouble();
		
		
		
		objetoCalculosGerais.mediaTres(n1, n2, n3);
		objetoCalculosGerais.displayMediaTres();

	}


}