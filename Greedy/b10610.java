package Greedy;

import java.util.*;

public class b10610 {

    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        List<Integer> list = new ArrayList<>();
        int sum=0;

        for(int i=0; i<s.length(); i++) {
            sum+= s.charAt(i)-'0';
            list.add(s.charAt(i)-'0');
        }

        Collections.sort(list); //오름차순
         if(list.get(0)==0 && sum % 3 == 0) {
            for(int i = list.size()-1; i>=0; i--)
                System.out.print(list.get(i));
             }
            else{
                System.out.print(-1);
             }

    }
}
