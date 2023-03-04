import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0, a;
        for(int i = 0; i < n; i++) {
            a = sc.nextInt();
            if(sosu(a) == 1)
                count++;
        }

        System.out.println(count);
    }

    static int sosu(int a) {
        int s = 0;

        for(int i = 1; i < a; i++) {
            if(a % i == 0)
                s++;
        }

        return s;
    }
}