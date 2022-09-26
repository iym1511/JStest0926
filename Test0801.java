import java.util.Scanner;

public class Test0801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//출력할 단을 입력하세요(2~9)
		
		Scanner input=new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요(2~9) : ");
		int i= 1;
		int j=1;
		i =input.nextInt();
			if(i>2 && i<10) {
			for(j=1; j<=9; j++) {	
			System.out.println(i+"X"+j+"="+(i*j));
			}
		}else{
			System.out.println("구구단에 등록된 수가 아닙니다.");
		}

			
		//--------------------------------------------------------
		System.out.println("--------------------------");
			
		
		//메뉴를 입력받아 출력
		
//			int one =1;
//			int two =2;
//			int three=3; 
//			int exit=0;
//			int menu;
//			System.out.println("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
//			menu =input.nextInt();
//			while(true) {
//				if(menu == one) {
//					System.out.println("짜장을 선택하였습니다");
//					System.out.println("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
//					menu =input.nextInt();
//				}else if(menu == two) {
//					System.out.println("짬뽕을 선택하였습니다.");
//					System.out.println("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
//					menu =input.nextInt();
//				}else if(menu == three) {
//					System.out.println("탕수육을 선택하였습니다.");
//					System.out.println("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
//					menu =input.nextInt();
//				}else if(menu == 0){
//					System.out.println("종료되었습니다");
//					break;
//				}
//				
//			}

		
		//이게 더 간략
			int menu;
			System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			menu =input.nextInt();
			while(true) {
				if(menu == 1) {
					System.out.println("짜장을 선택하였습니다");
				}else if(menu == 2) {
					System.out.println("짬뽕을 선택하였습니다.");
				}else if(menu == 3) {
					System.out.println("탕수육을 선택하였습니다.");
				}else if(menu == 0){
					System.out.println("종료되었습니다");
					break;
				}
				System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
				menu =input.nextInt();
			}
		
		
		
	}
	
}
