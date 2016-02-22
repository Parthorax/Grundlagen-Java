package Tag5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MeinFenster5 extends JFrame{
	JButton but;
	
	MeineMenuLeiste mz;  //hiermit machen wir die Referenzadresse mp_1_1 in der gesamten klasse "MeinFenster" sichtbar
	
	//Hier beginnt der Konstruktor:
	MeinFenster5(){
		
		
		super();
		mz = new MeineMenuLeiste();
		this.setJMenuBar( mz );
		but = new JButton ("OK");
		
		but.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		
		JPanel p2 = new JPanel (new GridLayout(1,1)); // Eins eins damit es zwangsweise nur 1 feld ist. Hat den Vorteil das alles weggedrängt wird was zuviel wäre
		JTextArea txtA = new JTextArea();			//Ich erstelle mir ein Textfeld
		//Unicode Zeichen
		txtA.append("kyrillisch\n");				//erzeugt im Textfeld alle kyrillischen/arabischen/grie. Buchstaben anhand der Forschleife
		for( int i= 1040; i<1103;i++){
			txtA.append(" "+((char)i));
		}
		txtA.append("\narabisch\n");
		for( int i= 1649; i<1747;i++){
			txtA.append(" "+((char)i));
		}
		txtA.append("\ngriechisch\n");
		for( int i= 913; i<974;i++){
			txtA.append(" "+((char)i));
		}
		
		JScrollPane roll = new JScrollPane(txtA);	//Hier gleich eine Scrollfunktion und übertrage gleich txtA mit.
		p2.add( roll );
		this.getContentPane().add(p2);				//Hier addiere ich das ganze zu unserem Inhalt im Feld
		
		//Rahmen:
		p2.setBorder(BorderFactory.createLineBorder(Color.RED));  //Hiermit mache ich einen roten Rahmen um meinen oberen Panel
		
		this.setSize(900, 300);
		this.getContentPane().setLayout(new GridLayout(2,1));
		
		this.getContentPane().add(but);
		
		this.setVisible(true);
	}
	//Innere Klasse fürs menü
	class MeineMenuLeiste extends JMenuBar{		//Hier definieren wir die Eigenschaften der Klasse
		JMenu m_1;
		JMenuItem mp_1_1;
		JMenuItem mp_1_2;
		JMenuItem mp_1_3;
		
		//Konstruktor
		MeineMenuLeiste(){
			super();							//Hier werden mittels super ein Objekt der Klasse MenuBar 
			m_1 = new JMenu ("Auswahl");		//und die Eigenschaften (MenuItem) instanziert
				mp_1_1 = new JMenuItem( "rot");
				mp_1_2 = new JMenuItem( "blau");
				mp_1_3 = new JMenuItem( "beenden");
			
			m_1.add( mp_1_1 );				//Die Visuelle Darstellung erfolgt erst mit add Methode
			m_1.add( mp_1_2 );
			m_1.add( mp_1_3 );
			
			this.add( m_1);
			
			mp_1_1.addActionListener(new MeineAktion());
			mp_1_2.addActionListener(new MeineAktion());
			mp_1_3.addActionListener(new MeineAktion());
			
		}//Ende Konstruktor
	}//Ende der Inneren Klasse MeineMenuLeiste
	
	//innere Klasse MeineAktion
	class MeineAktion implements ActionListener {					//Vorteile von Listener ist, man kann mehrere Eigenschaften erben
		@Override //überschreiben									nachteil ist, das man jede Methode überschreiben muss
		public void actionPerformed (ActionEvent z){
			String s = z.getActionCommand();
			
			//Menü Ereignisse
			if(s.equals("rot")){
				but.setBackground(Color.RED);
			}
			if(s.equals("blau")){
				but.setBackground(Color.BLUE);
			}
			if(s.equals("beenden")){
				System.exit(0);
			}
		}//Ende der Methode action Performed()
	}//Ende der inneren Klasse MeineAktion()
}
