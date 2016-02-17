package Tag_3;

public class Prog {


		final static int WERT = 25;		//Hier damit es zuerst gelesen wird
		//1.4
		final String GRUNDFARBE;
		final int K;				//Konstanten ohne Initialisierung. Werden erst beim Aufruf initialisiert
		static int zaehler;
		public static void main(String[] args) {			//Static heißt das man das Programm aufrufen kann ohne ein Objekt daarzustellen
			tuWas();
			//Aufgabe 1.3			
			Prog a = new Prog ();
			a.tuMehr();
			a.zeigFarbe();
			Prog b = new Prog("blau"); //Hier wird ein neues Objekt erstellt mit den im dazugehörigen Konstruktor angegebenen Eigentschaften
			b.zeigFarbe();
			System.out.println(b.K);
			
			//Alternativ für 1.4:
			// dann braucht man auch kein prog ohne parameter und auch kein void
			if (args.length == 1){
				a = new Prog (args[0]);	
			}else {
				a = new Prog("weiss");
			}
			
		}
		
		
		static void tuWas(){			//Das muss außerhalb der Main sein, weil es wie main eine Methode ist
			System.out.println("Klassenmethode");
			System.out.println(WERT);
		}
		
		//1.3
		void tuMehr(){					//Kann man nur in dieser Class nutzen da static fehlt
			System.out.println(WERT);
			
		}
		//1,4
		void zeigFarbe(){			//Kann man nur in dieser Class nutzen da static fehlt
			System.out.println(GRUNDFARBE);
		}
		Prog(){
			GRUNDFARBE = "rot";
			zaehler++;
			K = zaehler;
		}
		Prog(String Gfarbe){
			GRUNDFARBE = Gfarbe;
			zaehler++;
			K = zaehler;
		}
	}
