package Step2;

import java.util.Scanner;

public class b2525 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int min = A *60 + B;
        int cookMin = min + C;

        int hour = cookMin / 60;
        int minute = cookMin % 60;

        if(hour > 23) {
            hour = hour -24;
            System.out.println(hour + " " + minute);
        }
        else {
            System.out.println(hour + " " + minute);
        }

    }
}
