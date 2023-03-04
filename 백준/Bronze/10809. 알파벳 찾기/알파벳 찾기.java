import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] ar = new int[26];

        for(int i = 0; i < 26; i++){
            ar[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            if(ar[s.charAt(i) - 'a'] == -1)
                ar[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < 26; i++){
            System.out.print(ar[i] + " ");
        }
    }
}