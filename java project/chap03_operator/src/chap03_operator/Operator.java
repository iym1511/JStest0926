package chap03_operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연산자
		// 산술연산자와 대입연산자
		
		int x, y;
		x = 10;
		y = 3;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y); // int끼리 나눗셈은 int형으로 나옴
		System.out.println(x%y); // int끼리 나머지는 int형으로 나옴
		
		// 대입연산자 : 오른쪽의 식을 계산한 후에 변수에 대입
		// 계산식이 끝난 후에 값을 할당하기때문에
		// int 값에서 double 형으로 형 변환만 하게 된다
		double sum = x/y;
		System.out.println(sum);
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 실습 산술 연산자
		int sum1 = 10+20+30+40+50;
		System.out.println(sum1);
		int mult1 = 10*20*30*40;
		System.out.println(mult1);
		int sum2 = 10*(20+30)+40;
		System.out.println(sum2);
		
		// 실습 산술 연산자2
		int result,resultRest;
		result = 80/3;
		resultRest = 80%3;
		System.out.println(result); // 몫 26
		System.out.println(resultRest); // 나머지 :2
		System.out.println(26*3+2); // 80이 나오므로 계산확인.
		
		// 나머지 연산자의 특징
		// 1. 항상 정수로만 나온다.
		// 2. 값의 범위가 정해져있다 (0 ~ 나누는 수)
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		double resultDouble = 80.0/3.0;
		System.out.println(resultDouble); // 소수점 자리까지 나옴
		
		//실습 연산자 결합규칙
		//11.5 > 실수형이 들어가 있어서
		System.out.println(30.0/20+30-10*2);
		
		//41 > 정수형으로 들어가 있어서
		// 괄호를 통해 순서가 바뀌었기때문에 값의 차이가 남
		System.out.println(30/20+(30-10)*2);
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		//  단항 연산자
		int a = +10; // +붙여서 양수(붙이지않아도 양수)
		int b = -10; // -붙여서 음수

		System.out.println(a);
		System.out.println(b);
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 전위 단항 연산자 (++, --)
		// 다른 연산을 하기 전에 1증가, 1감소 한다.
		int c = ++a; // 변수 (a)앞에 사용해서 a값이 증가한다. 
		System.out.println(c);
		
		++a; // a의 값이 1증가 : 12
		System.out.println(a);
		
		--a; // a의 값이 1감소 : 11
		System.out.println(a);
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 후위 단항 연산자
		// 모든 연산이 끝난 후에 값을 1증가, 1감소 시킨다.
		int d = a++;
		System.out.println(d); // 11 : 값을 증가시키기전에 들어간 값
		System.out.println(a); // 12 : 이후에 1을 증가시킴
		
		a++; // a의 값이 1증가함 : 13
		System.out.println(a);
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 실습 단항 연산자
		int minusX = 1;
		System.out.println(minusX--);
		
		int minusY = 1;
		System.out.println(--minusY);
		
		System.out.println(minusX);
		System.out.println(minusY);
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 복합대입 연산자
		// 동일한 변수에서 값을 바꿔서 혹은 계산해서 사용할 때 쓰는 방법
		
		// 10, 20, 30, 40 더해서 결과값 확인하기
		// int sum3 = 10+20+30+40; // 한꺼번에 더해서 계산하는법
		
		// 만약에 한꺼번에 계산할수 없고
		// 한 코드가 끝날 때 그 값을 추가해서 더해야하는 경우
		
		int sum3 = 0; // 처음 값
		
		// sum3 = 10; // sum3 에 값이 대입해서 들어감(할당)
		sum3 = sum3 +10; // 0(sum3) + 10 = 10
		
		sum3 = sum3 +20; // 10(sum3) + 20 = 30
		sum3 = sum3 +30; // 30(sum3) + 30 = 60
		sum3 = sum3 +40; // 60(sum3) + 30 = 100
		System.out.println(sum3);
		
		// 복합대입연산자 사용방법(*=, /=, %=, +=, -=)
		int mult2 = 1;
		
		// mult2 = mult2 * 10;
		mult2 *=10; // 곱셈과 대입 연산자를 복합해서 사용
		System.out.println(mult2);
		
		// 실습 복합 대입 연산자
		int sum4 = 0;
		sum4 += 10;
		System.out.println(sum4);
		
		int mult3 = 1;
		mult3 *= 20;
		System.out.println(mult3);
		
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 관계연산자 (==, !=, >, <, >=, <=)
		// 관계 연산자의 결과값은 항상 참/거짓이다 (boolean값)
		System.out.println( 10 == 10 ); // true
		System.out.println( 10 == 100 ); // false
		
		int score = 80;
		// score 값이 60보다 크면 합격(true)
		System.out.println( score > 60 ); // true
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		
		// 실습 관계 연산자
		int num1 = 63*4;
		int num2 = 38*6;
		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // true
		System.out.println(num1 > num2); // true
		System.out.println(num1 < num2); // false
		System.out.println(num1 >= num2); // true
		System.out.println(num1 <= num2); // false
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 논리연산자 (&&(And), ||(Or), !)
		// 논리형(boolean > True/false)를 계산하는 연산자
		boolean x1 = true;
		boolean y1 = false;
		System.out.println(x1 && y1); // And는 하나만 false라도 false 
		System.out.println(x1 || y1); // Or은 하나만 true라라도 true
		System.out.println(!x1); // false 반댓값
		System.out.println(!y1); // true
		
		//--------------------------------------
		System.out.println("--------------------------");
		
		// 실습 논리연산자
		int x2 = 20;
		int y2 = 40;
		System.out.println(x2==20 && y2==20); // false - y2틀림
		System.out.println(x2==20 && y2==40); // true - 둘다맞음
		System.out.println(x2==20 || y2==10); // true - x2가 맞음
		System.out.println(x2==10 || y2==10); // false - 둘다틀림
		System.out.println(x2==20 && y2!=20); // true - 둘다맞음
		System.out.println(!(x2==10)); // true 
		
		//--------------------------------------
		System.out.println("--------------------------");
		

		
		
	}

}
