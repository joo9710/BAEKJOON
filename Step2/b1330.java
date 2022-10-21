package Step2;

import java.util.Scanner;

public class b1330 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        if(A>B) {
            System.out.println(">");
        }
        else if(A<B) {
            System.out.println("<");
        }
        else if(A==B) {
            System.out.println("==");
        }
    }
}
