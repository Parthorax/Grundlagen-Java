import java.text.DecimalFormat; //extra bib für deci funktion

public class Umwandlung {
	   public static void main( String [] args)
	   {
	        final double PI = 3.14159;
	        int radius = 3;
	        
	        double umfang = PI * radius *2;
	        double flaeche = PI * radius * radius;
	        
	        DecimalFormat df = new DecimalFormat ("#####00.00");
	        System.out.println("Umfang betraegt: "+df.format(umfang));
	        System.out.println("Flaeche betraegt: "+df.format(flaeche));  
	   
	   
	   
	   
	     
	     }
}
