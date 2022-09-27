package Book;

public class Book {
	// 필드값
	protected String title;
	protected String author;
	protected int page;
	protected boolean checkOut;
	
	// 정적 필드
	private static int bookCount = 0;
	
	
	//정적 메소드
	public static int getBookCount() {
		return bookCount;
	}
	
	// 생성자
	// 디폴트 생성자
	public Book() {
		this.title = "미정";
		this.author = "미상";
		this.page = 0;
		this.checkOut = false;
		
		bookCount++; 
	}
	
	// 매개변수를 갖는 생성자
	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
		this.checkOut = false;
		
		bookCount++; // 한 정보를 입력받을때 마다 카운트 1씩 증가(몇개들어있는지확인)
	}
	
	// 메소드
	public  boolean getCheckOut() {
		return this.checkOut;
	}
	
	
	// 조건문 사용
	// checkOut 값이 true일 때 :
	// false로 값을 바꾸고, "책을 반납하였습니다"출력
	// false일 때 : true로 바꾸고 "책을 대여하였습니다" 출력
	public void isCheckOut() {
		if(checkOut == true) { // 대여시 true
			checkOut = false;
			System.out.println("책을 반납하였습니다.");
		}else if(checkOut == false) {
			checkOut = true;
			System.out.println("책을 대여하였습니다.");
		} // 처음 checkOut이 false 였으니까 else if 부터 시작 
	}		//else if 에서 true로 변경된 후 한번더작동시 if에서 false로 변경  ★★★★
	
	// 조건문 사용
	// checkOut이 false : "author의 title책이 현재 있습니다"
	// checkOut이 true : "author의 title책이 대여중입니다"
	public void printBook(){
		if(checkOut == false) {
			System.out.println(this.author+"의"+this.title+"책이 현재 있습니다.");
		}else{
			System.out.println(this.author+"의"+this.title+"책이 대여중입니다.");
		}
	}  // 위에서 false로해서 true로 바껴서 대여상태가되면 여기서도 같이적용 ★★★★
		// 위에서 대여면 true로 바뀌기 때문에 "책이 대여중"이 출력
	
}
