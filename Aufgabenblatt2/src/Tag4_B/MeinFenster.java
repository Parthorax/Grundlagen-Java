package Tag4_B;


import java.awt.*;   //gibt uns alles was im awt Bib von java selbst zur verfügung
import javax.swing.*;
import java.awt.event.*; //Damit er den ActionListener findet
class MeinFenster extends JFrame{ 		//Mittels Vererbung. Ich will nun einen Button und ein Label in mein Frame kreiren
	
	JButton but;		// Ein knopf und ein feld
	JLabel lab;		//Diese Datentypen ähnlich einem Int (aber keiner) soll zur Klasse "Mein Fenster gehören"
	JLabel lab2;
	
	MeinFenster(){		//Konstruktor heißt wie meine Klasse		
		super( "Mein 3. Window ");   //Real Erben tun wir nur mit Konstruktor aufruf von "Frame"
		but = new JButton ("OK");
		lab = new JLabel("L1");			// Hier initialisiere ich Label und Button mit einem Anfangswert
		lab2= new JLabel("L2");
		
		this.setSize(300, 300);			//Damit setze ich die Dimension
		this.getContentPane().setLayout(new GridLayout(1,2));       //Wir bauen nun wieder ein Raster aber mit neuen Funktionen von Javax.swing.*
		
		JPanel p1 = new JPanel (new GridLayout(2,2));   //Hier Teilen wir die Linke seite des Frames nochmal in 4 Teile
		p1.add( but );p1.add( lab);					//Wir erstellen ein Button und ein Label im neuen Panel
		this.getContentPane().add(p1);				//Wir fügen einen Button und ein Label in die 4 Teile
		
		//Jetzt das zweite Panel
		JPanel p2 = new JPanel (new GridLayout(1,1)); // Eins eins damit es zwangsweise nur 1 feld ist. Hat den Vorteil das alles weggedrängt wird was zuviel wäre
		JTextArea txtA = new JTextArea();			//Ich erstelle mir ein Textfeld
		JScrollPane roll = new JScrollPane(txtA);	//Hier gleich eine Scrollfunktion und übertrage gleich txtA mit.
		p2.add( roll );
		this.getContentPane().add(p2);				//Hier addiere ich das ganze zu unserem Inhalt im Feld
			
		this.setVisible(true);   				//Hier sagen wir das es Sichtbar sein soll
		but.addActionListener(new MeineAktion()); //Hier sage ich ihm das ich eine Aktion auf Button will. Es ist ein Konstruktor Aufruf
												  // es wird also ein objekt erzeugt aus der inneren Klasse.
		this.addWindowListener(new ProgEnde());   //Hier Implementiere ich meine methode aus Prog.java zum schließen
		
		//Ausgeblendet da wir nun mit JFrame arbeiten
		//this.add( but );				// hier sage ich das button und label dazu gehören
		//this.add( lab );
	}
	
	//Hier kommt jetzt die innere Klasse mit Bezug zum grafischen Element in dieser Klasse selbst. 
	//Mit ActionListener implementieren wir (wie beim Erben) die fähigkeit die Apps Main und Maus zu verbinden und den Mausklick zu beobachten
	class MeineAktion implements ActionListener {		//Ich muss noch java.awt.event.* oben schreiben
		
		public void actionPerformed( ActionEvent o){	//Wir erben hier auch die Eigenschaften
			String s = o.getActionCommand();			//hier benutze ich das Ereignis Kommando. Er empfängt jetzt das Klicken auf den Knopf
			if (s.equals("OK")){						// Er überbrüft ob ich OK geklickt habe (Casesensitive!)
				lab.setText("geklickt");				// Und macht dann etwas
			}
		}
	}
}