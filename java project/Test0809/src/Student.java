
public class Student {
	String name;
	int number;
	int score;
	
	
	Student(){ // 필드값 초기화
		this.name = "홍길동";
		this.number = 0;
		this.score = 0;
		

	}
	Student(String name, int number){
		this.name = name;
		this.number = number;
		this.score = 0;
		

	}
	void setScore(int score) { // 점수 입력받음
		this.score = score;
	}
	int getScore() { // 출력할려면 정수형 반환
		return this.score;
	}
	
	void printResult() {
		if(this.getScore()>=60) {
			System.out.println(this.name+"님은 "+"합격입니다");
		}else if(this.getScore()<60){
			System.out.println(this.name+"님은 "+"불합격입니다.");
		}
	}
}
