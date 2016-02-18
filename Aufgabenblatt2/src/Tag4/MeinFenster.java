package Tag4;


import java.awt.*;   //gibt uns alles was im awt Bib von java selbst zur verfügung
class MeinFenster extends Frame{ 		//Mittels Vererbung. Ich will nun einen Button und ein Label in mein Frame kreiren
	
	Button but;
	Label lab;		//Diese Datentypen ähnlich einem Int (aber keiner) soll zur Klasse "Mein Fenster gehören"
	
	MeinFenster(){		//Konstruktor heißt wie meine Klasse		
		super( "Mein 1. Window ");   //Real Erben tun wir nur mit Konstruktor aufruf von "Frame"
		but = new Button ("OK");
		lab = new Label("L1");			// Hier initialisiere ich Label und Button mit einem Anfangswert
		
		this.setSize(300, 300);			//Damit setze ich die Dimension
		this.add( but );				// hier sage ich das button und label dazu gehören
		this.add( lab );
		this.setLayout( new GridLayout(2,1));  //Hier Sagen wir das wir ein Raster mit 2 Feldern wollen oben und unten
		this.setVisible(true);   				//Hier sagen wir das es Sichtbar sein soll
	}

	public static void main(String[] args) {
		
	}

}
