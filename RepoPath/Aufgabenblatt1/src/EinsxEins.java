
public class EinsxEins {
	public static void main (String [] args)
    {
    // Zeile
    for( int z = 1; z <= 10; z++)
      {
      // Spalte in der Zeile
      for( int s = 1; s <= 10; s++)
        {
        // Abstand
        if( z * s < 10) System.out.print( " ");
        if( z * s < 100) System.out.print( " ");
        
        System.out.print( "  " + z * s);     // Produkt
      }
      
      System.out.println();           // Zeilenvorschub
    }
  }
}
