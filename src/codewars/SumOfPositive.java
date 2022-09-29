package codewars;

import java.util.Arrays;

public class SumOfPositive {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j > 0) {
                sum += j;
            }
        }
        return sum;
    }

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int liters(double time)  {
        if (time < 0){
            return 0;
        }
        return (int) (time * 0.5);
    }

    public static int getAverage(int[] marks){
        int sum = Arrays.stream(marks).sum();
        return sum/marks.length;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{-1, -2, 0, 2, 1}));
        System.out.println(solution("world"));
        System.out.println(liters(5));
        System.out.println(getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }
}
