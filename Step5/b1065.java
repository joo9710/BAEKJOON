package Step5;

import java.util.Scanner;

public class b1065 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(arithmetic_sequence(in.nextInt()));
    }

    public static int arithmetic_sequence(int num) {
        int cnt = 0;

        if(num < 100) {
            return num;
        }

        else {
            cnt = 99;

            for(int i=100; i<= num; i++){
                int hun = i/100; //100의 자리수
                int ten = (i/10) % 10; // 10의 자리수
                int one = i%10;

                if((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
