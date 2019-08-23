package ejercicioClase;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Complejo c1= new Complejo(20,4);
		Complejo c2= new Complejo(1,1);
		Complejo c3= new Complejo();
		c3 = c1.suma(c2);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c2);
		System.out.println(c1.modulo());
		System.out.println(c2.modulo());
		//c3.clone(c2);
		System.out.println(c2);
		System.out.println(c3);
		//c1.compareTo(c3);
		System.out.println(c1.compareTo(c3));
		Complejo[] vc = new Complejo[3];
		vc[0]=c1;
		vc[1]=c2;
		vc[2]=c3;
		for (int i=0; i<3 ; i++){
			System.out.println(vc[i].modulo());
		}
		Arrays.sort(vc);
		for (int i=0; i<3 ; i++){
			System.out.println(vc[i].modulo());
		}
		
	}
