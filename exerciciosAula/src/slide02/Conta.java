package slide02;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;

public void setSaldo (double saldo){
	this.saldo = saldo;
}
public double getSaldo(){
	return saldo;
}

public void setAgencia(int agencia){
	this.agencia = agencia;
}

public int getAgencia(){
	return agencia;
}

public void setNumero(int numero){
	this.numero = numero;
}

public int getNumero(){
	return numero;
}


public void sacar(double valor){
	saldo = saldo -valor;
	//setSaldo(getSaldo() - valor());
}

public void depositar(double valor){
	saldo = saldo + valor;
}

public void efetuarPagamento(double valor){
	saldo = saldo - valor;
}

public void colocarCreditosCelular(double valor){
	saldo = saldo - valor;
}

public void transferirPara (Conta destino, double valor){
	destino.saldo = destino.saldo+valor;
	saldo = saldo-valor;
}
}
