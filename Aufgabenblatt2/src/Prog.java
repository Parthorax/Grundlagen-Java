public class Prog {
	public static void main (String [] args) {
	
	Fahrzeug f = new Fahrzeug ( );	// Referenzadresse f von Typ Fahrzeug den ich selber
									// gebaut habe
	System.out.println ( "Tankf�llung: " + f.Tank +" Liter "  + "Farbe: " + f.farbe);
	

	Fahrzeug f2 = new Fahrzeug (50, "blau");   // er sucht new Fahrzeug und sieht da ist was drin und es �bernimmt die Werte f�r das Obj								
	System.out.println ( "Tankf�llung: " + f2.Tank +" Liter "  + "Farbe: " + f2.farbe);
}
}
