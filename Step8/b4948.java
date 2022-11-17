package Step8;

import java.util.Scanner;

public class b4948 {

    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        getPrime();

        while(true) {
            int n = in.nextInt();
            if(n == 0) break;

            int count = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                if (prime[i] == false) {

                    count++;
                }
            }
            System.out.println(count);
        }

    }

    public static void getPrime() {
        prime[1] = true;

        for(int i=2; i<= Math.sqrt(prime.length); i++) {
            for(int j= i * i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }

    }


}
