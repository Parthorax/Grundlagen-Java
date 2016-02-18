package Tag4;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AufgabeProg {


	

		public static void main(String[] args) {
			
			new AufgabeFenster();		//Ich rufe jetzt mein  kreirtes Fenster auf
			

		}
		

	}
	class ProgEnde2 extends WindowAdapter {				//Hier füge ich die Methode zum Schließen eines Fensters mit klick auf X
		public void windowClosing ( WindowEvent e) {	//window muss hier klein geschrieben werden
			System.exit(0);
		}
	}
