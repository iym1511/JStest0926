package chap07_Object;

public class ObjectClass {

	public static void main(String[] args) { // 메인은 한패키지에 하나만
		// TODO Auto-generated method stub
		// 객체의 생성
		Box myBox; // 같은 공간에있는 클래스 가져옴
		myBox = new Box();
		 
		// 객체 = 세상에 있는 객체(오브젝트) 를 참고하여 만듬.
		//		ex) 자동차, 상자
		// 자바는 객체지향 언어이다 - 캡슐화
		// 캡슐화의 특징 : 값과 메소드가 함께 들어가있다.
		// 				쉽게 바꿀수 있다
		// 객체를 표현하기 위해서 class 사용
		// class는 객체를 만드는 틀
		// 객체는 클래스를통해 생성된 것
		
		// 미리 작성된 클래스 String
		String name = new String("홍길동");
							// 객체 name은 . (도트)를 통해 메소드를 사용할 수 있다
		System.out.println(name.equals("홍길동"));
		
		// 직접만든 클래스의 객체 Box에 접근하기
		// 참조형 변수로 사용, 변수이름으로 접군 - 주소출력
		System.out.println(myBox); // chap07_Object.Box@5e91993f
		// 객체에 접근 하는 방법 - 필드의 값에 접근해서 출력
		System.out.println(myBox.height1); // myBox에 있던것 가져옴
		// 객체에 접근하는 방법 - 메소드의 계산 결과를 출력
		//int a = myBox.calVoume();
		//System.out.println(myBox.calVoume());
		//System.out.println(a); // 1000
		
		
		System.out.println("----------------------------------------------------");
		
		
		// 만든 클래스의 객체 생성하기
		Student myStudent = new Student(); // myStudent에 접근후 아래에서 결과출력
		System.out.println(myStudent.name);
		// 필드에 직접 접근해서 값할당 (잘 사용하지않음)
		myStudent.name = "홍길동";
		System.out.println(myStudent.name); //홍길동
		myStudent.age = 25;
		System.out.println(myStudent.age); //25
		myStudent.grade = 3; // 객체를 생성하고나면 그안에있는것만 제공
		myStudent.printGrade(); // myStudent의 메소드값도 들고와서 출력됨
		
		// myStudent 붕어빵
		// class(설계도) 붕어빵기계 틀
		System.out.println("----------------------------------------------------");
		
		// 다른 객체 생성
		Student myStudent1 = new Student();
		System.out.println(myStudent1.name);
		myStudent1.printGrade();
		
		System.out.println("----------------------------------------------------");
		
		// 변수에 들어가 있는 값 확인
		System.out.println(myStudent); // chap07_Object.Student@379619aa
		System.out.println(myStudent1); // chap07_Object.Student@cac736f
		
		System.out.println("----------------------------------------------------");
		
		// new와 생성자를 통해서 객체 생성
		// Box(50) 50의 값을 인수라고 부른다
		Box mybox2 = new Box(50); // 50*50*50
		//System.out.println(mybox2.calVoume()); // 125000
		
		System.out.println("----------------------------------------------------");
		
		//student 클래스에서 가져옴
		Student s1 = new Student();
		Student s2 = new Student("흥부");
		Student s3 = new Student("놀부", 25, 5);// 여기 5가 밑에 s3 값으로 나옴
		System.out.println(s1.name);
		System.out.println(s3.name+s3.age+" "+s3.grade); // 놀부25 5
		
		myBox.printData(); // 현재 가로세로높이길이 :10, 10, 10
		
		myBox.setWidth(50); // width만 50으로 변경
		myBox.printData(); // 50 10 10
		
		s1.setGrade(2);
		s1.printGrade();
		s3.printGrade(); // 다른값
		// return 값 25가 들어감
		System.out.println(s3.getAge());
		// 아래와 같이 출력되는것과 동일
		// System.out.println(25);
		
		s1.printLevel(); // s1의 값에따라 고학년 저학년이 나뉨 / 저학년
		s3.printLevel(); // 고학년
		
		System.out.println("----------------------------------------------------");
		
		// 실습 숫자를 입력받고 양수/음수를 알려주는 클래스
		// 생성된 객체를 통해서 메소드 실행
		NumCheck Num = new NumCheck();
		// 여기에 비교할 값을 작성/ 메소드에 따라 인수값 작성
		Num.setNum(1); // 1=양수 -1=음수 0=0
		Num.checkNum(); // if문 메소드 비교값 결과 출력
		
		System.out.println("----------------------------------------------------");
		
		// rendom의 범위 0< random() < <1
		System.out.println(Math.random()*10+1); // 실수로 랜덤해서나옴
		
		System.out.println("----------------------------------------------------");
		
		// 랜덤업다운 게임 객체확인
		//RandomUDclass game = new RandomUDclass();
		//game.start();
		//game.startPlay();
		
		System.out.println("----------------------------------------------------");
		
		
		// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		// 메소드 매개변수로 전달 - 값을 복사해서 전달
		// 기초형
		int x=5;		
		Box box4 = new Box();
		// 변수x를 넣어 값이 복사되어 들어가는지 확인
		System.out.println(box4.plus(x)); // x 기초형
		// 아래x 값이 바뀌지않았으면 값이 복사되어 들어간것.
		System.out.println(x);
		
		// 참조형 - 주소값이 복사되어 들어간다 > 객체에 바로 접근해서 수정
		Box cloneBox = new Box(50);
		// 가로 세로높이가 전부 50일때 결과 값
		System.out.println(cloneBox.calVoume()); // 참조형은 주소를 통해서 들어감 ★★★★★★★★★★★★★★★★★★
		box4.cloneBox(cloneBox); // 참조형 주소값 객체에 바로접근 수정 / 10 으로 다시변경
		// 주소값으로 접근했기 때문에, 값이 수정되어 출력
		System.out.println(cloneBox.calVoume()); // 가로*세로*높이
		// 변수하고 객체가같으면 동일한값(?)
		
		
		// 기초형의 값을 넣고 수정해서 사용하고 싶은 경우
		int y = 10;
		// 메소드의 return값을 동일한 변수가 받아와서 저장한다.
		y = box4.plus(y); // 아까만든 plus에다가 해서 11출력
		System.out.println(y);
		
		
		Box box5 = new Box(30);
		System.out.println(box4.equalsBox(cloneBox)); // 10 &&  10 
		System.out.println(box4.equalsBox(box5)); // 10 && 30
		
		if (box4.equalsBox(box5)) {
			System.out.println("크기가 같은 박스입니다");
		}else {
			System.out.println("크기가 다른 박스입니다");
		}
		
		System.out.println("----------------------------------------------------");
		
		// 정적 변수는 각각의 객체를 통해서 출력할수 있다
		System.out.println(box4.boxCount); // 변수개수 5
		System.out.println(box5.boxCount); // 변수개수 5
		// 정적 변수는 클래스를 통해서 출력할수 있다
		System.out.println(Box.boxCount); // 변수개수 5
		// 클래스에서 접근할수있는값이 정적변수 
		Box box6 = new Box();
		System.out.println(box4.boxCount); // 변수개수 6개
		
		// 다른 클래스에서 만든 정적 변수(상수)
		System.out.println(Math.PI); 
		
		// 실습내용 확인을 위한 정적변수
		System.out.println(Student.studentCount); // 5
		// 여기 클래스안에 Student의 객체(인스턴스)가 위에 5개 만들어져 있어서 5개
		
		// 정적메소드를 이용한 출력
		System.out.println(Box.getBoxCount()); // 클래스 이름으로 사용하는 메소드 / 6개
		
		// Math의 정적 메소드 사용
		// sqrt() 제곱근을 구하는 메소드
		// 객체를 가지고 있지 않기에, 값을 받아와서 계산
		System.out.println(Math.sqrt(10)); // 3.1622776601683795
		
		System.out.println(Student.getstudentCount());
		
		System.out.println("----------------------------------------------------");
		
		// 실습 ★★★★★★★★★★★★★
		// 정적 메소드를 가진 클래스 확인.
		System.out.println(MathNum.intMax(10, 4)); // 10
		System.out.println(MathNum.intAdd(10, 4)); // 14
		// (4123/134, 6234/231)와 (673/3, 424/2) 에서 각각의
		int maxA = MathNum.intMax(4123/134, 6234/231); // 나눈거 둘중 큰거비교
		int maxB = MathNum.intMax(673/3, 424/2); // 나눈거 둘중 큰거비교
		int sum = MathNum.intAdd(maxA, maxB); // 그리고 각각 둘중 큰거 더함
		System.out.println(sum); // 254
		
		System.out.println("----------------------------------------------------");
		
		// 정적변수를 이용한 상수
		// MAX_BOX_LINE = 10; > final키워드라 수정할수없다
		System.out.println(Box.MAX_BOX_LINE); // 300 Box클래스의 정적변수값을 가져옴

	}									

}
