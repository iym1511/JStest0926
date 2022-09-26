package chap07_Object;

public class NumCheck {

	// 실습 숫자를 입력받고 양수/음수를 알려주는 클래스
	// 필드
	// private = 클래스 안에서만 접근가능
	private int num;
	
	// 메소드, 접근제어자를 붙여서 범위를 알려줄수있다
	// public = 모든 곳에서 접근가능
	// 필드값에 비교할 숫자값을 작성
	// return 값이 없기 때문에 void를 사용
	public void setNum (int num) {  // ★★★★ 괄호안에 변수는 불러오는 클래스에서 대입을해주기 위함
		/*if(num < 0) {
			이런식으로 상위클래스에서 대입된문자를 비교도 가능
		}*/
		this.num = num;  
	}
	
	// 숫자값을 되돌려줌
	// return 값이 자료형이 int 임으로 앞에 int를 붙여줌
	public int getNum() { // int는 리턴 반드시 사용
		return this.num;
	}
	
	// 양수, 음수, 0 비교 후 출력 메소드
	// 메소드안에 다양한 코드들을 작성할 수 있다
	public void checkNum() {
		if(this.num > 0) {
			System.out.println("양수입니다.");
		}else if(this.num < 0){
			System.out.println("음수입니다.");
		}else {
			System.out.println("0");
		}
	}
	
	
	
}