package _function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*문제
어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
N이 주어졌을 때, 1보다 크거나 같고, 
N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.*/

public class _1065_한수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		if (N < 100) {
			bw.write(N + "");
			bw.flush();
		} else {
			bw.write(count(N) + "");
			bw.flush();
		}
		bw.close();
	}

	public static int count(int N) {
		int cnt = 99;
		int a;
		int b;
		int c;

		for (int i = 100; i <= N; i++) {
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			if (a - b == b - c) {
				cnt++;
			}
		}
		return cnt;
	}
}
