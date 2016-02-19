package KorrekteLoesung;

public class Prog {

	public static void main(String[] args) {
		//Aufgabe 1
		Fahrzeug f = new Fahrzeug();
		System.out.println(f.getPs());
		
		Fahrzeug ford = new Fahrzeug (60,80,40,"rot");
		System.out.println(ford.getPs());
		
		//Aufgabe 2
		System.out.println("----------------Aufgabe 2------------------------");
		Pkw b = new Pkw();
		System.out.println(b.getPs());
		
		Pkw bmw = new Pkw (65,88,60, "blau");
		System.out.println("PS= "+bmw.getPs());
		System.out.println("Vmax= "+bmw.getVmax());
		System.out.println("Tank= "+bmw.getTank());
		System.out.println("Farbe= "+bmw.getFarbe());
		
		//Aufgabe 3
		System.out.println("----------------Aufgabe 3------------------------");
		int [] psListe = {50,60,80,120,140};
		int [] vmaxListe = {120,150,180,200,210};
		int [] tankListe = {40, 50, 60, 70, 80};
		
		String farbListe [] = new String[5];      //So wie eine ganze Zahl default ein Integer ist und eine gleitkomma Zahl ein double
			farbListe[0] = new String("rot");	  // ist alles in "" ein string. Man kann auch z = "rot" schreiben
	 		farbListe[1] = new String("blau");
	 		farbListe[2] = new String("grün");
	 		farbListe[3] = new String("gelb");
	 		farbListe[4] = new String("BLACK");
	 		
	 	Pkw [] vw = new Pkw[5];
		 for(int i = 0; i < vw.length; i++){
			 vw[i] = new Pkw(tankListe[i], vmaxListe[i], psListe[i], farbListe[i]);
			 System.out.print(vw[i].getTank()+" ");
			 System.out.print(vw[i].getPs()+" ");
			 System.out.print(vw[i].getVmax()+" ");
			 System.out.println(vw[i].getFarbe());
			 System.out.println( "Seriennummer " + vw[i].SN); //Auch für Aufgabe 5
		 }
			 
		//Aufgabe 4
		 System.out.println("----------------Aufgabe 4------------------------");
		Fahrzeug mazda = new Fahrzeug (50,120,50,"rot");
		double d = mazda.fahren(250);
		System.out.println("Verbrauch = "+d);
		
		System.out.println("PS= "+mazda.getPs());
		System.out.println("Vmax= "+mazda.getVmax());
		System.out.println("Tank= "+mazda.getTank());
		System.out.println("Farbe= "+mazda.getFarbe());
		
		//Aufgabe 5
		System.out.println("----------------Aufgabe 5------------------------");
		mazda.setPs(-1);
		mazda.setPs(301);
		
		mazda.setFarbe(null);
		
		//Aufgabe 6
		System.out.println("----------------Aufgabe 6------------------------");
		mazda.tanken(59);
		System.out.println(mazda.getTank());
		
		//Aufgabe 7
		System.out.println("----------------Aufgabe 7------------------------");
		int kw = mazda.psZuKw(90);
		System.out.println("90 Ps = "+kw+" kw");
			 
		//Tag 3 Aufgabe 2
		System.out.println("----------------TAG 3 Aufgabe 2------------------------");
		Pkw b3 = new Pkw(50, 90, 100, "rot");
		double d3 = b3.fahren(250);
		System.out.println("Verbrauch Aufgabe 2 = "+d3+" der tank "+b3.getTank());
		
		// Tag 3 Aufgabee 3
		
		System.out.println("----------------TAG 3 Aufgabe 3------------------------");
		Pkw p3 = new Pkw();
		double l3 = p3.fahren(250, 5);  //hier geben wir 2 parameter über, daher weiß er das wir die case methode wollen
		System.out.println("Verbrauch Aufgabe 3 = "+l3+" der tank "+b3.getTank());
		
		
		//Tag 3 Aufgabe 4
		System.out.println("----------------TAG 3 Aufgabe 4------------------------");
		Pkw neu = new Pkw(); //Test erstellung
		System.out.println("So viele Autos wurden erstellt: "+Pkw.zaehler);
		
		// Aufgabe 6
		System.out.println("----------------TAG 3 Aufgabe 6------------------------");
		String s1 = "Hallo Welt";
		String s2 = "Hallo";
		boolean kk = s1.equals(s2);
		System.out.println(kk);
		
		//teilen
		
		String s3 = s1.substring(0,5);
		System.out.println(s3);
	
		
			 
	}

}
