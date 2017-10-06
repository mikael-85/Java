package slide01;
import java.util.Scanner;

public class opAtirmeticos {
	public static void main (String [] args){
		int i = 10;
		int j = 2;
		int adicao = i + j;
		System.out.println ("Adicao: " + adicao);
		int sub = i - j;
		System.out.println ("Subtração: " + sub);
		int mult = i * j;
		System.out.println ("Subtração: " + mult);
		int div = i / j;
		System.out.println ("Subtração: " + div);
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("digite um numero: ");
		int a = entrada.nextInt();
		
		String parOuImpar = (a % 2 == 0)? "par" : "impar"; // if else, seleção
		System.out.println (a + " é " + parOuImpar);
		
		//if (a % 2 == 0)
			//System.out.println ("par ");
		//else
			//System.out.println ("Impar");
	}
}
