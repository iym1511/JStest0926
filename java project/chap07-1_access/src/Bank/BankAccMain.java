package Bank;

public class BankAccMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BankAcc 클래스 확인
		BankAcc Bank1 = new BankAcc("1237");
		Bank1.inMoney(30000);
		// outMoney메소드 수정하여
		// 출금금액이 클때 못빠져나가게 할수있다
		Bank1.outMoney(40000);
		System.out.println(Bank1.getMoney());
	}

}