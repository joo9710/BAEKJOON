package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10448 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[45];
        for(int i=1; i<45; i++) {
            arr[i] = i*(i+1)/2;
        }

        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(br.readLine());
            int result = eureka(n, arr);
            System.out.println(result);
        }
    }

    public static int eureka(int N, int[] arr) {
        for(int j =1; j<45; j++) {
            for (int k=1; k< 45; k++) {
                for (int z=1; z<45; z++) {
                    int sum = arr[j] + arr[k] + arr[z];
                    if (sum == N) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
