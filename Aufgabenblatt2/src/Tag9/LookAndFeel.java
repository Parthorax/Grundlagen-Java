package Tag9;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class LookAndFeel
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               PlafFrame frame = new PlafFrame();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

/**
 *  Ein Frame mit einem Knopffeld, um LookAndFeel zu testen
 */
class PlafFrame extends JFrame
{
	   private JPanel buttonPanel;
	   
	   public static final int DEFAULT_WIDTH = 300;
	   public static final int DEFAULT_HEIGHT = 200;
   public PlafFrame()
   {
      setTitle("L & A Test");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      buttonPanel = new JPanel();
      
      UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
      for (UIManager.LookAndFeelInfo info : infos)
         makeButton(info.getName(), info.getClassName());
      
      add(buttonPanel);
   }

   /**
    *  Knopf erstellen um die verfügbaren L & F zu testen
    * @param "name" gibt dem Knopf seinen Namen
    * @param plafName der Name der L&F Klasse
    */
   void makeButton(String name, final String plafName)
   {
      // Knopf hinzufügen

      JButton button = new JButton(name);
      buttonPanel.add(button);

      // die Aktion beim Knopf drücken festlegen

      button.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               // Knopf Ereignis: wechsel zum neuen look and feel
               try
               {
                  UIManager.setLookAndFeel(plafName);
                  SwingUtilities.updateComponentTreeUI(PlafFrame.this);
               }
               catch (Exception e)
               {
                  e.printStackTrace();
               }
            }
         });
   }


}