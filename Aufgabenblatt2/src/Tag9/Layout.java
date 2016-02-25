package Tag9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout {

	public static void main(String[] args) {
		new MyWindow( "die LayoutManager" );

	}

}

class MeinEnde extends WindowAdapter {
	public void windowClosing( WindowEvent e){
		System.exit(0);
	}
}

class MyWindow extends JFrame {
	JPanel grid, flow, kein;
	
	MyWindow(String str) {
		super(str);
		
		this.setLocation(200,200);
		this.setSize(450,450);
		this.addWindowListener(new MeinEnde());
		
		this.getContentPane().setLayout(new GridLayout(3,1));
		
		this.setJMenuBar(new MeineMenuLeiste());
		
		grid = new JPanel(new GridLayout(2,3));
		grid.setBorder(BorderFactory.createTitledBorder("GridLayout"));
		
		flow = new JPanel (new FlowLayout());
		flow.setBorder(BorderFactory.createTitledBorder("FlowLayout"));
		
		kein = new JPanel ();
		kein.setBorder(BorderFactory.createTitledBorder("NIXLayout"));
		
		//GridLayout
		for(int i=0;i<=5;i++){
			grid.add(new JButton("Ok"+i));
		}
		//FlowLayout
		JButton [] b1 = new JButton[6];
		for(int i = 0; i<=5; i++){
			b1[i]=new JButton("Ok"+i);
			b1[i].setPreferredSize(new Dimension(80, 30));
		flow.add(b1[i]);
		}
		//NIX Layout
		JButton [] b2 = new JButton[6];
		for( int i =0; i>=2; i++){
			b2[i] = new JButton ("OK"+i);
			b2[i].setBounds(5, (i*35)+15, 80, 30);
			kein.add(b2[i]);
		}
		for(int i = 3; i<=5; i++){
			b2[i]=new JButton ("OK"+i);
			b2[i].setBounds(85*(i-1), 15, 80, 30);
			kein.add(b2[i]);
		}
		this.getContentPane().add(grid);
		this.getContentPane().add(flow);
		this.getContentPane().add(kein);
		this.setVisible(true);
	}
	
class MeineAktion implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		//Menü
		if (str.equals("Metal")){
			try{
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
				SwingUtilities.updateComponentTreeUI(MyWindow.this);
				MyWindow.super.setTitle("Metall");
			}catch(Exception ee){System.out.println("Marcel ist doof");
			}
		}
		if(str.equals("Motif")){
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				SwingUtilities.updateComponentTreeUI(MyWindow.this);
				MyWindow.super.setTitle("Motif");
			}catch(Exception ee){
				
			}
		if(str.equals("Windows")){
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				SwingUtilities.updateComponentTreeUI(MyWindow.this);
				MyWindow.super.setTitle("Windows");
				}catch(Exception ee){
					
				}
				
		}
	}
}
}
class MeineMenuLeiste extends JMenuBar{
	JMenu men_1;
	JMenuItem[] mi_1;
	MeineMenuLeiste(){
		men_1= new JMenu("Look and Feel");
		mi_1 = new JMenuItem[3];
		 mi_1[0] = new JMenuItem("Metal");
		 mi_1[1] = new JMenuItem("Motif");
		 mi_1[2] = new JMenuItem("Windows");
		 for (int i= 0; i < mi_1.length; i++){
			 mi_1[i].addActionListener(new MeineAktion());
			 men_1.add(mi_1[i]);
		 }
		 this.add(men_1);
		 men_1.setToolTipText("das Menü für L & A");
	}
}
}

