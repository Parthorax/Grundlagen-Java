package Tag6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Hier in dieser Version Erweitern wir unser Menü um Untermenüs

public class MeinFenster6 extends JFrame{
	JButton but;
	JLabel lab;
	JTextField txt;
	int b;
	int i;

	
	//Hier beginnt der Konstruktor:
	MeinFenster6(){
		
		
		super();

		but = new JButton ("Ich mache NICHTS");
		
		
		//Textfeld einbauen und Tastatur Überwachen
		JSplitPane teilen = new JSplitPane(JSplitPane.VERTICAL_SPLIT); //Ich baue jetzt ein zwei geteiltes Feld.
		txt = new JTextField();										// Ein teil ist ein Textfeld mit Scrollfunktion
		txt.addKeyListener(new TasteFarbe());		
		lab = new JLabel("Hallo");								//der 2. Teil ist ein Label (Überschrift) die sich nach enter verändert		
		
		teilen.add(lab, JSplitPane.TOP);							//Hier sagt er, dass im oberen Teil das Label reinkommt
		teilen.add(txt, JSplitPane.BOTTOM);						//Hier sagt er, dass das untere Mit dem Textfeld belegt wird 	
		this.getContentPane().add(teilen);
		
		
		this.setSize(900, 300);
		this.getContentPane().setLayout(new GridLayout(2,1));
		
		this.getContentPane().add(but);
		//this.getContentPane().add(lab);
		this.setVisible(true);
	}//Ende Konstruktor MeinFenster6()

	//Innere Klasse KeyListener 
	
	//MODIFIZIERUNG! Überprüfung von Zahlen!
	class TasteFarbe extends KeyAdapter{
		@Override //Überschreiben
		public void keyPressed( KeyEvent e){
			//Linefeed 
			 if(e.getKeyCode() == KeyEvent.VK_ENTER ){			//Hier übernimmt er erst bei Enter die Taste
					int i = Integer.parseInt(txt.getText());		//Verursacht irgendwelche fehler
					int b = i * 2;
					lab.setText("" +b);
					txt.setText("");
				}
			if(e.getKeyCode()>=48 && e.getKeyCode() <= 57 || e.getKeyCode() == KeyEvent.VK_ENTER){			//Überprüft ob meine eingabe auf dem zahlenfeld oben der Tastatur war
				//txt.setText("");
			}
			
			else {
				JOptionPane.showMessageDialog(txt, "keine Int zahl");		//Öffnet ein Dialogfenster mit der Warnung
				txt.setText("");
			}
		}//Ende Methode KeyEvent
	} // Ende Klasse KeyListener  
}//Ende MeinFenster6.java

