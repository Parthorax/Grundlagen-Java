package Tag_3;

public class Test {
	static int zaehler = 0;
	
	Test() {
		zaehler++;
	}
	public static void main(String[] args) {
		new Test();
		new Test();
		new Test();
		System.out.println(Test.zaehler);

	}

}
