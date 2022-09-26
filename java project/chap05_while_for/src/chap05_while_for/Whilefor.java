package chap05_while_for;

import java.util.Scanner;

public class Whilefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문 while
		//조건이 참일때 안의 블록을 반복한다.
		// 반복문 while 쓸때 주의점
		// 1. 조건문이 true일때만 안의 내용이 실행
		// 2. 조건문이 항상true면 무한반복에 빠져서 프로그램 종료안됨
		int num = 0;
		while(num < 5) {
			System.out.println("반복하고 있습니다 : "+num); // 프린트안에서 확인가능
			num++; // ++ 로 1씩증가시켜주면 while문 멈춤(안하면 무한루프)
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//실습 1~10까지출력
		// 10~1까지 출력
		int num1 = 1;
		while(num1 <= 10) { //num1이 1이니까 10이 될때까지
			System.out.println(num1);
			num1++;
		}
		
		int countDown = 10;
		while(countDown >= 1) { //countDown이 10이니까 1이 될때까지 
			System.out.println(countDown);
			countDown--;
		}		
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//실습 while 전체합, 짝수합, 홀수합 ★★
		int sum, even, odd; // 빈통들
		   //총합,짝수합,홀수합
		int num2 = 0;
		sum = 0;  
		even = 0;
		odd = 0;

		
		while(num2 <= 100) {
			// 전체 합
			sum += num2;
			 System.out.println(sum); 
			
			// 짝수의 합
			if(num2 % 2 == 0) { // 짝수 확인법
				even += num2;
				// System.out.println(even); 과정확인
			}	
			// 홀수의 합
			else {
				odd +=num2;
				// System.out.println(odd); 과정확인
			}
			
			num2++;
		}
		
		// 반복이 끝난후에 확인을 하려면
		// while문 안의결과물을 바깥에 작성
		System.out.println("총합 :"+sum);
		System.out.println("짝수 합 :"+even);
		System.out.println("홀수 합 :"+odd);
			
	
		//--------------------------------------------------------
		System.out.println("--------------------------");
				
		//do while : 반복한 내용이 무조건 한번은 실행되는 조건문 ★★
		Scanner input = new Scanner(System.in);
		int num4 = 0;
		int sum4 = 0;
		do { // while의 뒤에있던 반복할 내용이 do를 이용해서 앞으로 가져옴
			System.out.println("더할 값을 입력해주세요(0을 넣으면 멈춤) : ");
			num4 = input.nextInt(); // 1. 여기서입력받아서 
			sum4 += num4;	// 2. 여기서 sum4 + num4(입렵한값) 받음
		} while(num4 != 0); // 조건이 참이라면 do로 올라가 다시 반복 0이면 종료
		System.out.println("더한 값 : "+ sum4);
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
						
		
		// for문
		// for(초기화 ; 조건식 ; 증감계산)
		for(int num6=1; num6<=10; num6++) { // 1이 10까지 1씩 증가
			System.out.println(num6);	
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		// for문을 이요한 1~10까지의 합
		int sum7 = 0;
		for(int num7=1; num7<=10; num7++) {
			sum7+=num7; // 1부터 10까지 증가하는 값을 더해줌 
			//System.out.println(sum7); // 1,2,3,4,5 출력
		}
		System.out.println("1부터 10까지의 정수의 합 : "+sum7); // 결과 출력
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// for문을 이용한 팩토리얼(곱해준다는것)★★
		long mult = 1; // 곱해주는거라서 0이면 뭘곱해도0이니 1
		for(int num8=1; num8<=20; num8++) {
			mult*=num8;
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 반복할 숫자를 입력받은후 반복해서 더한 값 출력하기.
		  System.out.println("더하기를 몇번 반복할지 작성하세요 : ");
		  int count=input.nextInt();
		  int a, b;
		for(int num3=0; num3<count; num3++) { // 1. 원하는 횟수 입력하려면 count한태 입력받으면 
			//  2. for문에서 ++(증가)되면서 count입력된만큼 반복해줌
			System.out.println("두 수를 띄워서 작성하세요 : ");;
			a=input.nextInt();
			b=input.nextInt();
			System.out.println("결과 : "+(a+b));
			
			
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 for문과 조건★★★★
		// 강사피셜)이렇게까지해서 코딩 잘안한다고함
		         //1, 5, 7, 11, 13, 17, 19 = 73
		// 1~20까지의 정수중 2또는 3의배수가 아닌 수의 총합.
		int sum9 = 0;
		for(int num9=1; num9<=20; num9++) {
			if(num9 % 2 != 0 && num9 % 3 != 0) { // != 지정한거의 아닌것을찾아주니 1~20사이에2,3배수들 뺴고 다 더함
				sum9 +=num9;
			}
		}
		System.out.println("결과값 : "+sum9);
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// for문의 초기화 값은 for문 안에서만 사용이 가능
		for(int i=0; i<5; i++) {
			System.out.println("반복문입니다" + i);
		}
		// System.out.println(i); //for문 밖에서는 쓸수 없다.
		// 다른 for문에서 사용한 이름은 다른 for문에서 사용할 수 있다.
		for(int i=0; i<10; i++) {
			System.out.println("새로운 i를 이용한 반복문입니다"+i);
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		//중첩 반복문 : 반복문 안에 반복문이 들어가 있는 형태 ★★★★
		for(int i=0; i<2; i++) {
			System.out.println("for문 i에서 반복중입니다"+i); //확인용
			for(int j=0; j<2; j++) {
				System.out.println("i :"+i+" j : "+j);
			}
			System.out.println("내부 for문이 종료되었습니다");
		} 
		/* 결과값 ★★★★
		for문 i에서 반복중입니다0
		i :0 j : 0
		i :0 j : 1
		내부 for문이 종료되었습니다
		for문 i에서 반복중입니다1
		i :1 j : 0
		i :1 j : 1
		내부 for문이 종료되었습니다
		*/
		
		// 중첩 반복문 확인
		for(int i=0; i<5; i++) {
			for(int j=5; j<=5; j--) {
				if(i<j) {
					
				}else {
					System.out.println("");
				}
			}
		
		}
		
		
	}

}
