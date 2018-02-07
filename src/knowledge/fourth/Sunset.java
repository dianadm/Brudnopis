package knowledge.fourth;


public class Sunset {

    public int field_0;
    public int field_1 = 0;
    public static int field_2 = 0;
    public static final int field_3 = 3;
    public static final int field_4;

    {
        field_1 = 1;
        field_2 = 1;
        field_5 = 1;
    }

    static {
        field_2 = 2;
        field_4 = 2;
    }

    static {
        field_2 = 2;
    }

    {
        field_1 = 3;
        field_2 = 3;
    }

    public int field_5 = 5;

    public static void main(String[] args) {
        Sunset sunset = new Sunset();
        System.out.println(sunset.field_0);
        System.out.println(sunset.field_1);
        System.out.println(sunset.field_2);
        System.out.println(sunset.field_3);
        System.out.println(sunset.field_4);
        System.out.println(sunset.field_5);
    }
}
