package Greedy;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class b1946 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(reader.readLine());

        while(tc-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int [] a = new int[n+1];

            for(int i=0; i<n; i++) {
                StringTokenizer st = new StringTokenizer(reader.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                a[x] = y;
            }

            int cnt = 1; //x가 1일때는 무조건 가능하므로 1로 시작
            int standard = a[1]; //기준 값, 처음에는 x가 1일 때의 y값
            for(int i=2; i<=n; i++) {
                if(standard > a[i]) { //기준 값보다 a[i]의 y값이 작다면
                    standard = a[i]; //기준 값 a[i]의 y값으로 변경
                    cnt++; //추가
                }
            }
            System.out.println(cnt);
        }
    }
}
