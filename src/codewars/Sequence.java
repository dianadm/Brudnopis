package codewars;

import java.text.DecimalFormat;

public class Sequence {

    public static int nthterm(int first, int n, int c) {
        return (n == 0) ? first : nthterm(first, n - 1, c) + c;
    }

    public static String seriesSum(int n) {
        DecimalFormat df = new DecimalFormat("0.00");
        if (n == 0) {
            return "0.0";
        }
        double result = 1.0;
        int f = 4;
        for (int i = 1; i < n; i++) {
            result = result + 1.0 / (1 + i * 3);
            f += 3;
        }
        return df.format(result);
    }

    public static String[] reverse(String[] a) {
        StringBuilder text = new StringBuilder(String.join("", a));
        String[] result = new String[a.length];
        text.reverse();
        for (int i = 0; i < a.length; i++) {
            String element = a[i];
            result[i] = text.substring(0, element.length());
            text = text.delete(0, element.length());
        }
        return result;
    }

    private static void dosht(String el) {
        el = "abc";
    }

    private static void dosht(AAA el) {
        el.w = 11;
    }

    static class AAA {
        public int w = 0;
    }

    public static void main(String[] args) {
//        System.out.println(nthterm(14, 4, 7));

//        System.out.println(seriesSum(2));
//        System.out.println(seriesSum(5));
//        System.out.println(seriesSum(15));

//        String[] tmp = new String[]{"?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH"};
//        System.out.println(Arrays.toString(reverse(tmp)));

        AAA a = new AAA();
        dosht(a);
        System.out.println(a.w);

        String s1 = "test";
        dosht(s1);
        System.out.println(s1);

    }
}
