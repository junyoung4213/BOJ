package _if;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*문제
상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 
주문할 때 자신이 원하는 햄버거와 음료를 하나씩 골라 세트로 구매하면, 
가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.

햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.

햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.

입력
입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다. 넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.

출력
첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.*/

public class _5543_상근날드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int price;
		int burger = 2000;
		int soda = 2000;
		for (int i = 0; i < 5; i++) {
			price = Integer.parseInt(br.readLine());
			if (i < 3) {
				burger = Math.min(burger, price);
			} else if (i >= 3) {
				soda = Math.min(soda, price);
			}
		}
		bw.write(burger + soda - 50 + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
