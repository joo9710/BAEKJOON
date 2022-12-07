package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b2217 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Integer arr[] = new Integer[N];
        for(int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int answer = 0;
        for(int i=0; i<N; i++) {
            if(arr[i] * (i+1) > answer)
                answer = arr[i] * (i+1);
        }

        System.out.println(answer);



    }
}
