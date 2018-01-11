package knowledge.second;

public class Loops {

	public static void testSwitch(int a) {
		switch (a) {
		case 0:
			System.out.println("0");
		case 1:
			System.out.println(1);
		default:
			System.out.println("--");
		}
	}

	public static void testWhile() {
		int a = 10;
		while (a > 5) {
			System.out.println(a);
			a--;
		}
		do {
			System.out.println(a);
			a--;
		} while (a > 0);
	}

	public static void strangeFor() {
        for( ; ; ){
            // infinite loop
            System.out.println("hello!!");
        }

	}

    public static void main(String[] args) {
        testSwitch(10);
        testWhile();
    }
}
