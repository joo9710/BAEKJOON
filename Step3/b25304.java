package Step3;

import java.util.Scanner;

public class b25304 {

    public static void main (String[]args ) {

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int N = in.nextInt();

        int total = 0;

        for(int i=0; i<N; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();

            total = total + (a * b);

        }

        if(total == X) {
            System.out.println("Yes");
        }

        else{
        System.out.println("No");
    }
}
}
