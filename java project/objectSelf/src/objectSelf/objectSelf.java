package objectSelf;

public class objectSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		String[] names = {"흥부", "놀부"};
		for (String nameeach : names) { // 그냥 해봄
			System.out.println(nameeach);
		}
		System.out.println(names[1]);
		
		
		//클래스 연습문제

	
		
		Book myBook = new Book();
		Book myBook1 = new Book("흥부전", 1);// 0으로하면 페이지입력안되있다고뜸 / 1이라하면 입력되있다함
		System.out.println(myBook.getTitleEx());
		System.out.println(myBook1.getTitleEx());
		myBook.setTitleEx("심청전");
		System.out.println(myBook.getTitleEx());
		
		System.out.println(myBook.checkPageCountEx());
		System.out.println(myBook1.checkPageCountEx());
		//myBook.StartPlay(); 
		
		if(myBook1.checkPageCountEx()) {
			System.out.println("페이지가 들어가있습니다");
		}else {
			System.out.println("페이지가 입력되어있지않습니다");
		}
		
	}

}
