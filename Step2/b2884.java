package Step2;

import java.util.Scanner;

public class b2884 {

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();

        int alarm = M-45;
        int result = M+15;

        if(M < 45) {
          H--;
          if(H<0)
          {
              H=23;
              System.out.println(H + " " + result);
          }else {
              System.out.println(H + " " + result);
          }
        }

        else {
            System.out.println(H + " " + alarm);
        }

        }
}
