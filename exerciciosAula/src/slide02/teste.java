package slide02;

public class teste {
	public static void main(String[] args){
		Conta c = new Conta();
		c.setSaldo(100);
		c.setNumero(01);
		c.setAgencia(001);
		
		System.out.println("Saldo: " + c.getSaldo());
		System.out.println("Numero da conta: " + c.getNumero());
		System.out.println("Numero da agencia: " + c.getAgencia());
		
		c.sacar(50);
		System.out.println("Novo Saldo: " + c.getSaldo());
		
		Conta c2 = new Conta();
		c2.setSaldo(200);
		c2.setNumero(02);
		c2.setAgencia(002);
		
		System.out.println("Saldo conta C2: " + c2.getSaldo());
		System.out.println("Numero da conta: " + c2.getNumero());
		System.out.println("Numero da agencia: " + c2.getAgencia());
		
		c.transferirPara(c2, 50);
		System.out.println("Saldo de conta c: " + c.getSaldo());
		System.out.println("Saldo de conta c2: " + c2.getSaldo());
	}
}
