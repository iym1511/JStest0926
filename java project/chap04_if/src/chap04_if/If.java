package chap04_if;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건문
		//if문
		//if()안에 있는게 참(true)면 실행 거짓(false)이면 건너뜀
		if(true) {  
			System.out.println("코드가 실행됩니다."); // true라서 실행 false면 실행x
			}
		// if문 밖에있는 코드는 if문 영향x
		System.out.println("프로그램이 종료되었습니다");
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//조건문을 넣어서 확인 - 여러줄
		int age =9;
		int height =140;
		if (height>=140 && age>=6) {
			System.out.println(age+"세 입니다.");
		    System.out.println("탑승가능합니다.");
		} else {
			System.out.println(age+"세 입니다.");
			System.out.println("탑승불가능합니다.");
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//
		int num = 13;
		if (num > 10) {
			System.out.println(num+"입니다.");
		} // num이 10보다 크니 if문 실행
		System.out.println("종료되었습니다.");
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// if-else 거짓일때 코드 실행
		if(false) {
			System.out.println("참입니다");
		}else {
			System.out.println("거짓입니다.");
		}
	
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//if-else문 조건식과 여러줄출력
		int age1 = 9;
		if(age1 > 6) {
			System.out.println("축하합니다.");
			System.out.println("놀이기구를 탈 수 있습니다.");
		} else {
			System.out.println("놀이기구를 탈 수 없습니다.");
			System.out.println("나중에 또 오세요.");
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// num1의 값을 초기화 하고
		// num1이 0이 아니면, 10을num1 로 나눈값을 출력
		// num1이 0이면(위의 조건과 반대:else), "입력한 값이 0입니다" 를 출력
		int num1 = 5;
		if(num1 != 0) {
			System.out.println("나눈 값 : "+10/num1);
		} else {
			System.out.println("입력한 값이 0입니다");
		}
		if (num1 == 0) {
			System.out.println("입력한 값이 0입니다.");
		} else {
			System.out.println("나눈 값 : "+10/num1);
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// word를 초기화 하고
		// word가 "종료"와 같다면, "시스템을 종료합니다."라고 출력
		// 아니면, "시스템을 유지합니다" 출력
		String word = "종료";
		if(word == "종료") {  // word가 종료가 아니면 시스템유지
			System.out.println("시스템을 종료합니다.");
		}else {
			System.out.println("시스템을 유지합니다");
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 연속적인 if - else if - else
		// 위의 중첩 if로 작성한 코드를 연속적인 if로 작성하기
		int code =1;
		
		if (code==1 || code==3) {
			System.out.println("남자입니다");
		}
		// else if 통해서 다른 조건문을 작성해 줄수가 있다
		else if(code==2 || code==4) {
			System.out.println("여자입니다");
		}
		else { // 여기서 else문은 바로 위에있는 조건이 거짓(false)일때 실행
			System.out.println("없는 코드입니다.");
		}

		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 연속적 if - else if - else
		// 음수,양수, 0 판별하기
		int num2 = 1;
		if(num2 < 0) {
			System.out.println("음수");
		}
		else if(num2 > 0) {
			System.out.println("양수");
		}
		else {
		System.out.println("0입니다.");
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//Switch문
		int number = 0; // String 문자열로 바꿔서 "0"으로해도 됨
		// ()안에 비교할 값을 넣는다
		// 비교할 값은 동일한 자료형으로 넣어주어야한다.
		switch(number) {
		case 0: // case 뒤에 원하는 값일 경우 출력할 값을 넣는다.
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default : //else 같은거
			System.out.println("많음");
			break;
		}
		
	}

}
