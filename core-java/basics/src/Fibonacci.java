// fibonacci series is sum of previous 2 numbers
// 0,1,1,2,3,5,8,13...

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int previous = 0;
        int sum = 1;
        System.out.println(previous);
        System.out.println(sum);
        for(int i=0; i<=n; i++){
            int prevSum = sum;
            sum = sum + previous;
            System.out.println(sum);
            previous = prevSum;
        }
    }
}
