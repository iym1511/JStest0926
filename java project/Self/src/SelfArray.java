import java.util.Scanner;

public class SelfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int 자료형 길이가 10인 배열을 선언하고 생성하세요
		int[] jalyo = new int[10];
		System.out.println(jalyo[0]);
		
		// --------------------------------------------------------
		System.out.println("--------------------------");

		// 문자 가나다라마바 를 갖는 문자형 배열을 초기화하세요
		char[] moonja = { '가', '나', '다', '라', '마', '바' }; //간단한 문자라 char

		// --------------------------------------------------------
		System.out.println("--------------------------");

		// 배열초기화
		int[] score = { 88, 58, 47, 69, 50, 72, 87, 90, 84, 95 };
		String[] name = { "홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화", "홍련", "심청", "춘향", "이순신" };
		boolean[] hap = { false, true, true, false, true, false, false, false, false, false };
		score[0] = 91; //
		name[9] = "몽룡"; // 이것들은 배열의 그 위치에 값을 변경시켜줌 ★★★
		hap[1] = false; //

		for (int scoreeach : score) {
			System.out.println(scoreeach + " 점 ");
		}

		// --------------------------------------------------------
		System.out.println("--------------------------");

		for (String nameeach : name) { // 문자열 foreach는 String으로
			System.out.println(nameeach + " 님");
		}

		// --------------------------------------------------------
		System.out.println("--------------------------");

		// 점수 배열의 점수값을 5씩 더하기
		int sum = 5;
		for (int i = 0; i < score.length; i++) {
			score[1] += 5; // 5씩 더함
			System.out.println(score[i]+" 점");
		}

		// --------------------------------------------------------
		System.out.println("--------------------------");

		// 이름 배열의 전체를 출력하세요.
		for (String nameeach : name) { // 문자열 foreach는 String으로
			System.out.println(nameeach);
		}

		// --------------------------------------------------------
		System.out.println("--------------------------");

		// 합격여부 배열의 주어진 값을 전부 반대로 바꿔서 넣어주세요
		for (int i=0; i<hap.length; i++) {
			// 연산자 규칙을 통해서
			// = 대입연산자는 오른쪽의 식부터 실행 후
			// 그 결과를 왼쪽 hap[i]에 할당한다.
			// 오른쪽 식에서 계산할 때는 그 값(hap[i])을 가져와서 계산한다.
			hap[i]=!hap[i]; // hap[i] = !false 계산결과: true
			System.out.println(hap[i]);
		}

		// --------------------------------------------------------
		System.out.println("--------------------------");

		// 점수 배열의 60이상인 점수만 더해서 평균을 구하세요(합격자 평균)

		int sumAll = 0;
		int avrgAll = 0;
		for ( int scores : score ) {
			sumAll+= scores;
		}
		avrgAll = sumAll/score.length;
		System.out.println("평균 : "+avrgAll);
		
		int sumPass = 0;
		int avrgPass = 0;
		int countPass = 0;
		for (int scores : score) {
			if(scores >= 60) {
				sumPass += scores;
				countPass++;
			}
		}
		avrgPass = sumPass/countPass;
		System.out.println("합격자 평균 : "+ avrgPass);
		
		// --------------------------------------------------------
		System.out.println("--------------------------");
		
		
		// 이름 배열에 '콩쥐'가 있는지 확인하고 출력하세요.
		for (String name1 : name) {
			if(name1.equals("콩쥐")) {
				System.out.println("콩쥐가 있습니다.");
			}
		}
		
		// --------------------------------------------------------
		System.out.println("--------------------------");
		
		// 합격 여부 배열의 true인 개수 출력하세요.
		int count = 0; // true 갯수를 저장할 카운트
		for (int i = 0; i<hap.length; i++) {
			if(hap[i]) {
				count++;
			}
		}
		System.out.println("합격자 수 : "+count);

		
	}

}
