package slide01;
import java.util.Scanner;

public class slide1 {
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = entrada.nextLine();
		System.out.println ("Digite a idade: ");
		int idade = entrada.nextInt();
		System.out.println ("Nome: " + nome + ", Idade: "+ idade);
	}
}
