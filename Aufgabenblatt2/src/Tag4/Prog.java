package Tag4;

import java.awt.event.*;

public class Prog { //Es darf pro Datei nur eine public class geben

	public static void main(String[] args) {
		
		new MeinFenster();		//Ich rufe jetzt mein  kreirtes Fenster auf
		

	}
	

}
class ProgEnde extends WindowAdapter {				//Hier f�ge ich die Methode zum Schlie�en eines Fensters mit klick auf X
	public void windowClosing ( WindowEvent e) {	//window muss hier klein geschrieben werden
		System.exit(0);
	}
}
