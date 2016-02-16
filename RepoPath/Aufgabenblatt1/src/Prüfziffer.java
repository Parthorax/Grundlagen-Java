
public class Prüfziffer {

	public static void main(String[] args) {
		int nummer = 9290701;
		
		int hilf = nummer;
		int quer = 0;
		int Stelle [] = new int [18];
		
		for ( int i = 0; i < 18; i++) {
			Stelle[i] = hilf % 10;
			System.out.println( "Pos" + i + " = " + Stelle[i]);
			hilf /= 10 ;
			
			quer += Stelle [i];
		}
		System.out.println("Quersumme = "+quer);
		int pruef = quer % 3;
		System.out.println("Prüfzifer = " + pruef);
	}

}
