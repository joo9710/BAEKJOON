package Greedy;

import java.util.Scanner;

public class b1783 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();	// 세로
        int M = scan.nextInt();	// 가로
        int visitRoom = 1;		// 방문할 수 있는 칸의 수

        if(N == 1)	// 세로길이가 1 => 처음에 있는 칸만 가능
            visitRoom = 1;
        else if(N == 2) {	// 세로 길이가 2 => 오른쪽으로는 무조건 2칸만 갈 수 있음.
            if(M>=7)	// 오른쪽으로 3번 갈 수 있음(6칸)
                visitRoom += 3;
            else if(M<7 && M>=5)	// 오른쪽으로 2번 갈 수 있음(4칸)
                visitRoom += 2;
            else if(M == 3 || M == 4)	// 오른쪽으로 1번 갈 수 있음(2칸)
                visitRoom += 1;

        }

        //세로 길이가 3이상인 경우 => 2칸 위로, 2칸 아래로 가면서 오른쪽 길이만 판단한다.
        else {
            if(M > 6) {	// 이동 횟수가 4번 이상이 되는 최소 가로의 길이
                visitRoom += 4;	// 이동 횟수 4번
                M -= 7;	// 4가지 방법을 사용한 후 최대 개수 구하기
                visitRoom += M;	// 나머지는 오른쪽으로 1칸씩 가면 되므로 남은 가로길이만큼 더한다.
            }
            else {	// 이동 횟수가 4번이 안되는 가로의 길이 => 최대 갈 수 있는 칸의 개수 판별.
                if(M>=4 && M<=6)	// 오른쪽으로 3번 갈 수 있음.
                    visitRoom += 3;
                else if(M == 3)	// 오른쪽으로 2번 갈 수 있음.
                    visitRoom += 2;
                else if(M == 2)			// 오른쪽으로 1번 갈 수 있음.
                    visitRoom += 1;
            }
        }
        System.out.println(visitRoom);
        scan.close();
    }


}
