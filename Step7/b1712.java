package Step7;

import java.util.Scanner;

public class b1712 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); //A는 고정비용
        int B = in.nextInt(); //B는 가변비용
        int C = in.nextInt(); //C는 노트북가격

     if(C<=B) {
         System.out.println("-1");
     }

     else
     {
         System.out.println((A/(C-B))+1);
     }

    }
}
