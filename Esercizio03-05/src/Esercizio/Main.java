package Esercizio;

import Esercizio2.Sim;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo r1 = new Rettangolo(2, 3);
	Rettangolo r2 = new Rettangolo(5, 3);
	r1.area();
	r2.area();
	
	areaPerimetro(r1, r2);
	
	
	
	
	
	
}

static void areaPerimetro(Rettangolo r1, Rettangolo r2) {
	double c = r2.a + r1.a;
	double d = r2.p + r1.p;
	System.out.println("area sommata= " + c + " perimetro sommato= " + d);
}
		
		
		
		
	}
}
