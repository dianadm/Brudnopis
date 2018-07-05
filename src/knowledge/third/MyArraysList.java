package knowledge.third;

import coffee.shop.WhiteCoffee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArraysList {

    public void wrappers() {
        Boolean a = new Boolean(true);
        Byte b = new Byte((byte) 1);
        Short c = new Short((short) 1);
        Integer d = new Integer(1);
        Long e = new Long(1);
        Float f = new Float(1.0);
        Double g = new Double(1.0);
        Character h = new Character('c');
    }

    public void wrappersParser() {
        Boolean a = Boolean.valueOf("TRUE");
        Byte b = Byte.valueOf("2");
        Short c = Short.valueOf("2");
        Integer d = Integer.valueOf("2");
        Long e = Long.valueOf("2");
        Float f = Float.valueOf("2.2");
        Double g = Double.valueOf("2.2");
//        Character h  ---
    }

    public void wrappersParser2() {
        boolean a = Boolean.parseBoolean("true");
        byte b = Byte.parseByte("2");
        short c = Short.parseShort("2");
        int d = Integer.parseInt("2");
        long e = Long.parseLong("2");
        float f = Float.parseFloat("2");
        double g = Double.parseDouble("2");
        Long l = 11l;
//        Character h  ---
    }

    public static void listy() {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();

        // add, remove, equals
        list1.add("jeden");
        list1.add("dwa");
        list2.add("jeden");
        list2.add("dwa");
        System.out.println(list1.equals(list2));
        System.out.println(list1.remove("trzy"));
        System.out.println(list1.remove("jeden"));
        System.out.println(list1.toString());
        System.out.println(list1.remove(0));
        System.out.println(list1.toString());
        System.out.println();

        // isEmpty, size, contains, clear
        list2.set(1, "trzy");
        System.out.println(list2.toString());
        System.out.println(list2.isEmpty());
        System.out.println(list2.size());
        System.out.println(list2.contains("jeden"));
        list2.clear();
        System.out.println(list2.toString());
    }

    public static void coffee() {
        WhiteCoffee c1 = new WhiteCoffee();
        WhiteCoffee c2 = new WhiteCoffee();
        List<WhiteCoffee> list = new ArrayList<>();
        List<WhiteCoffee> list2 = new ArrayList<>();
        list.add(c1);
        list2.add(c2);
        list.remove(c2); // it uses equals!
        System.out.println(list.toString());

        Object[] arr2 = list2.toArray();
        System.out.println(Arrays.toString(arr2));
        WhiteCoffee[] arr2_2 = list2.toArray(new WhiteCoffee[1]);
        System.out.println(Arrays.toString(arr2_2));
    }

    public static void unsupported() {
        String[] array = {"hawk", "robin"}; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.toString());

        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
//        list.remove(1); // throws UnsupportedOperation Exception
//        list.add("aaaa"); // throws UnsupportedOperation Exception
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
//        listy();
//        coffee();
        unsupported();
        int s=10;

        System.out.print(s%(-3));

    }
}
