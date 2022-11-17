package Step9;

import java.util.Scanner;

public class b2738 {

    public static Scanner in = new Scanner(System.in);
    public static int N = in.nextInt();
    public static int M = in.nextInt();

    public static void main(String [] args ) {
        int[][] arr = new int[N][M];
        int[][] arr2 = new int[N][M];

        makeArray(arr);
        makeArray(arr2);

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(arr[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void makeArray(int[][] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

}
