package chap01_test;

import java.util.Scanner; // 아래 Scanner에서  ctrl+space 해서 생김

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 6;
		int sum = 7;
		
		
		System.out.println("Java");
		System.out.println("Welcome to");
		System.out.println(x); //변수 초기화
		System.out.println(y);
		System.out.println(sum);
		System.out.print("숫자를 입력하세요 : "); //print에 ln 붙이는건 줄바꿈 떄문에
		
		//ctrl+space 해서 Scanner util 추가
		Scanner input = new Scanner(System.in); //입력을 할때 사용
		x = input.nextInt();
		System.out.println(x);
		System.out.println("출력했습니다.");
		
		System.out.println(1+x);
	}

}
