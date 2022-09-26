package chap02_var;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed; // 변수 선언
		long interertRate = 1; // 변수 초기화  (선언과 값을 동시에)
		int 반복횟수, loop2 ; // 변수 동시 선언
		
		// 선언을 한 경우 변수 이름에다가 값을 넣음
		speed = 10; 
		반복횟수 = 2;
		loop2 = 20;
		
		// 변수는 값을 할당할때 마지막에 할당딘 값이 들어간다
		speed = 0; // 코드는 순차적이기때문에 10이엿던 값이 아래에서 0으로 바뀌어버림
		
		// 변수를 출력을 하기위해서는 이름만 작성한다
		System.out.println(speed);
		System.out.println(반복횟수);
		System.out.println(loop2);
		System.out.println(interertRate);
		
		System.out.println("--------------------------");
		
		// 실습 정수형 변수 선언/초기화 하기
		int age;
		int data;
		int pay;
		int count;
		int score;
		
		age = 26;
		data = 10;
		pay = 5000;
		count = 5;
		score = 100;
		
		System.out.print("나이:");
		System.out.println(age);
		System.out.print("일자:");
		System.out.println(data);
		System.out.print("금액:");
		System.out.println(pay);
		System.out.print("개수:");
		System.out.println(count);
		System.out.print("점수:");
		System.out.println(score);
		
		System.out.println("--------------------------");
		
		// 실습 long 변수
		// long 에 값을 넣어줄때 int의 범위를 지난 값은 L을 붙여준다
		long distance = 9460800000000l;
		// 변수는 동일한이름을 선언할 수 없다
		long speedLight = 300000; 
		System.out.print("946800000000/300000/3600 = ");
		// print메소드 안에 수식을 작성하면 계산하여 출력한다
		System.out.println((distance/speedLight)/3600);
		
		System.out.println("--------------------------");
		
		// 실습 실수 double
		// V=4/3*3.14*반지름의 3제곱 10x10x10
		// 변수의 값에 계산식도 들어갈 수 있다
		double volume = 4/3*3.14*10*10*10;
		System.out.println(volume); //소수점이 포함되어서 나옴
		// 3.14값을 double형에 할당
		double pi = 3.14;
		System.out.println(pi);
		
		System.out.println("--------------------------");
		
		// 기호 상수(final) - 값을 수정하여 할당할 수 없다. [대문자로 변수작성]
		// 초기화 값을바꾸어서 원하는 값을 넣을 수 있다.
		final double PI = 3.141592;
		System.out.println(PI);
		
		// 실습 기호상수
		// 모서리의 길이 값 4, 6, 10
		// 정육면체의 한변의 길이를 기호상수로 두고 계산
		final int LINE = 4; // 코드 안에서 값이 안바뀔때는 파이널로해야 좀더 편함
		// 변수는 변수끼리 계산한 값도 할당할 수 있다
		int V = LINE * LINE * LINE;
		System.out.println(V);
		
		System.out.println("--------------------------");
		
		// 실습 boolean 논리형 - 참, 거짓 두가지 값만 가지는 자료형
		boolean isRain = false; // 0과 같은 정수값은 넣을수 없다
		System.out.println(isRain); // false로 출력되지만 boolean값이다
		
		int num = 10;
		boolean check;
		check = (num>20); // 10 > 20 : 거짓
		System.out.println(check);
		
		// num 값을 수정해서 check값을 true 바꾸기
		num = 30;
		check = (num>20); // 30 > 20 : 진실
		System.out.println(check);
		
		System.out.println("--------------------------");
		
		// 문자형과 문자열
		// 문자형은 유니코드로 된 한 글자를 표시할 수 있다
		char ch1 = '가';
		char ch2 = '\uac00';  // 유니코드로 표시된 '가' 
		System.out.println(ch2);
		
		String s ="Hello world";
		System.out.println(s);
		
		System.out.println("--------------------------");
		
		//		(자료형)(변수이름) = (값)
		// 할당 방법 : int num1 = 100
		// int를 이용하여 number에 숫자값10을 할당하세요 
		int num1 = 100;
		// boolean을 이용하 isSunny에 true 값을 할당하세요
		boolean isSunny = true; 
		// char를 이용하여 a값을 할당하세요
		char char_a = 'a';
		System.out.println(char_a);
		// String을 이용하여 hi를 할당하세요
		String sayHi = "hi";
		System.out.println(sayHi);
		
		// 문자열의 특수문자
		String word = "\" : 쌍따옴표표시 \' : 따옴표표시 \n새라인 ";
		System.out.println(word); // 
		
		// 실습 특수문자
		// 쌍따옴표가 들어간 "Hello world" 출력하기
		String word2 = "\"Hello world\"";
		System.out.println(word2);
		
		System.out.println("--------------------------");
		
		// 형변환
		// 축소변환 : double > int 데이터가 사라질수 있다 (소수점이하 사라짐)
		int i = (int)10.5;
		System.out.println(i);
		
		// 확대변환 : int > double 
		double d = (double)10; 
		System.out.println(d);
		
		// 실습 확대 변환
		// 65> int/int > int형으로 출력
		System.out.println(328/5);
		// 65.6 > double/int > double형으로 출력(더 큰쪽 맞춤)
		System.out.println((double)328/5);
		// 65.6 > double/double > double형으로 출력
		System.out.println((double)328/(double)5);
		// 하나라도 실수형이면 실수형으로 출력
		System.out.println(328.0/5);
		// 강제로 int로 형변환을 했기 때문에 결과가 6 int로 나옴
		System.out.println((int)32.8/5);
		
		
		
		
	}

}
