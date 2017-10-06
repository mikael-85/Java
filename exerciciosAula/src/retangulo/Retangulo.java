package retangulo;

public class Retangulo {
	private double altura;
	private double base;

public Retangulo(double altura, double base){ //construtor da classe
	setBase(base);
	setAltura(altura);
}
	
	
public void setAltura(double altura){
	this.altura = altura;
}

public double getAltura (){
	return altura;
}

public void setBase(double base){
	this.base = base;
}

public double getBase(){
	return base;
}


public double area(){  //area
	return base * altura; 
}

public double perimetro(){
	return 2*(base+altura);
}
}