package chap05_while_for2;

public class while_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 while
		//조건이 참일때 안의 블록을 반복한다.
		int num = 6;
		while(num < 5) {
			System.out.println("반복하고 있습니다 : "+num); // 프린트안에서 확인가능
			num++; // ++ 로 1씩증가시켜주면 멈춤
		}
	}	

}
