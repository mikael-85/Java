package exConta;
import java.util.Scanner;

public class ClienteConta {
	Scanner entrada = new Scanner (System.in); 
	
	//Conta objetoConta = new Conta();
	private int nAgencia;
	private int nConta;
	private String nomeConta;
	private double valor;
	Conta c1 = new Conta();
	
	public void criarConta() {
		System.out.println("Digite a agencia: ");
		nAgencia = entrada.nextInt();
		System.out.println("Digite o numero da conta: ");
		nConta = entrada.nextInt();
		System.out.println("Digite o valor de abertura de conta: ");
		valor = entrada.nextDouble();
		
		
		//System.out.println("Digite o nome: ");
		//nomeConta = entrada.nextLine();
		
		c1.setNumeroAgencia(nAgencia);
		c1.setNumeroConta(nConta);
		c1.setSaldo(valor);
		System.out.println();
		System.out.println("Conta Criada, exibindo informacoes...: ");
		c1.displayConta();
		
	}
		
	void depositar() {
		System.out.println("Digite a quantia: ");
		valor = entrada.nextDouble(); 
		c1.deposita(valor);
	}
	
	void sacar() {
		System.out.println("Digite a quantia: ");
		valor = entrada.nextDouble(); 
		c1.sacar(valor);
	}
	
	void verSaldo() {
		System.out.println("Saldo:" +c1.getSaldo());
	}
	
	void InfoGeral() {
		 c1.displayConta();
	 }
	
}
