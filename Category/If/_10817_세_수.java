package _if;

import java.util.Scanner;

/*문제
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

출력
두 번째로 큰 정수를 출력한다.*/

public class _10817_세_수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		if (A > B) {
			if (B > C) {
				System.out.println(B);
			} else if (A > C) {
				System.out.println(C);
			} else {
				System.out.println(A);
			}
		} else if (B > C) {
			if (A > C) {
				System.out.println(A);
			} else {
				System.out.println(C);
			}
		} else {
			System.out.println(B);
		}
		sc.close();
	}
}
