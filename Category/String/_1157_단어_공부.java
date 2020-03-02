package _string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*문제
알파벳 대소문자로 된 단어가 주어지면, 
이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 
주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/
public class _1157_단어_공부 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] alpha = new int[26];

		String input = br.readLine().toUpperCase();
		int num;
		int max = 0;
		char result = 0;
		int len = input.length();
		for (int i = 0; i < len; i++) {
			num = input.charAt(i);
			alpha[num - 'A']++;
		}

		for (int i = 0; i < alpha.length; i++) {
			if (max < alpha[i]) {
				max = alpha[i];
				result = (char) (i + 'A');
			} else if (max == alpha[i]) {
				result = '?';
			}
		}

		bw.write(result);
		bw.flush();
		bw.close();
		br.close();

	}
}
