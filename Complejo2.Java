import java.lang.Math; 

public class Complejo {

	public double real;
	public double ima;


	public Complejo (double real,double ima){
		this.real = real;	// this es el objeto llamador
		this.ima = ima;
	}

	public Complejo (){
		this(0,0);
	}

	public Complejo suma(Complejo c){
		Complejo aux = new Complejo (c.real + this.real , c.ima + this.ima); return aux;
		//return aux;
	}

	public String toString(){
		return "("+this.real+","+this.ima+")";
	}

	public boolean equals(Complejo c){
		if ( this.real == c.real && this.ima == c.ima) return true;
		else return false;
	}
	
	public double modulo() {
		double res = Math.sqrt(this.real*this.real+this.ima*this.ima);
		return res;
	}
	
	public void clone(Complejo c) {
		c.real = this.real;
		c.ima = this.ima;
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


}
