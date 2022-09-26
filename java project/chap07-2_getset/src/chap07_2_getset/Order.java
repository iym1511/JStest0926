package chap07_2_getset;

import java.util.Calendar;

public class Order { // 쇼핑몰 Order클래스 배열10 써서
	private String orderNumber;
	private String id;
	private String name;
	private String productNum;
	
	private static int orderCount = 0;
	
	// 정적변수 orderCount
	// 생성자 / 두가지방법 밑에 캘린더 처럼 불러오는생성자랑 두개 존재(알아만놔)
	public Order(){
		
		this.orderNumber = numString(); // 이거 있어서 numString에만 ++
		this.id = "";
		this.name = "";
		this.productNum = "PD-000";
		
	}	
	
	public Order(String I, String N,String P){
		this.orderNumber = numString();
		this.id = I;
		this.name = N;
		this.productNum = P;

	}	

	
	public void setOrderNumber(String OrderNumber) { // 받아오는곳
		this.orderNumber = OrderNumber;
	}
	public  String getOrderNumber() { // 받아온거 출력
		return this.orderNumber;
	}
	
	
	public void setId(String Id) {
		this.id = Id;
	}
	public String getId() {
		return this.id;
	}
	
	
	public void setName(String Name) {
		this.name = Name;
	}
	public String getName() {
		return this.name;
	}
	
	
	public void setProductNum(String ProductNum) {
		this.productNum = ProductNum;
	}
	public String getProductNum() {
		return this.productNum;
	}

	// orderNumber 자동으로 작성하는 메소드
	private String numString() {
		Calendar cal = Calendar.getInstance();
		// 년도, 달, 일
		// cal객체를 이용하여 현재 날짜를 받아옴
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH)+1;
		int date = cal.get(cal.DATE);  
		// 정적변수 orderCount를 사용하여
		// String 20228110 이라는 값을 만드세요
		String numString = Integer.toString(year)
				+Integer.toString(month)
				+Integer.toString(date)
				+Integer.toString(orderCount);
		// 0 이 포함된 202208110000 만들기
		// format : 문자열 안에 %d(정수), %s(문자열) 와 같이 기호를 통해 변수를 넣음
		// 숫자형의 경우 숫자가 차지할 공간을 지정해 줄수 있다.
		// 앞에 0이 붙으면 빈 공간을 0으로 채워준다 : %02d(빈공간은 0으로)
		String numZeroString = String.format("%d%02d%02d%04d", year, month
				,date, orderCount);//year month가 %d%d 로들어감
		
		
		orderCount++;
		return numZeroString;
		
	}
	
}
