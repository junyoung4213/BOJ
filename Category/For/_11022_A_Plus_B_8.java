package _for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.*/

/**
 * @Author : Junyoung
 * @Date : 2020. 2. 29. A_Plus_B_7에서는 PrintWriter로 BufferedWriter를 감쌌었는데, 
 * 이번에는 BufferedWriter만 써보았다. 
 * 계산 시간이 현저하게 줄어든 것을 확인할 수 있었다. 
 * 대신 PrintWriter가 제공하는 printf를 사용할 수 없어서 코드가 이쁘지가 않다.
 */
public class _11022_A_Plus_B_8 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int A, B;

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
