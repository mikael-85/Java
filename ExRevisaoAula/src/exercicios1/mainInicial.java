package exercicios1;
import java.util.Scanner;

public class mainInicial {
	public static void main(String[] args){
		somaNum objetoSomaNum = new somaNum();
		limitesTipos objetoLimites = new limitesTipos();
		
		Scanner entrada = new Scanner(System.in); 
		int opcao = -1, opcao2= -1; 
		while(opcao != 0) {
			//opcao = -1;
			System.out.println("1 - Somar dois valores");
			System.out.println("2 - Somar tres valores");
			System.out.println("3 - Calcular a media de dois valores");
			System.out.println("4 - Calcular a media de tres valores");
			System.out.println("5 - Mostrar os valores maximos e minimos dos tipos");
			opcao = Integer.parseInt(entrada.nextLine());

			switch (opcao) {
			case 1:
				objetoSomaNum.somaDoisNum();
				break;

			case 2:
				objetoSomaNum.somaTresNum();
				break;

			case 3:
				objetoSomaNum.mediaDois();
				break;

			case 4:
				objetoSomaNum.mediaTres();
				break;

			case 5:
				objetoLimites.tipos();
				break;

			default:
				break;

			}
			break;
			//default: //Quando nao escolhido nenhum case volta a opcao padrao 
			//break;
		}
		
		entrada.close();

	
	}

}


