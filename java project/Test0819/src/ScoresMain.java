
public class ScoresMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scores[] scorelist = { new Scores(80, 20, 60), new Scores(70, 70, 70)
			, new Scores(80, 90, 80),new Scores(60, 80, 30), new Scores(40, 60, 70)};
		for(int i =0; i<scorelist.length; i++) {
			//scorelist[i].arvg() = 스코어리스트배열 안에서 평균값메소드를사용해 하나씩 평균냄
			System.out.println((i+1)+"번 평균 : "+ scorelist[i].arvg());
		}
		

		
		MiddleSchoolScore a = new MiddleSchoolScore("홍길동", 70, 80, 90);
		System.out.println(a.arvg());
		a.printArvg();
	}

}
