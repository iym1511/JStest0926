
public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game game1 = new Game("가위바위보");
		BoardGame boardGame1 = new BoardGame(3,"원카드");
		game1.play();
		game1.end();
		boardGame1.play(); // 메소드 오버라이딩으로 바뀐 내용 출력
		boardGame1.end(); // 부모클래스의 내용 출력
		
	}

}
