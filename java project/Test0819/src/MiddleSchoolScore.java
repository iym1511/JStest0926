
public class MiddleSchoolScore extends Scores{
	// 필드값
	private String name;
	
	//생성자
	public MiddleSchoolScore() {
		this.name = " ";
	}
	// 수퍼클래스에서 상속받음
	public MiddleSchoolScore(String name, int korean, int math, int english) {
		super(korean,math,english);
		this.name = name;
	}
	
	//메소드
	// name을 추가한 평균 출력
	public void printArvg() {
		System.out.println(name+"의 평균 점수 "  + arvg());
	}
}
