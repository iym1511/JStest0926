import java.util.Scanner;

public class self2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 5; i++) { // 1 2 3 4 1(1234) 2(1234) 이런식으로 다비교해서
			for (int j = 4; j > 0; j--) {// 4 3 2 1 맞는게 1개 2개 3개 4개라 별표시가 저렇게됨
				if (i < j) {
					System.out.print("");
				} else {
					System.out.print("*");
				}

			}
			System.out.println("");
		}

		
		System.out.println("_____________________________");
		
		// 별개수 늘어낫다가 줄어드는거4최대 4개설정
		
		for(int i =0; i<5; i++) { 
			for(int j =0; j<5-i; j++)  {
				System.out.print("*");
			}
			System.out.println();
		} 
		for(int i =0; i<4; i++) {
			for(int j=0; j<i+2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		

		System.out.println("_____________________________");

		Scanner scan = new Scanner(System.in);
		System.out.print("입력  : ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) { // 0 1 2 3 4
			for (int j = n; j > i; j--) { // 5 4 3 2 1
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
