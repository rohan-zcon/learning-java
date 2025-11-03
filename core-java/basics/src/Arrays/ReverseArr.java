package Arrays;

// [1, 3, 23, 9, 18] to [18, 9, 23, 3, 1]

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 55, 9, 18};
        reverseArr(arr);
    }

    static void reverseArr(int[] list){
        int start = 0;
        int end = list.length-1;
        while( start <= end){
            int temp = list[start];
            list[start] = list[end];
            list[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(list));
    }
}
