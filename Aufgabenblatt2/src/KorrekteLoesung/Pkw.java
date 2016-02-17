package KorrekteLoesung;

class Pkw extends Fahrzeug{
	final int SN; //wir m�chten das die Serie konstant bleibt und sich nicht ver�ndern kann.
	static int zaehler = 1;
	int tueren = 4;
	
	
	Pkw(){
		super ();		//Ruft den Elternmethode aus Fahrzeug.java auf
		SN = Pkw.zaehler++;
	}
	Pkw ( int ps, int vmax, int tank, String farbe){
		super(ps, vmax, tank, farbe);		// Muss mit dem Elternteil passen, auch Reihenfolge
		SN = Pkw.zaehler++; //  Hiermit erh�lt bei jedem Aufruf jeder PKW einen Z�hler
	}
	
	// Aufgabe 5
	Pkw (int tueren, int ps, int vmax, int tank, String farbe){
		super(ps, vmax, tank, farbe);		// Muss mit dem Elternteil passen, auch Reihenfolge
		SN = Pkw.zaehler++; //  Hiermit erh�lt bei jedem Aufruf jeder PKW einen Z�hler
		this.tueren = tueren;
	}
	
	
	//Tag 3 Aufgabe 2
	 /* double fahren (int km){
		 double verbrauch = 0.0;
		 verbrauch = (double) km * 7.0 / 100.0;
		 setTank (getTank() - (int) verbrauch);
		 return verbrauch;
	 }*/
	//Tag 3 Aufgabe 2.1
	double fahren (int km){
		 double verbrauch = 0.0;
		 verbrauch = (double) km * 7.0 / 100.0;
		 tank = tank - (int) verbrauch;
		 return verbrauch;
	}
	// Aufgabe 4
	double fahren (int km, int fahrerNr){
		double verbrauch;
		switch(fahrerNr){
		case 1:
			verbrauch = (double) km * 6.0 / 100.0;
			 tank = tank - (int) verbrauch;
			 return verbrauch;
		case 2:
			verbrauch = (double) km * 7.0 / 100.0;
			 tank = tank - (int) verbrauch;
			 return verbrauch;
		case 3:
			verbrauch = (double) km * 8.0 / 100.0;
			 tank = tank - (int) verbrauch;
			 return verbrauch;
		case 4:
			verbrauch = (double) km * 9.0 / 100.0;
			 tank = tank - (int) verbrauch;
			 return verbrauch;
		case 5:
			verbrauch = (double) km * 10.0 / 100.0;
			 tank = tank - (int) verbrauch;
			 return verbrauch;
		default:
			verbrauch = 0.0;
			return verbrauch;
	
			
			
			
		}
	}

	

}
