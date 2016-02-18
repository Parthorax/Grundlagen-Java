package Tag4;

import java.awt.event.*;

public class Prog { //Es darf pro Datei nur eine public class geben

	public static void main(String[] args) {
		
		new MeinFenster();		//Ich rufe jetzt mein  kreirtes Fenster auf
		

	}
	

}
class ProgEnde extends WindowAdapter {				//Hier füge ich die Methode zum Schließen eines Fensters mit klick auf X
	public void windowClosing ( WindowEvent e) {	//window muss hier klein geschrieben werden
		System.exit(0);
	}
}
