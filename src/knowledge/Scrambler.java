package knowledge;

import java.util.Random;

public class Scrambler {

	public static String mix(String name) {
		Random rgen = new Random();  // Random number generator
		StringBuilder stringBuilder = new StringBuilder(name);
		for (int i = 1; i < name.length(); i++) {

			int randomPosition = rgen.nextInt(name.length());
			char temp = stringBuilder.charAt(i);
			stringBuilder.setCharAt(i, stringBuilder.charAt(randomPosition));
			stringBuilder.setCharAt(randomPosition, temp);
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		String name = "Zenon Kowalski";
		System.out.println(mix(name));
	}
}
