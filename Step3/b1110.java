package Step3;

import java.util.Scanner;

public class b1110 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int temp = N;
        int count = 0;

        while(true) {

            int left = temp / 10;
            int right = temp %10;
            temp = right * 10 + (left + right) % 10;
            count++;

            if(N == temp) {
                break;
            }

        }
        System.out.println(count);


        }

    }

