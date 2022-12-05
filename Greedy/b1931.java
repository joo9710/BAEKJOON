package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class b1931 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int [][]arr = new int[N][2];

        for(int i=0; i<N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int prev_end_time = 0;

        for(int i=0; i<N; i++) {

            if(prev_end_time <= arr[i][0]) {
                prev_end_time = arr[i][1];
                count++;
            }
        }
        System.out.println(count);



    }
}
