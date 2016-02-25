package Tag9;

import java.lang.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class MeineException {

	public static void main(String[] args) {
		new MeinFenster ( "Fenster Exception");
	}
}
class MeinProgEnde extends WindowAdapter {
	public void windowClosing( WindowEvent e){
		System.exit(0);
	}
}
class MeinFenster extends JFrame {
	JLabel lab;
	JTextField txt;
	JTextArea txtA;
	
	
	
	
	MeinFenster ( String strTitel ) {
		super( strTitel );
		this.setSize(400,300);
		this.addWindowListener( new MeinProgEnde());
		this.getContentPane().setLayout(new GridLayout (1,3));
		this.setJMenuBar(new MeinMenu());
		
		
		
		lab = new JLabel( "Bitte eine Zahl eingeben");
		lab.setToolTipText("Hallo");
		txt = new JTextField();
		txtA = new JTextArea();
		txt.addKeyListener(new TasteZahl());
		
		this.getContentPane().add( lab);
		this.getContentPane().add( txt);
		this.getContentPane().add( txtA);
		
		this.setVisible(true);
	}
	void ordnerLesen(){			
		File f = new File(".");			//Punkt wie bei DOS heiﬂt "Hier in diesem ordner"
		if(f.exists()){					//Existiert dieser Ordner
			String [] liste = f.list();  //Die Klasse File hat jede Menge Methoden, eine ist "Liste mal auf" wie hier
			for(int i=0; i<liste.length; i++){		//Bei dieser Methode listet er ins Textfeld alle Dateien in diesem Ordner
				txtA.append(liste[i]+"\n");
			}
		}
	}
	
	void dateiSchreiben() {						
		JFileChooser ausw = new JFileChooser (".");
		File f = new File (".");
		int r = ausw.showSaveDialog(this);
		f = ausw.getSelectedFile();		//Wenn man nix selektiert hat, kommt da auch nichts rein. Ansonsten der Dateiname
		if(r == JFileChooser.APPROVE_OPTION && f != null) {		//Randdialog. Fragen ob ein Dateiname ausgew‰hlt worden ist und im Anschluss
			try {												//holt er die Eingabe der Entertaste oder "Speichertaste"
				FileOutputStream fos = new FileOutputStream( f);   //Methode zur Dateispeicherung. Fos = Gepufferte Speicherung (langsam)
				ObjectOutputStream oos = new ObjectOutputStream( fos); //Oos ¸bernimmt die Optimierung der Speicherung (grˆﬂe und Art der Speicherung, wie FAT oder NTFS etc.)
				oos.writeObject(txtA.getText()); //Aus dem Textfeld wird nun unabh‰ngig von Grˆﬂe, der Text rausgezogne und gespeichert
				oos.flush(); //lˆscht den Cache und erzeugt einen Schreibzwang
				fos.close(); //Schlieﬂt die Speicherfunktion.
			} catch (IOException e) {
		    } catch(Exception e) {
		    	
		    }
		}
	}
	void schreibeTextZeile(){
		String s = "Meier, bla bla, 23";
		try{
			FileWriter fw = new FileWriter("Protokoll.txt", true); //Wenn True da steht soll es angeh‰ngt werden, sonst wirds ¸berschrieben
			BufferedWriter bw = new BufferedWriter (fw); //Optimaler Schreibmodus der sehr Schnell ist.
			bw.write(s);
			bw.newLine(); //Zeilenumbruch
			bw.flush();
			fw.close();
		}catch (IOException e) {
	    }
	}
	void leseTextZeile(){
		//String s = "Meier, bla bla, 23";
		String s;
		try{
			FileReader fr = new FileReader("Protokoll.txt"); //Wenn True da steht soll es angeh‰ngt werden, sonst wirds ¸berschrieben
			BufferedReader br = new BufferedReader (fr); //Optimaler Schreibmodus der sehr Schnell ist.
			while( (s = br.readLine()) != null){
				txtA.append(s+"\n");
			}
			fr.close();
		}catch (IOException e) {
	    }
	}
	void dateiLesen() {
		JFileChooser ausw = new JFileChooser (".");
		File f = new File (".");
		int r = ausw.showOpenDialog(this);
		f = ausw.getSelectedFile();		//Wenn man nix selektiert hat, kommt da auch nichts rein. Ansonsten der Dateiname
		if(r == JFileChooser.APPROVE_OPTION && f != null) {		//Randdialog. Fragen ob ein Dateiname ausgew‰hlt worden ist und im Anschluss
			try {												//holt er die Eingabe der Entertaste oder "÷ffnen"Taste
				FileInputStream fis = new FileInputStream( f);   //
				ObjectInputStream ois = new ObjectInputStream( fis); 
				txtA.setText((String) ois.readObject()); 
				fis.close(); //Schlieﬂt die ÷ffnenfunktion.
			} catch (IOException e) {
		    } catch (ClassNotFoundException e){
		    	
		    }
			  catch(Exception e) {
		    	
		    }
		}
	}
	
	class MeinMenu extends JMenuBar {
		JMenu m1;
			JMenuItem [] mi;
		MeinMenu() {
			super();
			m1 = new JMenu("Datei");
			m1.setMnemonic('D'); //Char kommen in einzelt¸ttelchen
			mi = new JMenuItem[6];
				mi[0] = new JMenuItem("Ordner lesen");
				mi[1] = new JMenuItem("Speichern");
				mi[2] = new JMenuItem("÷ffnen");
				mi[3] = new JMenuItem("Protokoll Schreiben");
				mi[4] = new JMenuItem("Protokoll Lesen");
				mi[5] = new JMenuItem("Thema ‰ndern");
				
				for(int i = 0; i<mi.length; i++){
					m1.add(mi[i]);
					mi[i].addActionListener( new MeineAktion());
				}
			this.add(m1);	
		}//Ende MeinMenu() Konstruktor
	}//Ende Klasse MeinMenu
	//Innere Klasse ActionListener
	
	class MeineAktion implements ActionListener {
		public void actionPerformed( ActionEvent e){
			String s = e.getActionCommand();
			if(s.equals("Ordner lesen")){
				ordnerLesen();			//Hier Sage ich ihm das er bei Klick auf "Ordner lesen" diese Methode ausf¸hren soll				
			}
			if(s.equals("Speichern")){
				dateiSchreiben();	//Hier Speichert er den Text
			}
			if(s.equals("÷ffnen")){
				dateiLesen();	//÷ffnet eine Datei und f¸hrt die Methode aus (in diesem Fall ins Textfeld schreiben)
			}
			if(s.equals("Protokoll Schreiben")){  //Schreibt die Zeile aus der Methode schreibeTextZeile
				schreibeTextZeile();
			}
			if(s.equals("Protokoll Lesen")){   // Liest die erstellte TXT Datei
				leseTextZeile();
			}
			 if(s.equals("Thema ‰ndern")){
			 try{
			 UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			 SwingUtilities.updateComponentTreeUI(MeinFenster.this);
			 }
			 catch (UnsupportedLookAndFeelException k){
			 System.out.println("LundF gibts nicht");
			 }
			 catch (ClassNotFoundException k){
			 System.out.println("Klasse nicht gefunden");
			 }
			 catch (Exception k){
			 System.out.println("huhu");
			 }
			 }
//			if(s.equals("METAL")){
//				
//				try{
//					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//					SwingUtilities.updateComponentTreeUI(MeinFenster.this);
//				}
//				catch (Exception k){
//					System.out.println("huhu");
//				}
//			}	
				
		}
	}
	
	//Innere Klasse TasteZahl
	class TasteZahl extends KeyAdapter {
		public void keyPressed( KeyEvent e) {
			int k = e.getKeyCode();
			//Aufgabe 1.1
			/*if( (k >= 48 && k <= 57)
			   ||(k>=96 && k<=105)
			   || (k == 8))
			{	}
			else {
				if ( ( k == 10) && (!txt.getText().equals(""))) {
					int i = Integer.parseInt(txt.getText());
					lab.setText(""+(i*2));
					txt.setText("");
				}
				else {
					JOptionPane.showMessageDialog(lab, "Bitte geben Sie nur Zahlen ein");
					txt.setText("");
				}
			}*/
			//Aufgabe 1.2
			if (k == 10) {
				try {
					int i = Integer.parseInt(txt.getText());
					lab.setText(""+(i*2));
					txt.setText("");
					 
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(lab, "Bitte eine Ganzezahl");
					txt.setText("");
				}
			}
		}
	}
}