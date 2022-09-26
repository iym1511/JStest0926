package chap03_operaterEx2;

import java.util.Scanner;

public class OperaterEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 가로길이를 입력받으면 면적이 1000에 가까운 세로길이를 계산해서 출력
		// 면적 = 사각형의 넓이 = 가로w*세로h
		
		// 내가한거
		int inputNum = 1000;
		int inputNum2 = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("가로 길이 입력(1000이상 x) : ");
		inputNum2 = input.nextInt(); //Num2는 0이니 위의 print에서 입력을 받음
		System.out.println("세로 길이 : " +(double)inputNum/(double)inputNum2); //1000나누기 입력값 하면 변x변 으로 정사각형 계산완료
		 
		/* 강사님 방법 (이게더 간결한듯)
		Scanner input = new Scanner(System.in);
		System.out.print("가로 길이 입력(1000이상 x) : ");
		int w = input.nextInt();
		int h = 1000/w;
		double doubleH = 1000.0 / w;
		System.out.println("세로길이: "+ h);
		System.out.println("세로길이(실수): "+ doubleH);
		*/
		
		/*
		System.out.println("아무값이나 입력해주세요 : ");
		String word = input.next(); // next 문자열로 바꿈
		System.out.println(word+10); // 문자끼리의 +는 문자의 연결
		*/
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 이름을 입력받으면 반갑습니다라고 출력하는 코드
		Scanner input2 = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = input.next();
		System.out.println("반갑습니다 "+name+"님.");
		// 체온을 입력받아 출력하는 코드
		System.out.print("체온 : ");
		double t = input.nextDouble(); // 체온 소수점 떄문에 double사용
		String classNum = "427호";
		System.out.println("현재 체온"+t+"도 입니다. ");
		System.out.println(classNum+" 강의실 입니다.");
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 놀이기구를 타는 사람이 6세 이상인지
		// 키가 140 이상인지
		// 6세 이상 (true), 키가 140이상(true) 놀이기구를 탈수있다(true)
		int age=9;
		int height = 140;
		System.out.println((height>=140) && (age>=6));
		/*if (height>=140 && age>=6) {
		    System.out.println("탑승가능");
		}*/
	}

}
