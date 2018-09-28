import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        Arrays.sort(ar);
        int i = n-1;
        int result =0;
        while(ar[n-1]==ar[i]){
            i--;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
