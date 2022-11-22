package Step11;

import java.util.Scanner;

public class b10870 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n+1];

        for(int i=0; i<=n; i++) {
            if(i==0) arr[0] = 0;
            else if(i==1) arr[1] = 1;

            else arr[i] = arr[i-2] + arr[i-1];
        }

        System.out.println(arr[n]);

    }
}
