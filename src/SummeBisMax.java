
public class SummeBisMax {

	public static void main(String[] args) {
		
		int maximum = 100;
		int summe = 0;
		
		System.out.print("Summe = " + summe);
		
		for (int i=1; summe < maximum; i++) {
			summe = summe + i;
			System.out.print(" + " + i);
		}
		
		System.out.print(" = " + summe);

	}

}
