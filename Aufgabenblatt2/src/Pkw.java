
 class Pkw extends Fahrzeug{
	 
	 	 	 
	 Pkw () {				//Hiermit kann man in einem anderen Programm über Pkw () ergebnisse aus Fahrzeug () bekommen
		 super();
	 }

	 Pkw (int tank, int vmax, int ps, String farbe){
		 super(tank, vmax, ps, farbe);
	 }
	
	
}
