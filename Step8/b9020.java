package Step8;

import java.util.Scanner;

public class b9020 {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        getPrime();

        int T = in.nextInt();

        while (T-- > 0) {
            int n = in.nextInt();
            int p = n/2;
            int q = n/2;

            while (true) {
                if(prime[p]== false && prime[q] == false) {
                    System.out.println(p + " " + q);
                    break;
                }
                p--;
                q++;
            }
        }
    }

    public static void getPrime() {

        for(int i=2; i<= Math.sqrt(prime.length); i++) {
            for(int j= i*i; j< prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}
