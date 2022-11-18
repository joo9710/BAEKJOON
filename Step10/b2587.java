package Step10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class b2587 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int arr[] = new int[5];

        int sum = 0;

        for(int i=0; i<5; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        System.out.println(sum/5);

        Arrays.sort(arr);

       System.out.println(arr[2]);

    }
}
