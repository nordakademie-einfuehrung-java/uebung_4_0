package uebung_4_0;

public class Uebung_4_0 {

	public static void main(String[] args) {
		int summe = 0;
		int maximum = 500;
		int addition = 1;
		int doppelsumme=1;
		while(doppelsumme < maximum){
		System.out.println( summe + "+" + addition + "=" + doppelsumme );
		summe = summe+addition;
		addition=addition+1;
		doppelsumme= summe+addition;
		}
	}

}
