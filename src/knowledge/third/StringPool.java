package knowledge.third;

public class StringPool {

    /*
    String pool - intern pool - location in the Java virtual machine (JVM) that collects all strings that can be reused
     */

    public void testStrings() {
        String testing = "ABCD";

        testing.length();
        testing.charAt(1);
        testing.indexOf('A');
        testing.indexOf('A', 2);
        testing.indexOf("A");
        testing.indexOf("A", 2);

        testing.substring(2);
        testing.substring(1, 3);

        testing.toLowerCase();
        testing.toUpperCase();

        testing.equals("abcd");
        testing.equalsIgnoreCase("abcd");

        testing.startsWith("A");
        testing.endsWith("A");

        testing.contains("A");

        testing.replace('A', 'Z');
        testing.replace("A", "Z");

        testing.trim();

        // method chaining

    }

    public static void testStringBuilder() {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10);
        // capacity and size
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

        StringBuilder sb = new StringBuilder("ABCD");
        System.out.println(sb.length());

        sb.charAt(1); sb.indexOf("A"); sb.length(); sb.substring(1); // the same as string
        System.out.println(sb);

        System.out.println(sb.append("ZZZ"));

        sb.insert(1, "XXX");
        System.out.println(sb);

        sb.delete(4, 6);
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.toString();
    }

    public static void main(String[] args) {
        testStringBuilder();

        String testing = "ABCD";
        System.out.println("---------------");
        System.out.println(testing.charAt(1));
        System.out.println(testing.indexOf('A'));
        System.out.println(testing.indexOf('A', -1));
        System.out.println(testing.indexOf("A"));
        System.out.println(testing.indexOf("A", 0));
        System.out.println(testing.substring(2));
        System.out.println(testing.substring(1, 4));
        System.out.println(testing.equals("abcd"));
        System.out.println(testing.equalsIgnoreCase("abcd"));
        System.out.println(testing.replace('A', 'Z'));
        System.out.println(testing.replace("A", "Z"));
        System.out.println(testing.substring(1,3).toLowerCase().replace("b", "AA"));
    }
}
