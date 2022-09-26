package chap07_1_access;

// 서로 다른 패키지에 있으면 import로 들고와서 사용 가능
import chap07_1_accessB.AccessB;
import java.util.Scanner;

class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 같은 패키지 안에 들어있음
		AccessA a = new AccessA();
		a.printName();

		// 다른 패키지 안에 들어있는 클래스 접근
		AccessB b = new AccessB(); // 임포트 해주면 된다
		b.printName();// 다른패키지를 쓰기위해 public으로 메소드를 생성해야 가져옴

	}

}
