package codewars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Triangles {

    public static char triangle(final String row) {
        String result = row;
        while (result.length() != 1) {
            result = nextRow(result);
        }
        return result.charAt(0);
    }

    public static String nextRow(final String row) {
        char[] firstRow = new char[row.length()];
        row.getChars(0, row.length(), firstRow, 0);
        String result = "";
        for (int i = 0; i < firstRow.length - 1; i++) {
            String a = getLetter(String.valueOf(firstRow[i]), String.valueOf(firstRow[i + 1]));
            result += a;
        }
        return result;
    }

    private static String getLetter(String c1, String c2) {
        if (c1.equals(c2)) {
            return c1;
        }
        return Stream.of("R", "G", "B").filter(c -> !c.equals(c1)).filter(d -> !d.equals(c2)).findFirst().orElse("");
    }

    public static void main(String[] args) {
        System.out.println(Triangles.triangle("RB"));
        System.out.println(Triangles.triangle("GG"));
        System.out.println(Triangles.triangle("GBRB"));

        System.out.println((4-5)%2);
    }
}
