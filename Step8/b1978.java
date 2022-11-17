package Step8;

import java.util.Map;
import java.util.Scanner;

public class b1978 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int count = 0;

        for(int i=0; i<N; i++) {

            //소수인 경우 true, 아닌경우 false
            boolean isPrime = true;

            int num = in.nextInt();

            if(num == 1) { // 1인 경우 다음 반복문
                continue;
            }

            for(int j=2; j <= Math.sqrt(num); j++) {

                if(num % j ==0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                count++;
            }

        }
        System.out.println(count);
    }
}
