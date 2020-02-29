package _while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.*/

/**
 * @Author : Junyoung
 * @Date : 2020. 2. 29. 
 * EOF에 대해 알아봐야 해결할 수 있는 문제
 */
public class _10951_A_Plus_B_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int A, B;
		String input;
		while ((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			bw.write(A + B + "\n");
			bw.flush();
		}
		bw.close();
		br.close();
	}
}
