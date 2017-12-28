package knowledge;

public class MyPrimitives {

	byte b = 1;
	short s = 2;
	int i = 3;
	long l = 4;
	float f = 5f;
	double d = 6.0;
	char ch = 'a';

	long m = 3123456789L;
	/*
	* primitives:
	* boolean true/false
	* byte 8-bit integral value -128:127
	* short 16-bit integral value
	* int 32-bit integral value
	* long 64-bit integral value
	* float 32-bit floating point value 123.45f
	* double 64-bit floating point value 123.456
	* char 16-bit unicoe value 'a'
	* */

	/*
	default values :
	boolean false
	byte, short, int 0
	long 0 {0L}
	float 0.0 {0.0f}
	double 0.0 {0.0d}
	char '\u0000' (NUL)
	object reference null
	 */

	int million = 1_000_000; // feature from java 1.7
	//	double m1 = _100.00; // not compile
	//	double m2 = 1000.00_; // not compile
	//	double m3 = 1000_.00; // not compile

	public static void printNumbers() {
		System.out.println(56);
		System.out.println(0b11); // 3 binary
		System.out.println(017); // 15 octal
		System.out.println(0x1F); //31 hexadecimal
	}

}
