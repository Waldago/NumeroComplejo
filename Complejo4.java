package ejercicioNumeroComplejo;


public class Complejo implements Comparable <Complejo> {

	public double real;
	public double ima;


	public Complejo (double real,double ima){
		this.setReal(real);	// this es el objeto llamador
		this.setIma(ima);
	}

	public Complejo (){
		this(0,0);
	}

	public Complejo suma(Complejo c){
		return new Complejo (c.getReal() + this.getReal() , c.getIma() + this.getIma());
	}

	public String toString(){
		return "("+this.getReal()+","+this.getIma()+")";
	}

	public boolean equals(Complejo c){
		if ( this.getReal() == c.getReal() && this.getIma() == c.getIma()) return true;
		else return false;
	}

	public double modulo() {
		return Math.sqrt(Math.pow(this.getReal(),2)+Math.pow(this.getIma(),2));
	}

	public void clone(Complejo c) {
		c.real = this.getReal();
		c.ima = this.getIma();
	}
	
	public int compareTo(Complejo a) {
		if (this.modulo()<a.modulo()) return -1;
		else if (this.modulo()==a.modulo()) return 0;
		return 1;
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
