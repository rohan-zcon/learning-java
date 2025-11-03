package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        ArrayList<Integer> arrayLists = new ArrayList<>(10);

        arrayLists.add(45);
        arrayLists.add(23);
        arrayLists.add(545);
        System.out.println(arrayLists);
        arrayLists.set(0, 99);
        System.out.println(arrayLists.get(1));

        System.out.println(arrayLists);
        System.out.println(arrayLists.contains(23));

        // Multi dimensional arrays
        ArrayList<ArrayList<Integer>> multiDList= new ArrayList<>();

        for (int i=0; i < 3; i++){
            multiDList.add((new ArrayList<>()));
        }

        for (int i = 0; i < 3; i++) {
            for (int j=0; j < 3; j++){
                multiDList.get(i).add(ip.nextInt());
            }
        }
    }
}
