
class Fahrzeug { 		//geschweifte Klammer �ffnet die Klasse)
	int Tank;
	String farbe;		// kommen keine Werte rein
	
	Fahrzeug( ) {		// Konstruktor  ---> Methode Fahrzeug. Wie Sieht es aus.
		Tank = 0;
		farbe = new String ("rot");
	}

	Fahrzeug ( int a, String b) {	// dieser Konstrukter wird ausgef�hrt in der ein int und ein 
		Tank = a;		// String erwartet wird. Tank wird mit dem int wert gef�llt
		farbe = new String ( b );   // hier handelt es sich um ein neues Objekt darum new
		}
}
