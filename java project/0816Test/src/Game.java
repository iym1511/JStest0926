
public class Game {
	// 필드
	protected String gameTitle;
	
	//생성자
	// 디폴트 생성자
	public Game() {
		this.gameTitle="미정";
	}
	// 매개변수가 있는 생성자
	public Game(String gameTitle) {
		this.gameTitle=gameTitle;
	}
	public String getGameTitle() {
		return this.gameTitle;
	}
	
	// 메소드
	public void play() {
		System.out.println(this.gameTitle+"게임을 시작합니다.");
	}
	public void stop() {
		System.out.println(this.gameTitle+"게임을 멈춥니다.");
	}
	public void end() {
		System.out.println(this.gameTitle+"게임을 종료합니다.");
	}
}
