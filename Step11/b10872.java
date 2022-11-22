package Step11;

import java.util.Scanner;

public class b10872 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int fac=1;

        for(int i=1; i<=N; i++) {
            fac=fac*i;
        }

        System.out.println(fac);

    }
}
