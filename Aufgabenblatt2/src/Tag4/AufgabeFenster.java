package Tag4;
import java.awt.*;   //gibt uns alles was im awt Bib von java selbst zur verfügung
import java.awt.event.*; //Damit er den ActionListener findet
class AufgabeFenster extends Frame{ 		//Mittels Vererbung. Ich will nun einen Button und ein Label in mein Frame kreiren
	
	Button [] but;		// Ein knopf und ein feld. Für Die Aufgabe sollen 2 knöpfe entstehen darum noch ein array daraus gemacht
	Label [] lab;		//Diese Datentypen ähnlich einem Int (aber keiner) soll zur Klasse "Mein Fenster gehören"
	int zaehler = 1;	//Zähler für die Aufgabe eingefügt. Zählt unten die klicks
	
	AufgabeFenster(){		//Konstruktor heißt wie meine Klasse		
		super( "Mein 2. Window ");   //Real Erben tun wir nur mit Konstruktor aufruf von "Frame"
		but = new Button [2];
			but[0] = new Button ("OK");
			but[1] = new Button ("Löschen");
			but[0].setForeground(Color.BLUE);		//Buttons färben für aufgabe 4
			but[1].setForeground(Color.RED);
		lab = new Label[4];			// Hier initialisiere ich Label und Button mit einem Anfangswert
		for( int i = 0; i <lab.length; i++){  //Für die neue Aufgabe brauchen wir nun 4 Label
			lab[i] = new Label ("L"+i);
			this.add( lab[i]);
		}
		Font standardSchrift = new Font(				//Wir erzeugen eine neue Schriftform (Aufgabe 5)
									"Serif", Font.BOLD, 14);
		lab[0].setFont(standardSchrift);				//Wir Sagen dass das erste Label diese Schriftform haben soll
		
		this.setSize(300, 300);			//Damit setze ich die Dimension
		this.add( but [0] );				// hier sage ich das button und label dazu gehören
		this.add( but [1] );			// Für die Aufgabe brauchen wir nun 2 Button
		
		this.setLayout( new GridLayout(2,3));  //Hier Sagen wir das wir ein Raster mit 2 Feldern wollen oben und unten. 1,2 wäre links rechts, 1,1 wäre ein feld, 2,2 wären 4 Felder
		this.setVisible(true);   				//Hier sagen wir das es Sichtbar sein soll
		//Aufgabe 3
		but[0].addActionListener(new MeineAktion2()); //Hier sage ich ihm das ich eine Aktion auf Button will. Es ist ein Konstruktor Aufruf
		but[1].addActionListener(new MeineAktion2()); // es wird also ein objekt erzeugt aus der inneren Klasse.
		this.addWindowListener(new ProgEnde2());   //Hier Implementiere ich meine methode aus Prog.java zum schließen
		//Aufgabe 6 & 7
		this.setLocation(740, 450);				//Verändert die Position des Fensters beim ersten aufruf und stellt ihn in die mitte.
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		int monitorBreite = d.width;
		int monitorHoehe = d.height;
		System.out.println("Breite: "+monitorBreite); //Gibt in der Konsole die Auflösung an. In meinem fall 1920x1080
		System.out.println("Höhe: "+monitorHoehe);
		
		
		
	}
	
	//Hier kommt jetzt die innere Klasse mit Bezug zum grafischen Element in dieser Klasse selbst. der Button
	//Mit ActionListener implementieren (wie beim Erben) die fähigkeit Main und Maus zu verbinden und den Mausklick zu beobachten
	class MeineAktion2 implements ActionListener {		//Ich muss noch java.awt.event.* oben schreiben
		
		public void actionPerformed( ActionEvent o){	//Wir erben hier auch die Eigenschaften
			String s = o.getActionCommand();			//hier benutze ich das Ereignis Kommando. Er empfängt jetzt das Klicken auf den Knopf
			if (s.equals("OK")){						// Er überbrüft ob ich OK geklickt habe (Casesensitive!)
				lab[0].setText("Hallo");				// Und macht dann etwas
				lab[1].setText("geklickt: "+zaehler++);
			}											//Hier ist else gar nicht nötig
			if(s.equals("Löschen")){
				lab[0].setText(null);					//Löscht den Text auf dem label 1
				lab[1].setText("geklickt: "+zaehler++);	//Der Zähler
			}
		}
	}
}