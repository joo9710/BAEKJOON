package Greedy;

import java.util.Scanner;

public class b11047 {

    public static void main(String[] args ) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();


        int arr[] = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        int count =0;

        for(int i= N-1; i>=0; i--) {

            if(arr[i]<=K) {
                count+= (K/arr[i]);
                K=K%arr[i];
            }
        }

        System.out.println(count);
    }

}
