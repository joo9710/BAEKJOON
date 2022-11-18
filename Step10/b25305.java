package Step10;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class b25305 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int k = in.nextInt();

        Integer arr[] = new Integer[N];

        for(int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k-1]);


    }
}
