package Step9;

import java.util.Scanner;

public class b2566 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [][]arr = new int[10][10];


        int max = 0;
        int maxI = 0;
        int maxJ = 0;

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = in.nextInt();

                if(max<arr[i][j]) {
                    max=arr[i][j];
                    maxI=i;
                    maxJ=j ;
                }
            }
        }


        System.out.println(max);
        System.out.println((maxI +1) + " " + (maxJ +1));

    }
}
