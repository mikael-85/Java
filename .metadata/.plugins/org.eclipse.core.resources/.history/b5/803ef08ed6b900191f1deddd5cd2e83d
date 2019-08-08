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
		
	void depositar() {//alterar para duas 
		System.out.println("Digite a quantia: ");
		valor = entrada.nextDouble(); 
		c1.deposita(valor);
	}
	
	void sacar() { // alterar para duas 
		System.out.println("Digite a quantia: ");
		valor = entrada.nextDouble(); 
		c1.sacar(valor);
	}
	
	void verSaldo() {
		System.out.println("Saldo da conta "+c1.getNomeConta() +": " +c1.getSaldo());
		System.out.println("Saldo da conta "+c2.getNomeConta() +": " +c2.getSaldo());
	}
	
	void InfoGeral() {
		 c1.displayConta();
		 c2.displayConta();
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
