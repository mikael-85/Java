package slide02;

public class tempo {
	private int hora;
	private int minutos;
	private int segundos;
	
public tempo(int hora, int minutos, int segundos){
	setHora(hora);
	setMinutos(minutos);
	setSegundos(segundos);
}
	
public void setHora(int hora){
	if (hora >= 0 && hora <= 24)
		this.hora = hora;
	else
		System.out.println("O intervalo de hora deve estar entre 0 e 24.");
}

public int getHora(){
	return hora;
}

public void setMinutos(int minutos){
	if (this.minutos >= 0 && this.minutos <= 60)
		this.minutos = minutos;
	else
		System.out.println("O intervalo de minutos deve estar entre 0 e 60.");
}

public int getMinutos(){
	return minutos;
}

public void setSegundos(int segundos){
	if (this.segundos >= 0 && this.segundos <= 60)
		this.segundos = segundos;
	else
		System.out.println("O intervalo de segunfos deve estar entre 0 e 60.");
}

public int getSegundos(){
	return segundos;
}

public int tempoSegundos(){
	return (hora * 3600) + (minutos *60) + segundos;
}

public void incrementarSegundos(int n){
	segundos = segundos + n;
}

public void incrementarMinutos(int n){
	minutos = minutos + n;
}

public void incrementarHora(int n){
	hora = hora + n;
}

public String toString(){
	return ("São "+ hora +" Horas " + minutos+ " minutos " + segundos+ " segundos "); //this ??
}

}