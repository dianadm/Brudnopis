package codewars;

public class Force {

//  value of G = 6.67 x 10-11N.kg–2.m2
// 1ft = 0.3048m
// 1lb = 0.453592kg

    static double G = 6.67 * Math.pow(10, -11);

    public static double solution(double[] arrVal, String[] arrUnit) {

        double m1 = arrVal[0];
        double m2 = arrVal[1];
        double r = arrVal[2];

        return (G * m1 * m2)/(r * r);
    }

    private static void test(double expected, double[] arrVal, String[] arrUnit) {
        System.out.println(expected);
        System.out.println(solution(arrVal, arrUnit));
    }

    public static void main(String[] args) {
//        test(6.67e-12, new double[] {1000, 1000, 100}, new String[] {"g", "kg", "m"});
        test(6.67e-9, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "m"});
//        test(0.0000667, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "cm"});
    }
}
