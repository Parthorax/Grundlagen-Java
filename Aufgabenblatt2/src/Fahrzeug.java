
class Fahrzeug { 		//geschweifte Klammer �ffnet die Klasse)
	int Tank;
	String farbe;		// kommen keine Werte rein
	
	Fahrzeug( ) {		// Konstruktor  ---> Methode Fahrzeug. Wie Sieht es aus.
		Tank = 0;
		farbe = new String ("rot");
	}

	Fahrzeug ( int Tank, String farbe) {	// dieser Konstrukter wird ausgef�hrt in der ein int und ein 
		this.Tank = Tank;					// String erwartet wird. Tank wird mit dem int wert gef�llt
		this.farbe = new String ( farbe );   // hier handelt es sich um ein neues Objekt darum new
		}
	double fahren (int km) {
		double verbrauch = 0.9 * (double) km;
		Tank = Tank - (int) verbrauch;
		return verbrauch;
	}
}
