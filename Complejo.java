package ejercicioComplejo;

public class Complejo {
	//Atributos
	private double real;
	private double ima;
	
	//Constructor por defecto
	public Complejo () {
		this(0.0,0.0);
	}
	//Constructor
	public Complejo (double real , double ima) {
		
		this.setReal(real);
		this.setIma(ima);
		
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getIma() {
		return ima;
	}
	public void setIma(double ima) {
		this.ima = ima;
	}
	//
	public String toString(){
		return "("+this.real+","+this.ima+")";
	}
	//Metodos
	public Complejo suma(Complejo c) {
		
		Complejo aux = new Complejo(this.real + c.real , this.ima + c.ima);
		return aux;
		
	}
	
}
