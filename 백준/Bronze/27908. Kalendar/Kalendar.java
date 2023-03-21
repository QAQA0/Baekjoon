import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int weakCount = 0, k = 1;
        int n = sc.nextInt();
        int d = sc.nextInt();
        int s = 0;
        if(n % 7 != 0 || d > 1)
            s = 7 - (n % 7);

        System.out.print((char)(43));
        for(int i = 0; i < 21; i++)
            System.out.print((char)45);
        System.out.println((char)43);

        for(int i = 0; i < (n + s) / 7; i++, weakCount++) {
            System.out.print((char)124);

            for(int j = 0; j < 7; j++) {
                if(weakCount >= d)
                    k++;
                if(weakCount >= d - 1 && k <= n) {
                    if(k < 10) {
                        System.out.print(".." + k);
                    } else {
                        System.out.print("." + k);
                    }
                }else {
                    System.out.print("...");
                }
                weakCount++;
            }

            System.out.println((char)124);
        }

        System.out.print((char)(43));
        for(int i = 0; i < 21; i++)
            System.out.print((char)45);
        System.out.println((char)43);
    }
}