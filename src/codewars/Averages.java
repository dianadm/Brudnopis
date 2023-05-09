package codewars;

import java.util.stream.IntStream;

public class Averages {

    public static double[] averages(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return new double[]{};
        }
        double[] result = new double[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            result[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
        }
        return result;
    }

    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) {
                count++;
            }
        }
        return count;
    }

    public static long breakChocolate(long n, long m) {
        if (n <= 0 || m <= 0) {
            return 0;
        }
        return n * m - 1;
    }

    public static int GetSum(int a, int b)
    {
        return IntStream.range(Math.min(a, b),Math.max(a, b)+1).sum();
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(averages(new int[]{1, 3, 5, 1, -10})));
//        System.out.println(Arrays.toString(averages(new int[]{-13, -9})));
//        System.out.println(Arrays.toString(averages(null)));

//        System.out.println(dontGiveMeFive(1, 9)); // 8
//        System.out.println(dontGiveMeFive(4, 17)); // 12
//        System.out.println(dontGiveMeFive(29, 76)); // 34

//        System.out.println(breakChocolate(5, 5));

        System.out.println(GetSum(0, -1));
        System.out.println(GetSum(2, 2));
        System.out.println(GetSum(0, 1));
    }
}
