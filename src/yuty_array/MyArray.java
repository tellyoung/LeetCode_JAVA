package yuty_array;

import java.util.Arrays;
import java.util.List;

public class MyArray {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3};
    /*  int[] nums = new int[100];
        int nums[][] = {{1, 2}, {2, 3}};
        int nums[][] = new int[5][6];
     */
        System.out.println(n.length);

        List<Integer> a = Arrays.asList(n);
        System.out.println(a.indexOf(2));
        System.out.println(a.contains(1));
        for (Integer i: a){
            System.out.println(i);
        }
    }
}
