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

    public void testStringBuilder() {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10);
        // capacity and size

        StringBuilder sb = new StringBuilder("ABCD");

        sb.charAt(1); sb.indexOf("A"); sb.length(); sb.substring(1); // the same as string

        sb.append("ZZZ");

        sb.insert(1, "XXX");

        sb.delete(1, 2);
        sb.deleteCharAt(2);

        sb.reverse();

        sb.toString();
    }
}
