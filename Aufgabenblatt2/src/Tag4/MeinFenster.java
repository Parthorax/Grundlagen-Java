package Tag4;


import java.awt.*;   //gibt uns alles was im awt Bib von java selbst zur verfügung
import java.awt.event.*; //Damit er den ActionListener findet
class MeinFenster extends Frame{ 		//Mittels Vererbung. Ich will nun einen Button und ein Label in mein Frame kreiren
	
	Button but;		// Ein knopf und ein feld
	Label lab;		//Diese Datentypen ähnlich einem Int (aber keiner) soll zur Klasse "Mein Fenster gehören"
	
	MeinFenster(){		//Konstruktor heißt wie meine Klasse		
		super( "Mein 1. Window ");   //Real Erben tun wir nur mit Konstruktor aufruf von "Frame"
		but = new Button ("OK");
		lab = new Label("L1");			// Hier initialisiere ich Label und Button mit einem Anfangswert
		
		this.setSize(300, 300);			//Damit setze ich die Dimension
		this.add( but );				// hier sage ich das button und label dazu gehören
		this.add( lab );
		this.setLayout( new GridLayout(2,1));  //Hier Sagen wir das wir ein Raster mit 2 Feldern wollen oben und unten. 1,2 wäre links rechts, 1,1 wäre ein feld, 2,2 wären 4 Felder
		this.setVisible(true);   				//Hier sagen wir das es Sichtbar sein soll
		but.addActionListener(new MeineAktion()); //Hier sage ich ihm das ich eine Aktion auf Button will
		
	}
	
	//Hier kommt jetzt die innere Klasse mit Bezug zum grafischen Element in dieser Klasse selbst. der Button
	//Mit ActionListener implementieren (wie beim Erben) die fähigkeit Main und Maus zu verbinden und den Mausklick zu beobachten
	class MeineAktion implements ActionListener {		//Ich muss noch java.awt.event.* oben schreiben
		
		public void actionPerformed( ActionEvent e){
			String s = e.getActionCommand();			//hier benutze ich das Ereignis Kommando. Er empfängt jetzt das Klicken auf den Knopf
			if (s.equals("OK")){						// Er überbrüft ob ich OK geklickt habe (Casesensitive!)
				lab.setText("geklickt");				// Und macht dann etwas
			}
		}
		
	}

	public static void main(String[] args) {
		
	}

}
