package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 99, 10};
        int max = findMax(arr);
        System.out.println(max);
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
