

public class Main {

	public static void main(String[] args) {

		Complejo c1= new Complejo(1,2);
		Complejo c2= new Complejo(3,3);
		Complejo c3= new Complejo();
		c3 = c1.suma(c2);
		//c1 = c2;
		System.out.println(c1.equals(c2));
		System.out.println(c2);
		System.out.println(c1.modulo());
		System.out.println(c2.modulo());
		c3.clone(c2);
		System.out.println(c2);
		System.out.println(c3);
	}

}
