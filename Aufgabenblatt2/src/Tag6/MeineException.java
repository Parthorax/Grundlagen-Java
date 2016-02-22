package Tag6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
	
	MeinFenster ( String strTitel ) {
		super( strTitel );
		this.setSize(400,300);
		this.addWindowListener( new MeinProgEnde());
		this.getContentPane().setLayout(new GridLayout (1,2));
		
		lab = new JLabel( "Bitte eine Zahl eingeben");
		txt = new JTextField();
		txt.addKeyListener(new TasteZahl());
		
		this.getContentPane().add( lab);
		this.getContentPane().add( txt);
		
		this.setVisible(true);
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