package uebung_4_0;

public class Schleifenuebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maximum = 100;
		int summe = 0;
		
		for ( int x = 1;
			summe + x < maximum;
			x = 1 + x)
		{
			System.out.println(summe + " + " + x + " = " + (summe+x));
			summe = summe + x;
			
		}

	}

}
