package exConta;
import java.util.Scanner;

public class ClienteConta {
	Scanner entrada = new Scanner (System.in); 

	//Conta objetoConta = new Conta();
	private int nAgencia;
	private int nConta;
	private String nomeConta;
	private double valor;
	private String contaTransf;
	Conta c1 = new Conta();
	Conta c2 = new Conta();
	ContaCelular cc1 = new ContaCelular();
	ContaCelular cc2 = new ContaCelular();
	private Integer contaSelec = -1;//para o switch

	public void criarConta() {
		System.out.println("Inserindo dados da primeira conta: ");
		System.out.println("Digite a agencia: ");
		nAgencia = entrada.nextInt();
		System.out.println("Digite o numero conta: ");
		nConta = entrada.nextInt();
		System.out.println("Digite o valor de abertura de conta: ");
		valor = entrada.nextDouble();

		//System.out.println("Digite o nome: ");
		//nomeConta = entrada.nextLine();

		c1.setNumeroAgencia(nAgencia);
		c1.setNumeroConta(nConta);
		c1.setSaldo(valor);
		c1.setNomeConta("Conta 1");
		System.out.println();
		System.out.println("Conta Criada, exibindo informacoes...: ");
		c1.displayConta();

		System.out.println("------------------------------------------");
		System.out.println("Inserindo dados da segunda conta: ");
		System.out.println("Digite a agencia: ");
		nAgencia = entrada.nextInt();
		System.out.println("Digite o numero da conta: ");
		nConta = entrada.nextInt();
		System.out.println("Digite o valor de abertura de conta: ");
		valor = entrada.nextDouble();

		c2.setNumeroAgencia(nAgencia);
		c2.setNumeroConta(nConta);
		c2.setSaldo(valor);
		c2.setNomeConta("Conta 2");
		System.out.println();
		System.out.println("Conta Criada, exibindo informacoes...: ");
		c2.displayConta();

	}

	void depositar() {
		System.out.println("-----------------------");
		System.out.println("Selecione a conta: ");
		System.out.println("1 - Conta 1");
		System.out.println("2 - Conta 2 ");
		System.out.println("-----------------------");
		contaSelec = entrada.nextInt();
		if (contaSelec == 1 ) {
			System.out.println("Digite a quantia: ");
			valor = entrada.nextDouble();
			c1.deposita(valor);
		}else{
			if(contaSelec == 2) {
				System.out.println("Digite a quantia: ");
				valor = entrada.nextDouble();
				c2.deposita(valor);
			}else {
				System.out.println("Numero de conta invalido!");
			}
		}
		/* outra maneira...: 
		while(contaSelec != 0) {
			System.out.println("-----------------------");
			System.out.println("Selecione a conta: ");
			System.out.println("1 - Conta 1 ");
			System.out.println("2 - Conta 2");
			System.out.println("-----------------------");
			contaSelect = Integer.parseInt(entrada.nextLine());
			switch (opcao) {
				case 1:
					break;
				case 2:
	 				break;
	 			default:
	 			break	*/
	}	


	void sacar() { // alterar para duas contas
		System.out.println("-----------------------");
		System.out.println("Selecione a conta: ");
		System.out.println("1 - Conta 1");
		System.out.println("2 - Conta 2 ");
		System.out.println("-----------------------");
		contaSelec = entrada.nextInt();
		if (contaSelec == 1 ) {
			System.out.println("Digite a quantia: ");
			valor = entrada.nextDouble();
			c1.sacar(valor);
		}else{
			if(contaSelec == 2) {
				System.out.println("Digite a quantia: ");
				valor = entrada.nextDouble();
				c2.sacar(valor);
			}else {
				System.out.println("Numero de conta invalido!");
			}		

		}
	}
	
	void efetuarPagamento() {
		System.out.println("-----------------------");
		System.out.println("Selecione a conta: ");
		System.out.println("1 - Conta 1");
		System.out.println("2 - Conta 2 ");
		System.out.println("-----------------------");
		contaSelec = entrada.nextInt();
		if (contaSelec == 1 ) {
			System.out.println("Digite o valor do pagamento: ");
			valor = entrada.nextDouble();
			c1.sacar(valor);
		}else{
			if(contaSelec == 2) {
				System.out.println("Digite o valor do pagamento");
				valor = entrada.nextDouble();
				c2.sacar(valor);
			}else {
				System.out.println("Numero de conta invalido!");
			}		

		}
	}

	void verSaldo() {
		System.out.println("-----------------------");
		System.out.println("Selecione a conta: ");
		System.out.println("1 - Conta 1");
		System.out.println("2 - Conta 2 ");
		System.out.println("-----------------------");
		contaSelec = entrada.nextInt();
		if (contaSelec == 1 ) {
			System.out.println("Saldo da conta "+c1.getNomeConta() +": " +c1.getSaldo());
		}else{
			if(contaSelec == 2) {
				System.out.println("Saldo da conta "+c2.getNomeConta() +": " +c2.getSaldo());
			}else {
				System.out.println("Numero de conta invalido!");
			}		
		}
	}

	void InfoGeral() {
		c1.displayConta();
		cc1.displayContaCelular();
		
		c2.displayConta();
		cc2.displayContaCelular();
	}
	
	void adicionarCreditos() {// fazendo
		System.out.println("-----------------------");
		System.out.println("Selecione a conta para retida do valor dos creditos: ");
		System.out.println("1 - Conta 1");
		System.out.println("2 - Conta 2 ");
		System.out.println("-----------------------");
		contaSelec = entrada.nextInt();
		if (contaSelec == 1 ) {
			System.out.println("Digite o valor desejado de creditos para o celular: ");
			valor = entrada.nextDouble();
			c1.sacar(valor);
			cc1.setSaldo(valor);
		}else{
			if(contaSelec == 2) {
				System.out.println("Digite o valor desejado de creditos para o celular: ");
				valor = entrada.nextDouble();
				c2.sacar(valor);
				cc2.setSaldo(valor);
			}else {
				System.out.println("Numero de conta invalido!");
			}		
		}
	}

	void transfereConta(){ //c1 para c2
		entrada.nextLine(); // buffer
		System.out.println("Digite o valor a ser transferido: ");
		valor = entrada.nextDouble();
		c1.transfere(c2, valor);
	}

	void transfereConta2(){ //c2 para c1
		entrada.nextLine(); // buffer
		System.out.println("Digite o valor a ser transferido: ");
		valor = entrada.nextDouble();
		c2.transfere(c1, valor);
	}

}
