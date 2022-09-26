package chap08_polymo;

public class People {
	// 필드
	protected String name;
	protected String gender;
	protected int age;
	
	// 메소드 
	// 생성자는 클래스 이름에() 이다 ★
	public People() {
		this.name ="홍길동";
		this.gender = "남";
		this.age = 20;
	}
	
	// 생성자	 이렇게하면 main클래스에서 new로 새로운 매개변수를 만들어서 그안에 대입
	public People(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	// 설정자   바로 호출가능
	public void setPeople(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	// name을 출력하는 메소드
	public void selflntro() {
		System.out.println(name+"입니다");

	}
	// 클래스를 상속받지 않을때 Object 클래스를 상속받는다
	// 필요하다면 Override를 통해 내용을 수정해서 사용할 수 있다
	@Override
	public boolean equals(Object object) {
		// 오브젝트 객체로 받아오는 경우는 클래스를 구분해서 사용
		// .getClass() .getName()을 이용하여 구분
		System.out.println("people의 내용이 출력되었습니다.");
		return true;
	}
	
	//동일한 이름을 갖는 중복정의가 됨.
	public boolean equals(People people) {
		System.out.println("people의 내용이 출력되었습니다.");
		return true;
	}
	
	
}
