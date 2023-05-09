package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOdd {

    public static int findIt(int[] a) {
        Map<Integer, Boolean> results = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int number = a[i];
            if (results.containsKey(number)) {
                results.replace(number, !results.get(number));
            } else {
                results.put(number, true);
            }
        }
        return results.keySet().stream().filter(k -> results.get(k)).findAny().orElse(0);
    }

    public static int findIt2(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor = xor ^ A[i];
        }
        return xor;
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = IntStream.of(a).boxed().collect(Collectors.toList());
        for (int i = 0; i < b.length; i++) {
            while (listA.contains(b[i])) {
                listA.remove(listA.indexOf(b[i]));
            }
        }
        return listA.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] arrayDiff2(int[] a, int[] b) {
        List<Integer> listA = IntStream.of(a).boxed().collect(Collectors.toList());
        List<Integer> listB = IntStream.of(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }

    public static int duplicateCount(String text) {
        String temp = text.toLowerCase();
        int count = 0;
        while (temp.length() > 0) {
            String first = temp.substring(0, 1);
            temp = temp.substring(1);
            if (temp.contains(first)) {
                count++;
                temp = temp.replaceAll(first, "");
            }
        }
        return count;
    }

    public static boolean isValid(char[] walk) {
        // ['n', 's', 'w', 'e']
        if (walk.length != 10) {
            return false;
        }
        int countN = 0;
        int countW = 0;
        int countE = 0;
        int countS = 0;
        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n':
                    countN++;
                    break;
                case 'w':
                    countW++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 's':
                    countS++;
                    break;
            }
        }
        return countN == countS && countW == countE;
    }

    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }
        List<String> result = Arrays.asList(words.split(" "));
        result.sort((o1, o2) -> {
            Integer a = extractNumber(o1);
            Integer b = extractNumber(o2);
            return a.compareTo(b);
        });
        StringBuilder str = new StringBuilder();
        result.stream().forEach(s -> {
            str.append(s);
            str.append(" ");
        });
        return str.toString().trim();
    }

    private static Integer extractNumber(String str) {
        String s1 = str.replaceAll("[^0-9]+", "");
        return Integer.parseInt(s1);
    }

    /**
     * String num,num1,num2;
     * String str = "123-456-789";
     * String regex ="(\\d+)";
     * Matcher matcher = Pattern.compile( regex ).matcher( str);
     * while (matcher.find( ))
     * {
     * num = matcher.group();
     * System.out.print(num);
     * }
     */

    /*        String s="  Hi How Are You 11  ";
        String s1=s.replaceAll("[^0-9]+", "");
        //*replacing all the value of string except digit by using "[^0-9]+" regex.*
       System.out.println(s1);   */

    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
//        System.out.println("------------");
//        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,5,-1,-2})); // 5

//        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {2})));

//        System.out.println(duplicateCount("aabbcdee1111111111232"));

/*
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'})); // true
        System.out.println(isValid(new char[]{'e', 'e', 'e', 'e', 'n', 's', 'w', 'w', 'w', 'w'})); // true
// false:
        System.out.println(isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        System.out.println(isValid(new char[]{'w'}));
        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
*/
//        String s = order("b2b a1a ccc3d");
//        System.out.println(s);

        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
    }
}
