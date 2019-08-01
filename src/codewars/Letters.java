package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Letters {

    public static char findMissingLetter(char[] array) {
        int current = array[0];
        for (int i = 0; i < array.length; i++) {
            if (current != (int) array[i]) {
                System.out.println((char) current);
            }
            current++;

        }
        return ' ';
    }

    private static String REPL_01 = "Player 1 won!";
    private static String REPL_02 = "Player 2 won!";
    private static String REPL_03 = "Draw!";

    enum Type {
        scissors(0),
        paper(1),
        rock(2);
        int priority;

        Type(int p) {
            this.priority = p;
        }
    }

    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return REPL_03;
        }
        Type t1 = Type.valueOf(p1);
        Type t2 = Type.valueOf(p2);
        if (t1.priority < t2.priority) {
            if (isDifferent(t1, t2)) {
                return REPL_02;
            }
            return REPL_01;
        } else {
            if (isDifferent(t1, t2)) {
                return REPL_01;
            }
            return REPL_02;
        }
    }

    private static boolean isDifferent(Type t1, Type t2) {
        return Math.abs(t2.priority - t1.priority) == 2;
    }

    public static long stairsIn20(int[][] stairs) {
        return Arrays.stream(stairs).flatMapToLong(weekday -> Arrays.stream(weekday).asLongStream()).sum() * 20;
    }

    public static int howOld(final String herOld) {
//        return Integer.parseInt(String.valueOf(herOld.charAt(0)));
        return Integer.parseInt(herOld.substring(0, 1));
    }

    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";
        }
        System.out.println(result);
        return result;
    }

    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }


    public static int getCount(String str) {
        int vowelsCount = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'o', 'u', 'i', 'y');
        for (char a : str.toLowerCase().toCharArray()) {
            if (vowels.contains(a)) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        Long  a= null;
        Long n = 2l;
        if (a.compareTo(n)==0) {
            System.out.println("aaaaaa");
        }

    }
}
