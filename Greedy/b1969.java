package Greedy;


import java.util.Scanner;

public class b1969 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int max = 0;
        int hd=0;

        String []dna = new String[N];
        for(int i=0; i<N; i++)
            dna[i] = in.next();

        for(int i=0; i<M; i++) {
                int a=0, t=0, g=0,c=0;
                for(int j=0; j<N; j++)
                switch (dna[j].charAt(i)) {
                    case 'A': a++;
                    break;

                    case 'T': t++;
                    break;

                    case 'G': g++;
                    break;

                    case 'C': c++;
                    break;
                }

            max = Math.max(a>c?a:c, g>t?g:t);
            hd += (N-max);
            System.out.print(toChar(a,t,g,c,max));
        }
        System.out.println("\n" +hd);
        in.close();
    }
    private static char toChar(int a, int t, int g, int c, int max) {
        if(max==a) return 'A';
        else if(max==c) return 'C';
        else if(max==g) return 'G';
        else return 'T';
    }
}
