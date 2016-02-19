package Tag5;

import javax.swing.*;

public class MeinFensterSwingAlternativ {
	public static void main (String [] args){
		//eigene Klasse instanzieren
		new MeinFensterSwingAlternativ();
	}
	
	MeinFensterSwingAlternativ(){
		//Alternativ zu erben
		JFrame f = new JFrame( "Mein Fenster" );
		f.setSize(400, 400);
		
		//alternativ zu new MeinProgEnde() von Tag 3 ab Java 1.4
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.getContentPane().add( new JLabel( "Hallo" ));
		//ab java 1.5 auch möglich: f.add( new JLabel ("Hallo"));
		
		f.setVisible(true);
	}

}
