package Step10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b1427 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

       char[] arr = in.nextLine().toCharArray();

       Arrays.sort(arr);

       for(int i=arr.length-1; i>=0; i--) {
           System.out.print(arr[i]);
       }



    }
}
