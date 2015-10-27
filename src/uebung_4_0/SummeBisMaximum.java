package uebung_4_0;

public class SummeBisMaximum {

	public static void main(String[] args) {
		int maximum = 1000;
		int summe = 0;
		
		for (int x = 1; x < maximum; x++) {
			summe = summe + x;
			if (summe < maximum) {
			System.out.println(summe);}
		}

	}

}
