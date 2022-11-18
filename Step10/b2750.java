package Step10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class b2750 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

       for (int i: arr) {
           System.out.println(i);
       }



    }
}
