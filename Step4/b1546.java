package Step4;

import java.util.Map;
import java.util.Scanner;

public class b1546 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        double maxScore = 0;
        double sum=0;

        double arr2[] = new double[N];

        double arr[] = new double[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(double i : arr) maxScore = Math.max(i, maxScore);

        for(int i=0; i<arr.length; i++) {
                arr2[i] = arr[i] / maxScore * 100;
        }

        for(int i=0; i<arr2.length; i++) {
            sum=sum+arr2[i];
        }

        System.out.println(sum/N);
    }
}
