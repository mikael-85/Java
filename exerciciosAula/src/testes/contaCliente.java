package testes;

public class contaCliente {
	public static void main (String[] args){
		conta c = new conta(100.00, "carlos");
		System.out.println ("Cliente: " + c.getNome() + " Com saldo de: "+ c.getSaldo());
		c.Sacar(30.00);
		System.out.println("Cliente: "+ c.getNome() + " Com saldo atualizado de: "+ c.getSaldo());
		c.depositar(20.00);
		System.out.println("Cliente: "+ c.getNome() + " Com saldo atual de: " + c.getSaldo());
		
		conta c2 = new conta(200.00, "Alisson");
		System.out.println("Cliente: "+ c2.getNome() + " Com saldo atual de: " + c2.getSaldo());
		c2.Sacar(40.00);
		System.out.println("Cliente: "+ c2.getNome() + " Com saldo atual de: " + c2.getSaldo());
		System.out.println("Cliente: "+ c.getNome() + " Com saldo atual de: " + c.getSaldo());
		
		System.out.println("=========================================================");
		
		contaCorrente c3 = new contaCorrente (300.00, "alter");
		c3.sacar(20.00);
		System.out.println("Cliente: "+ c3.getNome() + " Com saldo atual de: " + c3.getSaldo());
		c3.calcularTarifa(3.00);
		System.out.println("Cliente: "+ c3.getNome() + " Com saldo atual de: " + c3.getSaldo());
		c3.setSaldo(40);
		System.out.println("saldo: " + c3.getSaldo());
	}
}
