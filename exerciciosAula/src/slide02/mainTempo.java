package slide02;

public class mainTempo {
	public static void main (String[] args){
		
		tempo T = new tempo(7,30,21);
		T.incrementarHora(2);
		T.incrementarMinutos(10);
		T.incrementarSegundos(20);
		
		tempo S = new tempo (3,45,11);
		
		//System.out.println("São "+T.getHora() +" Horas " +T.getMinutos()+ " minutos " +T.getSegundos()+ " segundos ");
		System.out.println("As horas em segundos são: " + T.tempoSegundos()+"s");
		
		//T.toString();
		System.out.println(T.toString()); //pesquisar conversão!!! 
		System.out.println(T);
		System.out.println(S);
	}
}