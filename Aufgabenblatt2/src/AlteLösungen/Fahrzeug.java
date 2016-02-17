package AlteLösungen;

class Fahrzeug { 		//geschweifte Klammer öffnet die Klasse)
	int tank;
	int ps;
	int vmax;
	String farbe;		// kommen keine Werte rein
	
	Fahrzeug( ) {		// Konstruktor  ---> Methode Fahrzeug. Wie Sieht es aus.
		ps = 0;
		vmax = 0;
		tank = 0;
		farbe = new String ("rot");
	}
															// this. verursacht das benutzen der Namen in DIESER Klasse angegeben Variable weiterhin
	Fahrzeug ( int tank, int ps, int vmax, String farbe) {	// dieser Konstrukter wird ausgeführt in der ein int und ein 
		this.tank = tank;									// String erwartet wird. Tank wird mit dem int wert gefüllt
		this.ps = ps;
		this.vmax = vmax;
		this.farbe = new String ( farbe );   				// hier handelt es sich um ein neues Objekt darum new
		}
	double fahren (int km) {
		double verbrauch = 0.9 * (double) km;
		tank = tank - (int) verbrauch;
		return verbrauch;
	}
}
