package coffee.shop;

public class Black {

	public Black() {
		System.out.println("6");
		this.name = "black coffee";
		System.out.println(milk);
	}

	{
		System.out.println("1");
		milk = true;
	}

	public String name;
	public boolean milk = false;

	{
		System.out.println("4");
		System.out.println(name);
	}

	{
		System.out.println("5");
		milk = true;
	}

	public static void main(String[] args) {
		// first fields and block codes in order, later constructors
		Black black = new Black();
		System.out.println(black.name + ", " + black.milk);
	}
}
