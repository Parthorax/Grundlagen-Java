
public class Hallo {

	public static void main(String[] args) {
	    int b=1;
	    for (int i=0;i<10;i++ ) {
	      
	      
	      System.out.println ("Hallo Welt "+ b);
	      b=b+1;
	    }
	    int i=0;
	    while (i<10) {
	      System.out.println ("Hallo Welt "+ b);
	      b=b+1;
	      i=i+1;    
	    } // end of while
	    i=0;
	    do {
	      System.out.println ("Hallo Welt "+ b);
	      b=b+1;
	      i=i+1;
	    } while (i<10); // end of do-while
	    
	    //Mit Modulo
	    for (b=0;b<10;b++ ) {
	      
	      if (b%2==0) {
	        
	        
	        System.out.println ("Hallo Welt "+ b);
	      b=b+1;  }
	    }
	    
	    //Abbuch nach der 5. Ausgabe
	    
	    for (int f = 0; f < 10; f ++){
	    	System.out.println("Hallo Welt" + f);
	    	
	    	if ( f == 4){
	    		break;
	    	}
	    
	    }
	    
	    }
	      
	
}

