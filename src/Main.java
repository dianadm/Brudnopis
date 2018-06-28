import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

	/**
	 * JAVA
	 * 1. Object oriented
	 * 2. Encapsulation
	 * 3. Platform independent
	 * 4. Robust
	 * 5. Simple
	 * 6. Secure
	 */


	static int age;
	static float h;
	static double d;
	static boolean res;
	static String name;

	public static void main(String[] args) {

		long a = 123456789;
		long b = 9123456789l;

		System.out.println(age);
		System.out.println(h);
		System.out.println(d);
		System.out.println(res);
		System.out.println(name);

		BigDecimal n1 =  new BigDecimal("22.12");
		Double n2 = 23.45;
		BigDecimal n3 = n1.multiply(new BigDecimal(n2));
		System.out.println(n3);
	}
}
