package knowledge;

import java.util.Arrays;

public class Quicksort {

    public static void sort(int[] tab) {
        quicksort(tab, 0, tab.length - 1);
    }

    private static void quicksort(int[] tab, int first, int last) {
        if (first >= last) {
            return;
        }

        int pivotIndex = (last + first) / 2;
        int pivot = tab[pivotIndex];
        int i = first - 1;
        int j = last + 1;

        while (i < j) {
            while (tab[++i] < pivot) ;
            while (tab[--j] > pivot) ;
            if (i < j) {
                int temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
            }
        }

        quicksort(tab, 0, j);
        quicksort(tab, j+1, last);
    }

    public static void main(String[] args) {
        int[] tab = {0, 5, 20, 4, 100, 3, 1, 2, 6, 7, 217, 11, 300};
        sort(tab);
        System.out.printf(Arrays.toString(tab));
    }
}
