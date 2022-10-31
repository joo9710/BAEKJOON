package Step4;

import java.util.Scanner;

public class b10871 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int X = in.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){

            arr[i] = in.nextInt();

        }

        for(int i = 0; i<arr.length; i++) {

            if(X > arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
