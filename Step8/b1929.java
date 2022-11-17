package Step8;

import java.util.Scanner;

public class b1929 {

    public static boolean prime[];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();

        prime = new boolean[N + 1];

        getPrime();

        for(int i = M; i <=N; i++) {
            if(prime[i]== false) {
                System.out.println(i);
            }

        }
    }

    public static void getPrime() {
        prime[1] = true;

        for (int i=2; i<=Math.sqrt(prime.length); i++) {
            for(int j= i * i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }

    }
}
