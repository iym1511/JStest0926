package chap07_2_getset;

public class GetsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 실습 반려동물 진료카드 
		// 접근, 설정자
		AnimalCard AnimalCard1 = new AnimalCard(); 
		AnimalCard1.setAnimal("강아지");
		AnimalCard1.setName("복실");
		AnimalCard1.setMonth(7);
		System.out.println("종류 : "+AnimalCard1.getAnimal());
		System.out.println("이름 : "+AnimalCard1.getName());
		System.out.println("개월 수 : "+AnimalCard1.getMonth()+"개월"); 
		// 생성자로 출력한거
		AnimalCard AnimalCard2 = new AnimalCard("고양이","메시",5); 
		System.out.println("종류 : "+AnimalCard2.getAnimal());
		System.out.println("이름 : "+AnimalCard2.getName());
		System.out.println("개월 수 : "+AnimalCard2.getMonth()+"개월");
		
		
		// 실습. 동물종류와 이름과 개월수를 출력하는 메소드
		// ! get 메소드를 이용해서 이름값을 가져오자
		// 출력내용 :   동물종류 : animal, 이름 : name , month개월
		// 메소드안에서 메소드 부르는거확인
		AnimalCard2.printAnimalCard();
		AnimalCard1.printAnimalCard();
		
	}

}
