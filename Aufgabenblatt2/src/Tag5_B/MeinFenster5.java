package Tag5_B;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Hier in dieser Version Erweitern wir unser Menü um Untermenüs

public class MeinFenster5 extends JFrame{
	JButton but;
	JLabel lab;
	JTextField txt;
	
	MeineMenuLeiste mz;  //hiermit machen wir die Referenzadresse mp_1_1 in der gesamten klasse "MeinFenster" sichtbar
	
	//Hier beginnt der Konstruktor:
	MeinFenster5(){
		
		
		super();
		mz = new MeineMenuLeiste();
		this.setJMenuBar( mz );
		but = new JButton ("OK");
		
		
		//Textfeld einabuen und Tastatur Überwachen
		JSplitPane teilen = new JSplitPane(JSplitPane.VERTICAL_SPLIT); //Ich baue jetzt ein zwei geteiltes Feld.
		txt = new JTextField();										// Ein teil ist ein Textfeld mit Scrollfunktion
		txt.addKeyListener(new TasteFarbe());		
		lab = new JLabel("Ihr Text");								//der 2. Teil ist ein Label (Überschrift) die sich nach enter verändert		
		lab.addMouseListener( new MeineMaus());						//Maus überwachen:
		teilen.add(lab, JSplitPane.TOP);							//Hier sagt er, dass im oberen Teil das Label reinkommt
		teilen.add(txt, JSplitPane.BOTTOM);						//Hier sagt er, dass das untere Mit dem Textfeld belegt wird 	
		this.getContentPane().add(teilen);
		
		
		this.setSize(900, 300);
		this.getContentPane().setLayout(new GridLayout(2,1));
		
		this.getContentPane().add(but);
		//this.getContentPane().add(lab);
		this.setVisible(true);
	}
	//Innere Klasse fürs menü
	class MeineMenuLeiste extends JMenuBar{		//Hier definieren wir die Eigenschaften der Klasse
		JMenu m_1;
			JMenuItem mp_1_1;
		//Erweiterung-------------	
		JMenu m_1_sub;
			JMenuItem mp_1_sub_1;
			JMenuItem mp_1_sub_2;
		//------------------------	
			JMenuItem mp_1_2;
			JMenuItem mp_1_3;
		
	
			
		//Konstruktor
		MeineMenuLeiste(){
			super();							//Hier werden mittels super ein Objekt der Klasse MenuBar 
			m_1 = new JMenu ("Auswahl");		//und die Eigenschaften (MenuItem) instanziert
			m_1.setMnemonic('A');
				mp_1_1 = new JMenuItem( "rot");
				mp_1_2 = new JMenuItem( "blau");
				mp_1_3 = new JMenuItem( "beenden");
				
			//Sub Menu
			m_1_sub = new JMenu("Sub-Menu");
			  mp_1_sub_1 = new JMenuItem( "hellgrau");
			  mp_1_sub_2 = new JMenuItem( "grau");
			  m_1_sub.add(mp_1_sub_1);
			  m_1_sub.add(mp_1_sub_2);
			  
			  
			m_1.add( mp_1_1 );				//Die Visuelle Darstellung erfolgt erst mit add Methode	
			m_1.addSeparator(); 			//Macht ne Trennlinie
			m_1.add( mp_1_2 );
			m_1.add( m_1_sub);				//Sub Menu
			m_1.add( mp_1_3 );
			
			this.add( m_1);
			
			mp_1_1.setAccelerator ( KeyStroke.getKeyStroke('R', InputEvent.CTRL_MASK)); //Sorgt für eine Abkürzung mit STRG+R
			mp_1_1.addActionListener(new MeineAktion());
			mp_1_2.addActionListener(new MeineAktion());
			mp_1_3.addActionListener(new MeineAktion());
			mp_1_sub_1.addActionListener(new MeineAktion());
			mp_1_sub_2.addActionListener(new MeineAktion());
			
		}//Ende Konstruktor
	}//Ende der Inneren Klasse MeineMenuLeiste
	
	//innere Klasse MeineAktion
	class MeineAktion implements ActionListener {
		@Override //überschreiben
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
			if(s.equals("hellgrau")){
				but.setBackground(Color.GRAY);
			}
			if(s.equals("grau")){
				but.setBackground(Color.DARK_GRAY);
			}
		}//Ende der Methode action Performed()
	}//Ende der inneren Klasse MeineAktion()
	
	//Innere Klasse KeyListener
	class TasteFarbe extends KeyAdapter{
		@Override //Überschreiben
		public void keyPressed( KeyEvent e){
			//Linefeed (Return Taste)
			if(e.getKeyCode() == 10){
				lab.setText( txt.getText());
			}
		}//Ende Methode KeyEvent
	} // Ende Klasse KeyListener  
	
	//Innere Klasse Meine Maus
	class MeineMaus extends MouseAdapter {
		@Override
		public void mouseClicked (MouseEvent b){
			if( b.getButton() == MouseEvent.BUTTON1){
				lab.setText("linke Maustaste");
			}
			if(b.getButton() == MouseEvent.BUTTON3){
				lab.setText("Rechte Maustate");
			}
		}//Ende Methode mouseClicked
	}//Ende der Klasse MeineMaus()
}
