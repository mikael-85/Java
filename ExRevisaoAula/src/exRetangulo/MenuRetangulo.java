package exRetangulo;



import java.util.Scanner;

public class MenuRetangulo {
	Scanner entrada = new Scanner(System.in);
	ClienteRetangulo objetoClienteRetangulo = new ClienteRetangulo();

	public void menuRentangulo() {

		int opcao = -1;	//, opcao2= -1; 
		while(opcao != 0) {
			//opcao = -1;
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("1 - Inserir base e altura");
			System.out.println("2 - Calcular area do retangulo");
			System.out.println("3 - Calcular o perimetro do retangulo");
			System.out.println("4 - Imprimir dados gerais");
			System.out.println("0 - Sair");
			System.out.println("-----------------------------------------");
			System.out.println();
			opcao = Integer.parseInt(entrada.nextLine());

			switch (opcao) {
			case 1:
				objetoClienteRetangulo.setarBaseAltura();
				break;

			case 2:
				objetoClienteRetangulo.CalculoareaRetangulo();
				break;

			case 3:
				objetoClienteRetangulo.CalculoPerimetroTriangulo();
				break;

			case 4:
				objetoClienteRetangulo.imprimirRetangulo();
				break;

			default: //quando nenhum case � escolhido volta a opcao padrao
				break;

			}
		}

		entrada.close();
	}

}



