public class Prog {
	public static void main (String [] args) {
	
	Fahrzeug f = new Fahrzeug ( );	// Referenzadresse f von Typ Fahrzeug den ich selber
									// gebaut habe
	System.out.println ( "Tankfüllung: " + f.Tank +" Liter "  + "Farbe: " + f.farbe);
	

	Fahrzeug f2 = new Fahrzeug (50, "blau");   // er sucht new Fahrzeug und sieht da ist was drin und es übernimmt die Werte für das Obj								
	System.out.println ( "Tankfüllung: " + f2.Tank +" Liter "  + "Farbe: " + f2.farbe);
}
}
