package retangulo;

import java.util.Scanner;

public class mainRetangulo {
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		
		Retangulo r = new Retangulo(1,1);
		//r.setAltura(4);
		//r.setBase(2);
		System.out.println("Digite a base do retangulo: ");
			double numero = entrada.nextDouble();
			if((numero >= 0) && (numero<=20)){
				r.setBase(numero);
			}
			else
				System.out.println("Valores devem estar no intervalo entre 0 e 20, base sera setada em 1");
			
		System.out.println("Digite a altura do retangulo: ");
			double numero2 = entrada.nextDouble();
			if((numero2 >= 0) && (numero2<=20)){
				r.setAltura(numero2);
			}
			else
				System.out.println("Valores devem estar no intervalo entre 0 e 20 base sera setada em 1");
			

		System.out.println("base: " + r.getBase());
		System.out.println("Altura: " + r.getAltura());
		System.out.println("Base: " + r.area());
		System.out.println("Perimetro: " + r.perimetro());
	
	
	
	}
}
