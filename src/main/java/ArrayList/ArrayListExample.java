package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(34);
        list.add(94);
        list.add(16);
        list.add(67);

        System.out.println(list);

        list.set(0,99);
//        list.remove(16);
        System.out.println(list.contains(94));
        System.out.println(list.contains(99));
        System.out.println(list);

        list.sort(Comparator.comparing(Function.identity(), Collections.reverseOrder()));
        System.out.println(list);

        // Multi ArrayList
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        // initialization
        for (int i = 0; i<4; i++){
            al.add(new ArrayList<>());    // adding lists in al
        }

        // add elements
        for (int i=0; i<4; i++){
            for (int j=0; j<2; j++){
                al.get(i).add(scan.nextInt());
            }
        }
        System.out.println(al);

    }
}
