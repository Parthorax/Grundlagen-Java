
public class AufgabeCase {

	public static void main(String[] args) {
		switch(args.length) {
        case 0: System.out.println("0 Parameter"); break;
        case 1: System.out.println("1 Parameter"); break;
        case 2: System.out.println("2 Parameter"); break;
        default: System.out.println("mehr als 2 Parameter"); break;

	}

}
}
