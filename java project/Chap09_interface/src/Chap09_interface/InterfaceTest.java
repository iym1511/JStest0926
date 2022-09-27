package Chap09_interface;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스를 구현하여 작성한 클래스는 서브클래스와 동일하게 쓰인다.
		// -상속과 인터페이스의 차이점-
		// 상속은 부모클래스의 필드/메소드를 가져다 쓰고 필요한 부분을 오버라이딩
		// 인터페이스는 인터페이스의 추상메소드를 오버라이딩해서 사용

		Truck t1 = new Truck();
		t1.move();
		t1.printCar();
		// -인터페이스 쓰는이유-
		// 하나의 인터페이스로 여러 클래스의 메소드의 이름을 동일하게 사용해야할때(여러명이서 작업도하니까)
		// 인터페이스 구현을 할때 반드시 오버라이딩을 하기때문에
		// 작성할 메소드의 갯수가 동일
		Taxi t2 = new Taxi();
		t2.printCar();
		
		DisplayTV tv = new DisplayTV();
		tv.onDisplay();
		tv.offDisplay();
		
		Student s1 = new Student();
		Student s2 = new Student("흥부",0); // 1
		System.out.println(s1.compareTo(s2)); // tv 입력하면 Student객체가 아닙니다. 10
		int check = s1.compareTo(s2);
		
		switch (check) {
		case 1:
			System.out.println("s1의 학년이 더 높습니다");
			break;
		case 0:
			System.out.println("s1의 학년이 같습니다");
			break;
		case -1:
			System.out.println("s1의 학년이 더 낮습니다");
			break;
		default:
			System.out.println("잘못된 객체입니다.");
		}
		
		System.out.println("---------------------0818-------------------------");
		
		// 익명메소드 - 한번만 사용가능 메인클래스에서만 사용가능(메인으로 인터페이스 바로불러오기)
		CarInterface ci = new CarInterface() {
			@Override
			public void printCar() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스의 객체입니다");
			}
			
		};
		ci.printCar();
		
		// DisplayInterface를 이용하여 인터페이스 객체를 만드세여(익명객체)
		// 변수이름은 di
		// di가 켜졌습니다
		
		DisplayInterface di = new DisplayInterface() {

			@Override
			public void onDisplay() {
				// TODO Auto-generated method stub
				System.out.println("di가 켜졌습니다");
				
			}

			@Override
			public void offDisplay() {
				// TODO Auto-generated method stub
				System.out.println("di가 꺼졌습니다");
			}
			
		};di.onDisplay();
		di.offDisplay();
		
		// 클래스를 상속받고 인터페이스를 구현한 서브클래스
		Taxi taxi = new Taxi();
		taxi.setTaxi("red", 100);
		System.out.println(taxi.getTextColor());
		
		// Truck 클래스에 Car를 상속하여
		// setTruck과 getTruckColor를 작성하세요
		Truck truck = new Truck();
		truck.setTruck("blue", 100);
		System.out.println(truck.getTruckSpeed()); // 100
		System.out.println(truck.getTruckColor()); // blue
		
		// 인터페이스의 상속과 상수의 정의
		Bus bus = new Bus();
		bus.RestDay(1); // 일요일입니다. / bus에 상속받아있음
		
		// 인터페이스의 다형성
		// 참조변수의 자료형은 인터페이스 이더라도 
		// 안에 객체는 인터페이스를 구현한 객체가 들어오고 그 메소드를 사용할수 있다
		// 앞에 슈퍼클래스가아닌 인터페이스~
		CarInterface car = new Truck();
		// 인터페이스 안의 내용만 사용 ★★★
		car.printCar(); // 인터페이스의 내용을 Truck에서 구현했습니다.
		
		CarInterface car2 = new Taxi();
		car2.printCar(); // 인터페이스의 내용을 Taxi에서 구현했습니다
		
		
		
		// 강제형변환 - 슈퍼클래스나, 인터페이스로 만든 참조변수로 접근하는데 한계
		// 특히 상속의 경우는 서브클래스가 다른 메소드를 가질 확률이 높다
		// 다른메소드 접근할려고 + 위에서처럼되면 인터페이스꺼밖에 못가져오니까 ★★★★★★
		Truck carTruck = (Truck) car;
		carTruck.setTruck("yellow", 20);
		carTruck.printCar(); // Truck 메소드 다 사용가능
		
		// 차 3대를 배열에 넣어서 생성
		// CarInterface를 사용해서 Taxi, Truck, Bus 까지 객체 생성
		CarInterface[] carArray = {new Truck(), new Taxi(), new Bus()};
		
		// 생성된 객체를 for문을 통해서 printCar출력
		// Bus는 printCar의 내용을 작성하지않아서 출력되지않음
		// 확인하고 싶은 분들은 printCar의 내용을 채워주시면 됩니다.
		for(int i=0; i<carArray.length; i++) {
			carArray[i].printCar(); // Truck,Taxi 구현문구 출력
		}
		
	}

}
// 인터페이스에서 정의를해주고 클래스에서 구현
// 오버로딩은 이름은같지만 다른 메소드를 중복으로선언
// 오버라이딩은 부모클래스의 메소드의 동작방법을 (변경)재정의하여 우선적으로 사용되는것