package testes;

public class contaCorrente extends conta{
	public contaCorrente(double valor, String nome) {
		super(valor, nome);
		// TODO Auto-generated constructor stub
	}

	public void sacar(double valor){
		calcularTarifa(valor);
	}		
	public void calcularTarifa(double valor){
		if (valor > 2)
		setSaldo(getSaldo() - valor);
	}
}
