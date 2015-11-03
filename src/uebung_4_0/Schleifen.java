package uebung_4_0;

public class Schleifen {

	public static void main(String[] args) {

		int maximum = 600;
		int summe = 0;

		for (int zahl = 0; summe <= maximum; zahl++) {
			summe = summe + zahl;
			System.out.println(summe - zahl + " + " + zahl + " = " + summe);

		}
	}

}
