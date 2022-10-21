package Step1;

import java.util.Scanner;

public class b3003 {

    public static void main (String []args ) {

        Scanner in = new Scanner(System.in);
        int arr[] = new int[6];
        int full[] = new int[] {1,1,2,2,2,8};

        for(int i=0; i<6; i++ ){
            arr[i] = in.nextInt();
        }

        for(int i=0; i<6; i++) {
            arr[i] = full[i] - arr[i];
            System.out.println(arr[i]);
        }



/*        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int E = in.nextInt();
        int F = in.nextInt();

        int totalA = 1-A;
        int totalB = 1-B;
        int totalC = 2-C;
        int totalD = 2-D;
        int totalE = 2-E;
        int totalF = 8-F;

        System.out.printf("%d %d %d %d %d %d", totalA,totalB,totalC,totalD,totalE,totalF);*/


        }
}
