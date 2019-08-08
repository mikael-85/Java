package exConta;

public class ContaCelular {
	private double saldo = 0.0;
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	void displayContaCelular(){// fazendo
		System.out.println();
		System.out.println("Saldo de creditos: " + this.getSaldo());
	}
}
