package Tag5_B;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Prog5 { //Es darf pro Datei nur eine public class geben

	public static void main(String[] args) { //Der Zugriffsmodifizierer public bedeutet, dass die Methode in Ihrem Programm �berall verwendet 
											//	werden kann; void bedeutet, dass sie keinen Wert zur�ckgibt. 
								
		new MeinFenster5();		//Ich rufe jetzt mein  kreirtes Fenster auf. Ein Konstruktor erzeugt immer ein neues Objekt.
		

	}
	

}
class ProgEnde extends WindowAdapter {				//Hier f�ge ich die Methode zum Schlie�en eines Fensters mit klick auf X
	public void windowClosing ( WindowEvent e) {	//window muss hier klein geschrieben werden
		System.exit(0);
	}
}
