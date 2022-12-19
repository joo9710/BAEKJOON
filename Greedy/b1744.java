package Greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class b1744 {

    static int N;
    static List<Integer> nn = new ArrayList<>();
    static List<Integer> pn = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n>0) {
                pn.add(n);
            }
            else {
                nn.add(n);
            }

            Collections.sort(pn, Collections.reverseOrder());
            Collections.sort(nn);

            int sum = 0;
             i =0;
            while (i < pn.size()) {
                if(i+1 < pn.size() && pn.get(i) != 1 && pn.get(i+1) !=1) {
                    sum += pn.get(i++) * pn.get(i++);
                }
                else {
                    sum+=pn.get(i++);
                }

                while(i<nn.size()) {
                    if(i+1 <nn.size() && nn.get(i) != 1 && nn.get(i+1) !=1) {
                        sum += nn.get(i++) * nn.get(i++);
                    }
                    else {
                        sum+= nn.get(i++);
                    }
                }

                bw.write(sum+"\n");
                bw.flush();
            }
        }
    }
}
