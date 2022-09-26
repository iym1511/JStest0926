package chap07_2_Array;

import java.util.Scanner;

import chap07_2_getset.AnimalCard;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 직접 작성한 클래스를 배열에 넣어서 사용 가능
		// 지금 작성하는 객체는 배열을 담는 배열의 객체★★★
		AnimalCard[] cards = new AnimalCard[10]; // 배열10칸생성
		
		// 배열안의 객체는 따로 생성해야 함
		// 직접작성한 클래스를 배열로 만들어서 쓸때 new를 두번사용
		// 1. 배열 생성 2. 배열안의 각각의 클래스객체 생성
		// 배열 1 당 안에 필드변수 적은만큼 들어가있음 ★★★
		cards[0] = new AnimalCard(); // 이 경우는 하나하나 값을 넣어줘야함
		System.out.println(cards[0].getMonth() ); // 0
		
		// 클래스객체의 배열의 경우 for문을 이용하여 클래스 객체 생성
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new AnimalCard(); // 0~9까지 0이 들어감
		}
		cards[0].setAnimal("강아지");
		cards[0].printAnimalCard();
		
		System.out.println("---------------------------------------");
		
		// 콘솔에서 값 입력받아서 넣어주기
		Scanner input = new Scanner(System.in);
		System.out.println("동물의 종류와 이름과 개월을 작성하세요 :");
		String animal = input.next();
		String name = input.next();
		int month = input.nextInt();
		cards[1].setAnimal(animal);
		cards[1].setName(name);
		cards[1].setMonth(month);
		// 배열 1 칸에 메소드적용해서 출력
		// 이러면 한줄만나옴 배열1에만 적용했으니
		cards[1].printAnimalCard();// 동물종류:고양이 | 이름:나비 | 12개월
		
		System.out.println("----------------------------------------------");
		
		
		// AnimalCard클래스의 객체 배열을 만들고 그 안에 값을 넣으세요
		// 배열의 길이는 3
		// 값은 아무 값으로 넣어주시면 됩니다/
		// 내용확인 printAnimalCard()를 통해 확인
		AnimalCard[] animalCards = new AnimalCard[3];
		for (int i = 0; i<animalCards.length; i++) { // 0, 1, 2
			animalCards[i] = new AnimalCard(); // 배열3개생긴거알려줌
		}
		animalCards[0].setAnimal(animal); // 위에서 스캐너로 출력됨 0 은
		animalCards[0].setName(name);
		animalCards[0].setMonth(month);
		
		animalCards[0] = new AnimalCard("고양이", "구구", 4);
		animalCards[1] = new AnimalCard("강아지", "백구", 3);
		animalCards[2] = new AnimalCard("미어캣", "구백", 6);
		// 위에서 배열 0,1,2에 다 입력됫으니 for each에서
		// 배열3칸 만큼 3줄 출력
		//for each 으로 card로 이름변경
		for (AnimalCard card : animalCards) { 
			card.printAnimalCard();
		}
		System.out.println(AnimalCard.getCardCount()); // 17   new랑 배열 합친개수

		
				
		
	}

}
