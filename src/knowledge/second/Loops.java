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

	public static void strangeFor2() {
		int x = 0;
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x);
	}

	public static void notCompilingFors() {
/*
		int x = 0;
		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
			System.out.print(x + " ");
		}
*/

/*		for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
			System.out.print(x + " ");
		}
*/

/*		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x); // DOES NOT COMPILE
*/
	}

    public static void main(String[] args) {
        testSwitch(10);
        testWhile();
		strangeFor2();
    }
}
