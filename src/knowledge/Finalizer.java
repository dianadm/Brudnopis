package knowledge;

public class Finalizer {

	/**
	 * finalize call could run zero or one time
	 */
	protected void finalize() {
		System.out.println("Calling finalize");
	}

	public static void main(String[] args) {
		Finalizer f = new Finalizer();
//		System.gc();
	}
}
