package uebung_4_0;

public class SchleifeMaximum {

	public static void main(String[] args) {
		int maximum = 10;
		int summe = 0;
		
		for (int zahl = 1; summe + zahl <= maximum; zahl = zahl + 1){
			summe = summe + zahl;
			System.out.println((summe  - zahl) + " + " + zahl +  " = " + summe);
		}

	}
}
