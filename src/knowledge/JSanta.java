package knowledge;

public class JSanta {

    public static void main(String[] args) {
        String text = "SiiLublin";

        text.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.delete(3,6);
        stringBuilder.insert(0, "pas");
        text = stringBuilder.toString().replaceAll("(?<!i)i", "").replaceFirst("(?i)l", "o");

        System.out.println(text);
    }
}
