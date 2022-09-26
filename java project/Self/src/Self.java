import java.util.Scanner;

public class Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  Scanner input=new Scanner(System.in);
			  
		// 1. 15의 배수
			  System.out.print("곱할 수 를 입력하시오. : ");
			  int b = 15;
			  int b1= input.nextInt();
			   System.out.println(b*b1);
			   
			   
			   
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//1-2. 관계 논리연산자
		int x = 3;
		String name = "길동";
		boolean isCheak = false;
		System.out.println(x>=3&&x<10);
		System.out.println(name != "홍길동");
		System.out.println(isCheak == false);
		
		   
		//--------------------------------------------------------
		System.out.println("--------------------------");
			   
		//2. 비밀번호가"1111"일 때
		//문자를 비교할때는 .equals(비교할문자)를 사용하면 된다
		
		System.out.println("비밀번호를 입력하세요 : ");
		String password = input.next();
		if(password.equals("1111")) {
			System.out.println("비밀번호가 맞습니다.");
		}else {
			System.out.println("비밀번호가 아닙니다.");
		}
			   
		//--------------------------------------------------------
		System.out.println("--------------------------");

		//2-2. 달의 일수를 출력하는 프로그램
		System.out.print("달 을 입력하시오 : ");
		int number= input.nextInt();
		switch(number) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일");
		break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일");
		break;
		case 2:
			System.out.println("28,29일");
		break;
		default:
			System.out.println("입력하신 달은 없습니다.");
			break;
		}
	
		
		
		
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		//3. "그만" 을 입력할 때 까지 입력받은 문자열을 그대로 출력하는 프로그램 ???
		
		
			System.out.println("그만을 입력하면 멈춥니다. 아무글이나 입력하세요 : ");
			String word = input.next();
		while(!word.equals("그만")){ //참일떄 반복인데 앞쪽에 ! 붙여주면 아닐떄 반복
			System.out.println(word);
			System.out.println("그만을 입력하면 멈춥니다. 아무글이나 입력하세요 : ");
			word = input.next();
		}
		
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		//3-2. for 구구단
		for(int i=2; i<=15; i++) {
			System.out.println("<"+i+">단");
			for(int j=1; j<=15; j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		//4. 교통카드
		
		int card = 3000;
		int pay = 1300;
		
		System.out.println("지하철에 탑승하시겠습니까? 네:1, 아니오:0" );
		int getSubway = input.nextInt();
		while(getSubway == 1) {
			if(card >= pay) {
				card -=pay;
				System.out.println("탑승하였습니다. 현재남은 잔액은"+card+"원 입니다.");
			}else {
				System.out.println("잔액이 부족합니다.");
			}
			System.out.println("지하철에 탑승하시겠습니까? 네:1, 아니오:0" );
			getSubway = input.nextInt();
		}
		
		
		
		
//		int money = 3000;
//		int sub = 1300;
//		int can;
//		
//		System.out.println("지하철에 탑승하시겠습니까? 네:1, 아니오:0" );
//		can = input.nextInt();
//		while(true) {		
//		if(money >= 0){
//			System.out.println("탑승하였습니다. 현재남은 잔액은"+(money -sub)+"입니다");
//			money -=sub;
//			System.out.println("지하철에 탑승하시겠습니까? 네:1, 아니오:0" );
//		
//		}else if(0 >= money){
//			System.out.println("지하철에 탑승하시겠습니까? 네:1, 아니오:0" );
//			System.out.println("잔액이 부족합니다.");
//
//		}else if(can == 0){
//			System.out.println("종료");
//			break;
//		}
//	  }
		

	}
}
