package chap06_ArrayEx;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner을 통해서 체온값 입력

		double[] temperatures = new double[5]; // 입력받을 배열 5칸 생성
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < temperatures.length; i++) { // 5칸을 만들었기에 5칸까지만 i++
			System.out.print("체온을 입력하세요 : ");
			temperatures[i] = input.nextDouble(); // 5칸배열에 들어갈 수 입력
		}
		// for -each 사용
		for (double temperature : temperatures) { // 배열 안 요소를 입력받는 통 설정
			if (temperature >= 37) {
				System.out.println("(위험)" + temperature);
			} else { // else 빼도 동일한 결과 가능
				System.out.println(temperature);
			}
		}
		// temperatures[i]배열에 체온 적어넣기 // for each 안썼으면 내가한것이 좀더 간결
		// if(temperatures[i] >= 37) {
		// System.out.println("(위험)");
		// }

		// --------------------------------------------------------
		System.out.println("--------------------------");

		// 실습 String 배열, 요소값 비교
		// 배열안의 문자와 비교하여 출력하기
		// String[] f = new String[5]; 이건 사용 x 밑의 배열이나 지금칸에꺼나 둘중하나만사용하는듯
		String[] fruits = { "바나나", "딸기", "포도", "사과", "키위" };
		System.out.println("과일 이름을 입력하시요 : ");
		String fruitInput = input.next();
		for (int i = 0; i < fruits.length; i++) {
			// 입력받은 값과 for문으로 배열을 하나씩 비교
			if (fruitInput.equals(fruits[i])) {
				System.out.println(fruitInput + " 가 있습니다.");
				break;
			}
			System.out.println("없습니다.");
			break;
		}

		/*
		 * // 있는지 없는지를 확인하는 for문 (두가지방법●) boolean isFruit = false; for (int i = 0; i <
		 * fruits.length; i++) { // 입력받은 값과 for문으로 배열을 하나씩 비교 if
		 * (fruitInput.equals(fruits[i])) { isFruit = true; break; }
		 * 
		 * } if(isFruit) { System.out.println(fruitInput + " 가 있습니다."); }else {
		 * System.out.println("없습니다."); }
		 */

		
		// 실습 int배열 크기를 입력
		// 학생의 수를 입력받고, 점수배열을 만든후 성적 입력하기. ★★★★★
		System.out.print("학생의 수를 입력하세요 : ");
		int student = input.nextInt();
		int[] studentScore = new int[student]; // 입력받은걸 배열로만드는 문장 ★★★★(배열크기설정)
		for (int i = 0; i < studentScore.length; i++) { // 배열할떈 foreach랑 항상 함께
			System.out.print((i+1)+" 번째 점수를 입력하세요 : "); // +1하는 이유는 표기상
			studentScore[i] = input.nextInt(); // 1+부터 입력받은 배열 수 만큼 점수입력해줌
			for (int score : studentScore) {
				if (60 <= score) { // 배열에서 60 이상이면 출력해줌
					System.out.println(score);

				}
			}			
		}
		
		
		
		
		
	}

}
