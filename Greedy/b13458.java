package Greedy;

import java.util.Scanner;

public class b13458 {

    public static void main(String[] args ) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int arr[] = new int[N];


        for(int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        int B = in.nextInt();
        int C = in.nextInt();
        long count=0;

        for(int i=0; i<arr.length; i++) {
            long result=0;

            if(arr[i]<=B) {
                count++;
                continue;
            }

            else {
                count++;
                arr[i] -=B;

                if(arr[i]%C==0) {
                    count+=arr[i]/C;
                }
                else if(arr[i]%C!=0) {
                    count+=arr[i]/C+1;
                }
            }

        }

        System.out.println(count);
    }
}
