
public class Array {
	  public static void main( String [] args)
	    {
	    
	    /* int a [];        //Ich deklariere den Array a
	    a = new int [10];     //Hier lege ich fest das er 10 Elemente haben soll
	    */
	    
	    int a [] = { 5, 8, 4, 25, 56, 16, 2, 99, 1, 15}; //Hier habe ich wie oben den Array deklariert und gleich mit 10 Zahlen gefüllt
	    double min = 999;                                //fiktive Zahl damit er unten immer den niedrigsten einträgt
	    double max = 0;                                 //größte Zahl soll hier rein
	    for(int i = 0; i < a.length; i++) {
	      if (a[i] < min) {
	        min =a[i];                                 //hier kommt ständig der niedrigste Wert in die hilfsvariable
	      } // end of if
	      if(a[i] > max) {
	        max = a[i];
	      }
	    }
	    System.out.println(max);
	    System.out.println(min);
	    
	    
	    
	  }
}
