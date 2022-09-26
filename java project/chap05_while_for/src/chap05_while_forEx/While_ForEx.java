package chap05_while_forEx;

import java.util.Scanner;

public class While_ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 실습 0을 입력받을때 까지 모든숫자 더함
		// 0을 입력받으면 나간다
		// == 관계 연산자를 사용
		// 0 이들어왔을때 : 반복 멈춤
		// 다른 수가 들어왔을 때 : 계속해서 모든 숫자를 더함
		// 반복내용 - 모든 숫자를 더함
		// sum 변수를 통해서 들어오는 값들을 더하여 저장
		
		/*
		int Num = 0; // 입력되는 통
		int Num2 =1;
		int Num1 = 0; // 다더한값 출력되는 통
		
		while( Num <= 10000000) {
			Scanner input = new Scanner(System.in);
			System.out.println("더할 수를 입력하시오(0을 넣으면 종료) : ");
			Num = input.nextInt();
			Num1 += Num;
			if(Num == 0) {
				System.out.println("수의 합 : "Num1);
				break;
			}
		}  */ //내가 한것
		
		// 강사님이 한것
		Scanner input = new Scanner(System.in);
		System.out.println("더할 수를 입력하세요(0을 넣으면 종료) : ");
		int num = input.nextInt();
		
		int sum = 0; // 값을 더하기 위한 변수 초기화
		while (num !=0) { // num이 0이 아닐때 반복
			// 1. 값을 더함
			sum += num;
			// 2. 다시 num을 비교하기위해서 input으로 입력받음
			System.out.println("더할 수를 입력하세요(0을 넣으면 종료) : ");
			num = input.nextInt();
			// 1. 들어값을 더함
			// 2. 다시 num을 비교하기위해서 input으로 입력 받음
		}
		System.out.println("총 더한 값 : "+sum);
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//실습 구구단 ★★
		int dan = 4; // 단
		int num1 = 1; // 오른쪽 곱하는 수
			while(num1<=9) { // 9까지 출력하기위한 조건
				System.out.println(dan+"X"+num1+"="+(dan*num1));
				num1++; // num1의 값을 증가
			}
			
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 do while
		// 실습 1~10까지의 수를 출력하시오
		int num5 = 1;
		do {		
			System.out.println("출력값 : "+ num5); // 1출력
			num5++; // num5 의 값 증가 + 위에두면 변수0부터가능 아래에두면 1부터
		}while(num5 <= 10);
			
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습  do while 업다운 게임 ★★★
		// 반복 조건 - 59가 아니면 반복한다
		// 반복 내용 - 입력받은 값을 59와 비교해서 작은지 큰지 알려준다
		int inputNum = 0;
		int num7 =0;
		
		do {
			// 1. input을이용해서 값을 입력받음
			System.out.print("정답을 추측하여 보시오 : ");
			inputNum = input.nextInt();
			num7++; // 위의 코드가 몇번 반복 되는지 세어준다. ★★★★
			// 2. 입력받은 갑을 비교(if) 큰지 작은지 알려줌
			if(inputNum > 59) {
				System.out.println("정답값보다 큽니다");
			} else if (inputNum < 59){
				System.out.println("정답값보다 작습니다");
			}
			
		}while(inputNum != 59); // 59가 아니여야 do while반복 59가 맞으면 중단
		// 정답은 반복문의 빠져나와서 한번만 출력
		System.out.println("축하합니다 정답입니다.");
		System.out.println("시도 횟수 : "+num7);
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		
		
		// 실습 중첩 반복문 - 구구단 2~9단
		for(int i=2; i<=9; i++) {
			System.out.println("<"+i+">단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		// 실습 중첩 반복문으로 5x5박스 출력하기
		for(int a=0; a<5; a++) {
			for(int b=0; b<5; b++) {
				System.out.print("*");
			}
			System.out.println();// 밖에서하면 줄바꿈이 있기때문에 
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
			
		// 실습 중첩 반복문과 조건 별 출력 아래로 1,2,3,4,5,
			for(int i=0; i<=5; i++) { 
				for(int j=0; j<i; j++) {
					if(i>=j) { // if굳이 필요 ㄴㄴ
					System.out.print("* ");
				}
			}
				System.out.println("");
		}
		
			
	}

}
