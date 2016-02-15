
public class Parameter {
	public static void main(String [] args){
		int argss = args.length;
		if (argss != 3)
		{
			System.out.println("Zu wenig Input! Mehr Input = 3 Input!");
		}
		else {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		}
	}

}
