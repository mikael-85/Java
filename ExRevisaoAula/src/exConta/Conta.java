package exConta;

public class Conta {
	private double saldo;
	private int numeroAgencia;
	private int numeroConta;
	//private String nomeConta;

	public void setSaldo(double aSaldo) {  //saldo 
		saldo = aSaldo; // this.saldo = saldo
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	/*public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}*/

	void deposita(double valor) {
		this.saldo += valor; 
	}
	
	void sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}
	
	void displayConta(){
		System.out.println();
		System.out.println("Agencia..: " +this.getNumeroAgencia()+ " Numero..:" +this.getNumeroConta()+ 
				" Saldo..: "+this.getSaldo());
	}


}