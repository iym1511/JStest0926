package chap04_ifEx;

import java.util.Scanner;

public class ifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 값을 입력 받아서 10보다크고, 20보다 작다면, 변수 num을 출력
		Scanner input = new Scanner(System.in);
		System.out.print("10보다 크고 20보다 작은수 : ");
		int num = input.nextInt();
		if ((10<num) && (num<20)) {
			System.out.println(num);
		}
		System.out.println("종료되었습니다");
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습, 문자열 비교
		// 변수안에 값을 할당하고 비교할때는 == 연산자 사용 가능
		// 값을 받아와서 비교할때는 .equals(비교할 문자열) 사용
		System.out.print("이름 : ");
		 String name =input.next();
		if(name.equals("홍길동")) { 
			System.out.println("본인이 맞습니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		// 실습, if문 연달아 사용
		boolean eat = true;
		int time = 4;
		if(eat) {  // eat가 false면 출력안됨
			System.out.println("밥을 먹었다.");
		}
		if(time < 10) { // int가 11이상이면 출력안됨
			System.out.println("택시 탑승");
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//점수가 60보다 크면, 합격 아니면 불합격
		System.out.println("점수를 입력하세요 : ");
		int score = input.nextInt();
		if(score > 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
			System.out.println("수고하셨습니다.");
		}
				
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 삼항연산자( ? :)
		// 한줄에다가 참/거짓을 확인하고싶을때
		// 삼항연산자의 결과 값은 조건에 따라 참/거짓 값이다
		
		int x = 10;
		int y = 11;
		//삼항연산자, 연산자의 특징 : 계산을 하고 그 결과값을 출력/되돌려줌
		int maxNum = x>y ? x:y; // 받아온값을 다른대도 사용가능
		System.out.println(maxNum); 
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 삼항연산자
		int num3 = 10;
		String state = num3>0 ? "양수":"음수";
		System.out.println(state);
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//실습
		int code = 1;
		if(code == 1 || code == 3) {
			System.out.println("(홀수)남자");
		}else { // 중첩 if문(조건문)
				// if문 또는 else 안에서 작성 가능
			if(code == 2 || code == 4) {
			System.out.println("(짝수)여자");
			}
		} 
		//홀수
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 - 중첩 if
		// 홀수짝수/음수양수 판단
		
		System.out.println("0을제외한 숫자 입력 : ");
		int num1 = input.nextInt();
		if(num1%2 == 1 || num1%2 == -1) { // 홀수는 2로 나눳을때 전부다 1이남음
			System.out.println("홀수");
			if(num1 > 0) {
				System.out.println("양수");
			}
			else{
				System.out.println("음수");
			}
		}else {
			//System.out.println(num1%2); 오류 확인용이였던것
			System.out.println("짝수");
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//실습 입력받을값 최대치구하기
		
		int a, b, c,max;

		System.out.println("숫자 세개를 띄워쓰기로 구분해서 입력하세요 : ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		if(a>b) {
			// a이 크므로 max값
		 max = a; //max에 a값 할당
		}if(a>c) { // 조건문을 ( max > c)
			System.out.println("최댓값 : "+a); // max
		}else {
			// c가 max값 보가 크므로 max값에 할당
			max = c;
			System.out.println("최댓값 : "+c); // max
		}if(b>c) {
			System.out.println("최댓값 : "+b);
		}else {
			System.out.println("최소값 : "+b);
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 학점구하기
		System.out.println("점수를 입력하세요 : ");
		int a1 = input.nextInt();
		if(a1 >= 90) {
			System.out.println("A");
		}else if(a1 >= 80) {
			System.out.println("B");
		}else if(a1 >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습
		//미세먼지 판별기
		// 0~30좋음, 31~80보통, 81~150나쁨, 151~ 매우나쁨
		System.out.println("미세먼지 값을입력하세요 : ");
		int dust = input.nextInt();
		if(dust>=0 && dust<=30) {
			System.out.println("좋음");
		}else if(dust<=80) {
			System.out.println("보통");
		}else if(dust<=150) {
			System.out.println("나쁨");
		}else {
			System.out.println("매우나쁨");
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 요일출력
		int date;
		Scanner sacn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		date = sacn.nextInt();
		switch(date) {
		case 0:
			System.out.println("월");
			break;
		case 1:
			System.out.println("화");
			break;
		case 2:
			System.out.println("수");
			break;
		case 3:
			System.out.println("목");
			break;
		case 4:
			System.out.println("금");
			break;
		case 5:
			System.out.println("토");
			break;
		case 6:
			System.out.println("일");
			break;
		default:
			System.out.println("없는 요일 입니다");
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//실습 학점출력
		int score1 = 85;
		int scoreCase = score1/10;
		switch(scoreCase) {
		case 9:	case 10:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}
	}

}
