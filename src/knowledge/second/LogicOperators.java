package knowledge.second;

public class LogicOperators {

	public static void main(String[] args) {
		String name1 = null, name2 = "Test";

//		NullPointerException
//		if (name1 != null & name1.equals("Test")) {
//			System.out.println("1");
//		}

		if (name1 != null && name1.equals("Test")) {
			System.out.println("2");
		}

		//		NullPointerException
/*
		if (name2.equals("Test") | name1.equals("Test")) {
			System.out.println("3");
		}
*/

		if (name2.equals("Test") || name1.equals("Test")) {
			System.out.println("4");
		}


	}
}
