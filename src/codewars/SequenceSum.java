package codewars;


import java.util.Arrays;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        int[] result = new int[Math.abs(n)+1];
        for(int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] + (n > 0 ? i : -i);
        }
        return result;
    }

    public static int[] sumOfN2(int n) {
        int[] result = new int[Math.abs(n)+1];
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result[i] = result[i - 1] + i;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN2(10)));
    }
}
