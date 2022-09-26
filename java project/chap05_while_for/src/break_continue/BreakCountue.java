package break_continue;

import java.util.Scanner;

public class BreakCountue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 안에서 사용할 수 있는 키워드
		// break;
		
		//switch문에서 break;
		int num = 0;
		switch (num) {
		case 0:
			System.out.println("입력된 값은 0입니다");
			break; // break를 사용해서 switch문을 나간다.
		default: // else같은거
			System.out.println("다른 숫자값입니다");
			break;
		}
	
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		

		// 반복문에서 break
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==4) {
				break;
			}
		}
		
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// while문에서 break
		int a = 1;
		while(true) { //true무한반복
			a++;
			System.out.println(a);
			if(a>10) { // 10은 10보다안커서 11부터 멈춤
				break;
			}
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		//실습 for-break
		// 1~100까지 출력하는 중 77까지 출력하고 멈추기
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			if(i==77) { //77을 출력하고 나오기위해 sysout뒤에 작성
				break;
			}	
			// 10의 배수 일때 줄바꿈 추가
			if(i%10 == 0) {
				System.out.println(); //1~10, 10~20 .....
			}
		}	
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 while-break
		Scanner input = new Scanner(System.in);
		int num1;
		while(true) {
			System.out.println("숫자를 입력하세요.(0:종료) : ");
			num1 = input.nextInt();
			if(num1==0) {
				break;
			}
			System.out.println(num1);
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// Continue문
		// 현재의 반복문을 건너뜀
		for (int i =0; i<10; i++) {
			if(i == 4) { //4빼고 출력됨
				continue; // 여기서 컨티뉴를만나면 아래에출력안하고 바로 ++ 해버려서 패스됨
			}
			System.out.println(i);
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 for - continue
		// 1부터 30까지 출력할 때 3의 배수는 건너뛰고 출력하시오
		for(int i =1; i<=30; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
