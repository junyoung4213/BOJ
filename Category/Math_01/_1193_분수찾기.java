package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*문제
무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

1/1	1/2	1/3	1/4	1/5	…
2/1	2/2	2/3	2/4	…	…
3/1	3/2	3/3	…	…	…
4/1	4/2	…	…	…	…
5/1	…	…	…	…	…
…	…	…	…	…	…
이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 

지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

출력
첫째 줄에 분수를 출력한다.*/

public class _1193_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine());
		int cnt = 0;
		int line1 = 0;
		int line2;

		while (X > cnt * (cnt + 1) / 2) {
			line1 = X - cnt * (cnt + 1) / 2;
			cnt++;
		}
		line2 = cnt * (cnt + 1) / 2;
		if (cnt % 2 == 0) {
			bw.write(line1 + "/" + (line2 - X + 1));
		} else if (cnt % 2 == 1) {
			bw.write(line2 - X + 1 + "/" + line1);
		}
		bw.flush();
		bw.close();
		br.close();

	}
}
