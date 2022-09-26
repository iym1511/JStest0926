package chap03_operatorEX;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 아메리카노 = 2000, 카페라떼 = 3000, 카푸치노 = 3500
		// 아메리카노 3개, 카페라떼 3개, 카푸치노 3개
		int americano = 2000;
		int cafeLatte = 3000;
		int cappuccino = 3500;
		
		int sum = 0;
		sum = americano*3 + cafeLatte*3 + cappuccino*3;
		System.out.println(sum);
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 실습 대입,산술,복합 대입
		// 5642초 > 몇분 몇초인지 확인
		int time = 5642/60; // 94분 = 60분이 넘음
		int second = 5642%60;
		int hour = time/60; // 위에서 94분으로 쪼겐뒤 다시60 나누면 1.544444...가 남기때문에 int로 출력해서 시간에 1시간이 들어감
		// 60분이 넘었기 때문에 나머지 연산자를 사용해서
		// 0~59분의 값을 얻기 위함.
		time %= 60; //  94랑 60 나머지가 34라 분에 34가 남음
		System.out.println(hour+"시간"+time+"분"+second+"초");
		
		
		// Scanner 를 통해서 입력받은 초를 분과 초로 출력하기.
		int inputNum=0; // 사용자로부터 입력받은 값을 저장한 값
		Scanner input = new Scanner(System.in);
		System.out.println("초값을 입력해주세요 : ");
		inputNum = input.nextInt();
		System.out.println((inputNum/60)+"분"+(inputNum%60)+"초");
		
		
		// 값을 2개 입력받은 후 몫과 나머지 출력
		Scanner input2 = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int inputNum2 = input2.nextInt();
		System.out.print("두번째 수를 입력하세요(0제외) : ");
		int inputNum3 = input2.nextInt();
		System.out.println("몫 값 : "+(inputNum2/inputNum3)+" 나머지 값 : "+(inputNum2%inputNum3));
		
		
		/* 강사님 방법
		Scanner input2 = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int inputNum2 = input2.nextInt();
		System.out.print("두번째 수를 입력하세요(0제외) : ");
		int inputNum3 = input2.nextInt();
		
		int div = inputNum2 / inputNum3;
		int rest = inputNum2 % inputNum3;
		System.out.println("몫 : "+div+", 나머지 : " + rest);
		
		*/
		
		
		
		
	}

}
