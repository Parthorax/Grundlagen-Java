public class Prog {
	public static void main (String [] args) {
	
			Fahrzeug f = new Fahrzeug ( );	// Referenzadresse f von Typ Fahrzeug den ich selber
											// gebaut habe
			System.out.println ( "Tankf�llung: " + f.tank +" Liter "  + "Farbe: " + f.farbe);
			
		
			Fahrzeug f2 = new Fahrzeug (2, 4, 8, "blau");   // er sucht new Fahrzeug und sieht da ist was drin und es �bernimmt die Werte f�r das Obj								
			System.out.println ( "Tankf�llung: " + f2.tank 
								+" Liter "  + "Farbe: " 
								+ f2.farbe + " PS: "
								+ f2.ps+" VMax: "
								+ f2.vmax);
			
							
			//Aufgabe 2
			Pkw p = new Pkw ();
				
			System.out.println("Pkw �berpr�fung: "+p.tank);
			
			//Aufgabe 3
			
			
			 String [] farbListe = new String [5];
			 		farbListe[0] = new String("rot");
			 		farbListe[1] = new String("blau");
			 		farbListe[2] = new String("gr�n");
			 		farbListe[3] = new String("gelb");
			 		farbListe[4] = new String("neger");
			 		
			 		int [] psListe = { 50, 60, 80, 120, 140 };
			 		int [] kmListe = { 120, 200, 300, 800, 1333 };
			 		int [] tankListe = { 5, 8, 10, 15, 100 };
			 		
			 		 Pkw [] vw = new Pkw[5];
					 for(int i = 0; i < vw.length; i++){
						 vw[i] = new Pkw(tankListe[i], kmListe[i], psListe[i], farbListe[i]);
						 System.out.print(vw[i].tank+" ");
						 System.out.print(vw[i].ps+" ");
						 System.out.print(vw[i].vmax+" ");
						 System.out.println(vw[i].farbe);
						 
					 }
			// Aufgabe 4
					 
		    double v = f.fahren(100);
			System.out.println("Verbrauch: " 
								+ v + " Tankf�llung: " 
								+ f.tank);
						
		   // Aufgabe 5	
			
			pFahrzeug k = new pFahrzeug (-50);
				k.setTank(100);		//fehler erzeugen
				System.out.println("kFahr  " + k.getTank());
						
}
}
