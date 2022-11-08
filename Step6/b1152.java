package Step6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class b1152 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String S = in.nextLine();

        StringTokenizer st = new StringTokenizer(S," ");

        System.out.println(st.countTokens());
    }
}
