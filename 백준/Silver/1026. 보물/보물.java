import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for(int i = 0; i < n; i++) {
            s += arr[i] * arr2[n - 1 - i];
        }

        System.out.println(s);
    }
}