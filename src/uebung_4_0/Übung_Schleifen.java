package uebung_4_0;

public class �bung_Schleifen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maximum = 1000000;
		int summe = 0;
		int n = 0;

		while ( summe <= maximum) {
			System.out.println("Zahl " + n + " " + summe);
			n = n + 1;
			summe = summe + 1 * n;
		}
	}

}
