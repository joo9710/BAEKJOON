package Step3;

import java.util.Scanner;

public class b2739 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int i= 0;
        while (i<9) {
            i++;
            System.out.println(N + " * " + i + " = " + N* i);
        }
    }
}
