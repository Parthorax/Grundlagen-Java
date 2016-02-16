
public class Fahrenheit {
	 public static void main(String[] args) {
	      int c;

	      for (c = -40; c <= 150; c += 10) {
	         System.out.printf("%5d°C\t%5d°F\n", c, (int)((c * 9.0 / 5.0) + 32));
	      }
	   }

}
