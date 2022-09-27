package chap07_Object;

import java.util.Scanner;

public class RandomUD {

	public static void main(String[] args) {
		// 랜업다운 게임 1~100
		// 1. 랜덤한 수가 만들어짐
		// 2. 수를 입력 받음
		// 3. 입력받은 수를 랜덤한 수와 비교 결과를 알려줌
		// 4. 결과에 따라서 크다, 작다 를 알려주고
		// 5. 같다면 게임 끝

		int num = (int) (Math.random() * 100) + 1;
		System.out.println(num);

		// 2. 수를 입력받음
		int usernum;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("숫자값을 입력해주세요 : ");
			usernum = input.nextInt();

			// 3. 입력받은 수와 랜덤한 수를 비교하고 결과 출력
			if (usernum > num) {
				// 4. 결과 출력
				System.out.println("입력한 숫자가 더 큽니다");
			} else if (usernum < num) {
				System.out.println("입력하 숫자가 더 작습니다");
			} else {
				// usernum과 num이 같을때 while문을 빠져나옴
				break;
			}
		}
		System.out.println("정답");
		
	}
}