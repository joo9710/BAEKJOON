package Step9;

import java.util.Scanner;

public class b2563 {

    public static boolean [][] arr = new boolean[100][100];

    public static void main(String[] args ) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int A;
        int B;

        int count=0;

        for(int i=0; i<N; i++) {
            A = in.nextInt();
            B = in.nextInt();

            getSquare(A,B);
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++){

                if(arr[i][j]==true) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void getSquare(int A,int B) {
        for(int i=A; i<A+10; i++) {
            for(int j=B; j<B+10; j++) {
                    arr[i][j] = true;
            }
        }

    }
}
