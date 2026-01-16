package collections;

import java.util.*;

public class Lists {

    private static void fillData(List<Integer> L){
        for (int i = 0; i < 8; i++) {
            L.add(i);
        }
    }

    public static void main(String[] args) {
        /*
          ArrayList
          Resizable implementation of the List Interface,
          Cannot store primitives, instead wrapper classes
          because of concept called type erasure
         */
        ArrayList<Integer> al = new ArrayList<Integer>();
        fillData(al);
        System.out.println("ArrayList: "+ al);

        /*
           LinkedList
           Non contiguous storage of object references.
           Each node contains a data and point to the next node
         */
        LinkedList<Integer> ll = new LinkedList<Integer>();
        fillData(ll);
        System.out.println("LinkedList: "+ ll);

        /*
        Vector
        Similar to ArrayList but provides thread safety
         */
        Vector<Integer> v = new Vector<Integer>();
        fillData(v);
        System.out.println("Vector: "+ v);
    }
}
