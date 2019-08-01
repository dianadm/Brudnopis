package codewars;

public class Force {

//  value of G = 6.67 x 10-11N.kg–2.m2
// 1ft = 0.3048m
// 1lb = 0.453592kg

    static double G = 6.67 * Math.pow(10, -11);

    enum MassUnit {
        kg(1000),
        g(1),
        mg(0.001),
        μg(0.000001),
        lb(453.592);
        double factor;

        MassUnit(double f) {
            factor = f;
        }
    }

    enum DistanceUnit {
        m(1),
        cm(0.01),
        mm(0.001),
        μm(0.000001),
        ft(0.3048);
        double factor;

        DistanceUnit(double f) {
            factor = f;
        }
    }

    public static double solution(double[] arrVal, String[] arrUnit) {
        double m1 = convertMass(arrVal[0], arrUnit[0]) * 0.001; // mass in kg
        double m2 = convertMass(arrVal[1], arrUnit[1]) * 0.001;
        double r = convertDistance(arrVal[2], arrUnit[2]); // in m
        return (G * m1 * m2) / Math.pow(r, 2);
    }

    private static double convertMass(double m, String unit) {
        MassUnit massUnit = MassUnit.valueOf(unit);
        return m * massUnit.factor;
    }

    private static double convertDistance(double r, String unit) {
        DistanceUnit dUnit = DistanceUnit.valueOf(unit);
        return r * dUnit.factor;
    }


    private static void test(double expected, double[] arrVal, String[] arrUnit) {
        System.out.println(expected);
        System.out.println(solution(arrVal, arrUnit));
    }

    public static void main(String[] args) {
/*
[54526.93457153215, 5.953525843336218E10, 4.019957211588913E8]
[kg, mg, cm]
[23813.578166328323, 1.0329689009552013E10, 4504010.123938298]
[kg, mg, m]
[76164.06970600571, 2.1851952324333286E10, 1.7588438783747453E7]
[lb, mg, ft]
[8.736960711841411E13, 81545.77558497271, 1.0879127095411938E7]
[μg, lb, ft]*/
//expected:<1.9603564434202502E-14> but was:<1.9603564434202497E-15>

//        test(6.67e-12, new double[] {1000, 1000, 100}, new String[] {"g", "kg", "m"});
        test(6.67e-9, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "m"});
//        test(0.0000667, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "cm"});

        test(0, new double[]{8.736960711841411E13, 81545.77558497271, 1.0879127095411938E7}, new String[]{
                "μg", "lb", "ft"});

    }
}