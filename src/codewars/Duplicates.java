package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

    /**
     * integer array nums, return true if any value appears at least twice in the array and return false if every
     * element is distinct
     */
    public static boolean containsDuplicates(Integer[] nums) {
        List<Integer> list = Arrays.asList(nums);
        Set<Integer> set = new HashSet<>();
        for (Integer i : list) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }


    public static void main(String[] args) {
//        Integer[] tab = {1, 2, 2, 3, 5, 5, 4};
//        System.out.println(containsDuplicates(tab));
    }

}
