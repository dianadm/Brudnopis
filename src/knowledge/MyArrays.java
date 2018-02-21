package knowledge;

import java.util.Arrays;

public class MyArrays {

	static int arr1[] = {10, 20, 30};
	static int[] arr2 = new int[10];
	static int[] arr3 = new int[] {};
	static int arr4[] = new int[] {1, 2};

	public static void main(String[] args) {
		String[] strings = {"abc", "zzzz", "azz"};
		Arrays.sort(strings);
		int[] ints = {1, 10, 12, 3};
		// binarySearch tylko na posortowanych!
		System.out.println(Arrays.binarySearch(ints, 3));
		Arrays.sort(ints);
		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(ints));

		System.out.println(Arrays.binarySearch(ints, 3));

		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		System.out.println(arr4.length);
	}
}
