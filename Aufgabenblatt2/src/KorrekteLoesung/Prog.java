package KorrekteLoesung;

public class Prog {

	public static void main(String[] args) {
		//Aufgabe 1
		Fahrzeug f = new Fahrzeug();
		System.out.println(f.getPs());
		
		Fahrzeug ford = new Fahrzeug (60,80,40,"rot");
		System.out.println(ford.getPs());
		
		//Aufgabe 2
		Pkw b = new Pkw();
		System.out.println(b.getPs());
		
		Pkw bmw = new Pkw (65,88,60, "blau");
		System.out.println("PS= "+bmw.getPs());
		System.out.println("Vmax= "+bmw.getVmax());
		System.out.println("Tank= "+bmw.getTank());
		System.out.println("Farbe= "+bmw.getFarbe());
		
		//Aufgabe 3
		int [] psListe = {50,60,80,120,140};
		int [] vmaxListe = {120,150,180,200,210};
		int [] tankListe = {40, 50, 60, 70, 80};
		
		String farbListe [] = new String[5];
			farbListe[0] = new String("rot");
	 		farbListe[1] = new String("blau");
	 		farbListe[2] = new String("grün");
	 		farbListe[3] = new String("gelb");
	 		farbListe[4] = new String("neger");
	 		
	 	Pkw [] vw = new Pkw[5];
		 for(int i = 0; i < vw.length; i++){
			 vw[i] = new Pkw(tankListe[i], vmaxListe[i], psListe[i], farbListe[i]);
			 System.out.print(vw[i].getTank()+" ");
			 System.out.print(vw[i].getPs()+" ");
			 System.out.print(vw[i].getVmax()+" ");
			 System.out.println(vw[i].getFarbe());
		 }
			 
		//Aufgabe 4
		Fahrzeug mazda = new Fahrzeug (50,120,50,"rot");
		double d = mazda.fahren(250);
		System.out.println("Verbrauch = "+d);
		
		System.out.println("PS= "+mazda.getPs());
		System.out.println("Vmax= "+mazda.getVmax());
		System.out.println("Tank= "+mazda.getTank());
		System.out.println("Farbe= "+mazda.getFarbe());
		
		//Aufgabe 5
		mazda.setPs(-1);
		mazda.setPs(301);
		
		mazda.setFarbe(null);
		
		//Aufgabe 6
		mazda.tanken(59);
		System.out.println(mazda.getTank());
		
		//Aufgabe 7
		int kw = mazda.psZuKw(90);
		System.out.println("90 Ps = "+kw+" kw");
			 
			 
			 
	}

}
