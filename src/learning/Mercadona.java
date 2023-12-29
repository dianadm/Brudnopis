package learning;

import java.util.*;

public class Mercadona {

    public static void main(String[] args) {
        Collection<String> elements = new ArrayList<>();
        elements.add("raz");
        elements.add("dwa");
        elements.add("trzy");

        List<String> list1 = new ArrayList<>(elements);
        List<String> list2 = new LinkedList<>(elements);
        list1.add(null);
        list2.add(null);
        System.out.println(list1);
        System.out.println(list2);

        Set<String> set1 = new HashSet<>(elements);
        Set<String> set2 = new LinkedHashSet<>(elements);
        NavigableSet<String> set3 = new TreeSet<>(elements);
        set1.add(null);
        set2.add(null);
//        set3.add(null);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        Map<Long, String> map1 = new HashMap<>();
        Map<Long, String> map2 = new LinkedHashMap<>();
        Map<Long, String> map3 = new TreeMap<>();
        map1.put(null, null);
        map1.put(1L, null);
        map2.put(null, null);
        map3.put(1L, null);
//        map3.put(null, null);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);

        Queue<String> queue1 = new LinkedList<>(elements);
        Queue<String> queue2 = new PriorityQueue<>(elements);
        Deque<String> deque1 = new LinkedList<>(elements);
        Deque<String> deque2 = new ArrayDeque<>(elements);
        queue1.add(null);
//        queue2.add(null);
        deque1.add(null);
//        deque2.add(null);
        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println(deque1);
        System.out.println(deque2);
    }
}
