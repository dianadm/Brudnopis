package knowledge.third;

import java.util.ArrayList;

public class MyArraysList {

    public void wrappers() {
        Boolean a = new Boolean(true);
        Byte  b = new Byte((byte) 1);
        Short c = new Short((short) 1);
        Integer d = new Integer(1);
        Long e = new Long(1);
        Float f = new Float(1.0);
        Double g = new Double(1.0);
        Character h = new Character('c');
    }

    public void wrappersParser() {
        Boolean a = Boolean.valueOf("TRUE");
        Byte  b = Byte.valueOf("2");
        Short c = Short.valueOf("2");
        Integer d = Integer.valueOf("2");
        Long e = Long.valueOf("2");
        Float f = Float.valueOf("2.2");
        Double g = Double.valueOf("2.2");
//        Character h  ---
    }

    public void wrappersParser2() {
        boolean a = Boolean.parseBoolean("true");
        byte  b = Byte.parseByte("2");
        short c = Short.parseShort("2");
        int d = Integer.parseInt("2");
        long e = Long.parseLong("2");
        float f = Float.parseFloat("2");
        double g = Double.parseDouble("2");
//        Character h  ---
    }

    public static void main(String[] args) {
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
}
