package exConta;

import java.util.Scanner;

public class MenuConta {
	Scanner entrada = new Scanner(System.in);
	ClienteConta objetoClienteConta = new ClienteConta();
	
	
	
	public void menuConta() {
		 
		int opcao = -1, opcao2= -1; 
		while(opcao != 0) {
			//opcao = -1;
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("1 - Criar Conta");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Ver Saldo");
			System.out.println("5 - Informacao Geral da conta");
			System.out.println("6 - Transferencia entre conta 1 e conta 2");
			System.out.println("7 - Transferencia entre conta 2 e conta 1");
			System.out.println("0 - Sair");
			System.out.println("-----------------------------------------");
			System.out.println();
			opcao = Integer.parseInt(entrada.nextLine());

			switch (opcao) {
			case 1:
				objetoClienteConta.criarConta();
				break;

			case 2:
				objetoClienteConta.depositar();
				break;

			case 3:
				objetoClienteConta.sacar();
				break;

			case 4:
				objetoClienteConta.verSaldo();
				break;

			case 5:
				objetoClienteConta.InfoGeral();
				break;
			case 6:
				objetoClienteConta.transfereConta();
				break;
				
			case 7:
				objetoClienteConta.transfereConta2();
				break;	

			default:
				break;

			}
			//break;
			//default: //Quando nao escolhido nenhum case volta a opcao padrao 
			//break;
		}
		
		entrada.close();

	
	}

}

