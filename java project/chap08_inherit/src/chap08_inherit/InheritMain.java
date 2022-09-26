package chap08_inherit;

public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SportsCar car1 = new SportsCar();
		// 상속받은 Car의 필드값을 사용할수 있다.
		// protected 접근지정자를 사용한 경우 상속이 가능하다
		System.out.println(car1.color);
		
		Car car2 = new Car(); // Car에서 움직는거 확인 
		// protected 접근지정자를 사용한 경우 접근이 가능하다
		System.out.println(car2.color);
		
		
		People p1 = new People();
		p1.selflntro();
		
		// 서브클래스는 슈퍼클래스의 생성자를 가져와서 
		// 슈퍼클래스의 생성자를 가져와서 실행한다
		Worker w1 = new Worker();
		System.out.println(w1.nextMonth()); // 1
		w1.selflntro(); // 홍길동입니다
		w1.setPeople("흥부","남자", 30);
		w1.selflntro();
		
		System.out.println(car1.speedUp(10)); // 5
		
		
		w1.intro();
		w1.selflntro(); // 흥부입니다null입니다.
		
		System.out.println("------------------------------");
		
		SportsCar car3 = new SportsCar(); // gear 1 speed 0 turbo 0
		SportsCar car4 = new SportsCar(10,2,"green",true);// color green gear 2 speed 10 turbo true
	
		// Worker에서 가져와도 People에있는 필드에 적용시켜서 가져오는모습
		Worker w2 = new Worker();
		Worker w3 = new Worker("놀부", "남", 40, "양반", 40);
		Worker w4 = new Worker("놀부", "남", 40, "양반", 40);
		w2.selflntro();// 홍길동입니다 일을 하고 있습니다.
		w3.selflntro();// 놀부입니다양반 일을 하고 있습니다.
		System.out.println(w3.getClass().getName());//패키지명클래스명출력
		System.out.println(w3.equals(w4)); // false 어디서부터 어디까지 비교할지안알려줌
											// Override 작성후 true
		// Object 라는 클래스는 모든 클래스의 슈퍼클래스(기본)
		// 모든 종류의 클래스가 들어갈 수 있다.
		// 아래와 같이 Object 객체를 매개변수로 사용하는 경우
		// 인수는 어떠한 값도 들어갈 수 있다.
		System.out.println(w3.equals(car3));
		// 이부분은 잘쓰진않음 이정도로만 알아놓기
		
		System.out.println("------------------------------");
		// car2.toString()결과와 car2의 결과 동일
		// 동일한 메소드 사용
		// 오버라이딩 하여 출력값을 바꿀수 있다.
		System.out.println(car2.toString());
		System.out.println(car2);
	}

}
