package testes;

public class conta {
	private double saldo;
	private String nome;
	
	public conta(double valor, String nome){
		setSaldo(valor);
		setNome(nome);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void Sacar(double valor){
		setSaldo(getSaldo() - valor);
	}
	
	public void depositar (double valor){
		setSaldo(getSaldo() + valor);
	}
	
}
