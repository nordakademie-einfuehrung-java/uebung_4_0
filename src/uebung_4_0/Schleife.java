package uebung_4_0;

public class Schleife {

	public static void main(String[] args) {
		
		//Variablen
		int maximum = 397;
		int summe = 0;
		
		for (int zaehler = 1; summe <= maximum; zaehler = zaehler + 1)
		{ 
			summe = summe + zaehler;
			System.out.println((summe-zaehler)+ " + " + zaehler + " = " + summe);
		}
		

	}

}
