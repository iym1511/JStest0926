
public class Scores {
	
	// 필드값
	protected int korean;
	protected int math;
	protected int english;
	
	// 생성자
	public Scores() {
		this.korean=0;
		this.math=0;
		this.english=0;
	}
	
	public Scores(int korean, int math, int english) {
		this.korean=korean;
		this.math=math;
		this.english=english;
	}

	// 메소드
	// 평균출력
	public int arvg() {
		return (korean+math+english)/3;
	}
}