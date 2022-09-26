package objectSelf;

import java.util.Scanner;

public class Book {
	// 필드
	 String title;
	 int page;

	Book(){
		this.title = "제목미정";
		this.page = 0; 
	}
	Book(String title, int page){ // 대입받는곳
		this.title = title;
		this.page = page;
	}
	
	// 메소드
	// 책 제목을 받아서 와서 값을 넣어주는 메소드
	void setTitleEx(String title) { // 여기에 대입값 입력
		this.title = title;
	}
	// 책 제목을 return 해주는 메소드
	String getTitleEx() {
		return this.title;
	}
	
	// 책 페이지가 0이면 false를 출력하는 메소드, 0이 아니면 true
	public boolean checkPageCountEx() {
		boolean check;
		if(this.page == 0) {
			check = false;
		}else {
			System.out.println("true");
			check =  true;
		}
		return check;
	}
	
	// -------------------------------------------------------
	
	// 내가 한거
	String getTitle() {
		Scanner input = new Scanner(System.in);
		System.out.println("책 제목을 입력하세요 : ");
		this.title = input.next();
		return this.title;
	}

	void setTitle(String title) {
		System.out.println(this.title);
	}
	void StartPlay() {
		this.setTitle(getTitle());
		this.checkPageCount();
	}
	
	boolean checkPageCount() {
		if(this.page == 0) {
			System.out.println("false");
			return false;
		}else {
			System.out.println("true");
			return true;
		}
		
	
		
	}

}
