package Step4;

import java.util.Scanner;

public class b4344 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int C = in.nextInt();

        int arr[];



        for(int i=0; i<C; i++) {
            int N = in.nextInt();
            arr = new int[N];

            double sum = 0;

                for(int j=0; j<N; j++) {
                    int val = in.nextInt();
                    arr[j] = val;

                    sum = sum + arr[j];
                }

                double mean = (sum/N);
                double count = 0;

                for(int j=0; j<N; j++){
                    if(arr[j] >mean) {
                        count++;
                    }
                }

            System.out.printf("%.3f%%\n",(count/N)*100);

        }
        in.close();
    }
}
