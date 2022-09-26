
public class BoardGame extends Game{
	// 필드
	private int peopleNum;
	
	public BoardGame() {
		this.peopleNum=0;
	}
	// 매개변수를 갖는 생성자
	public BoardGame(int peopleNum, String gameTitle) {
		super(gameTitle);
		this.peopleNum = peopleNum;
	}
	
	// 메소드
	// 슈퍼클래스와 동일한 메소드임으로 오버라이딩 한다.
	public void play() {
		System.out.println(this.peopleNum+"명이서 "+this.getGameTitle()+"게임을 시작합니다");
	}
	
	public void end() {
		System.out.println(this.getGameTitle()+"게임을 종료합니다");
	}
}
