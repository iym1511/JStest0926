package chap08_inheritAnimal;

import java.util.Scanner;

public class AnimalCardArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnimalCardNew[] cards = new AnimalCardNew[AnimalCardNew.MAX_CARD];
		for(int i= 0; i<AnimalCardNew.getCardCount(); i++) { // 99쓰면 바로 99 개됨 카드하나작성하면 100됨
			cards[i] = new AnimalCardNew(); // 그뒤로는 추가할수없다함
		}
		// 여기서부터 생성자가 들어옴 | 배열시작
		// card[AnimalCard.getCardCount()] = new AnimalCard(); // 0배열 
		// card[AnimalCard.getCardCount()] = new AnimalCard(); // 1배열
		
		// 진료카드만들기(콘솔)
				// 1. 선택을 통해서 내용 확인
				// 1) 진료카드의 갯수 2) 진료카드 내용확인 3) 진료카드 작성 4) 종료
				// 2. 카드의 갯수가 100일경우 만들수 없음
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.진료카드갯수 2.진료카드내용확인 3.진료카드작성 0.종료");
			
			int option = input.nextInt();
			
			if(option == 1) {
				// 진료카드의 갯수는 정적변수인 cardCount 내용 확인
				System.out.println("현재 진료카드는"+AnimalCardNew.getCardCount()+" 개 입니다");
			}else if(option == 2) {
				// 전체 진료카드는 작성된 진료카드!
				// 배열의 길이가 아니라 현재 작성된 진료카드의 개수로 확인
				for (int i = 0; i<AnimalCardNew.getCardCount(); i++) {
						cards[i].printAnimalCard(); // for i 값이 배열로 들어감
				}
				
				// 인덱스 값을 통해서 하나만 확인하는 내용
				System.out.println("확인할 진료카드 인덱스를 적어주세요 : ");
				int index=input.nextInt();
				if (index >= 0 && index < AnimalCardNew.getCardCount()) {
					cards[index].printAnimalCard();
				}else {
					System.out.println("존재하지않는 카드입니다");
				}
				
				
				
			}else if(option == 3) {
				// getCardCount = 100 까지 가능
				// 100이 되었을때 더이상 추가할수 없습니다를 출력
				// 아래 내용을 실행하지않음 (진료카드 추가)
				if (AnimalCardNew.getCardCount() == 100) {
					System.out.println("더이상 추가를 할 수 없습니다.");
					continue;
				}
				
				
				// 새 진료카드 추가 - 입력
				System.out.println("동물의 종류, 이름 개월수를 작성하세요");
				String animal = input.next();
				String name = input.next();
				int month = input.nextInt();
				System.out.println("보호자의 이름을 작성하세요 : ");
				String personName = input.next();
				
				// 인덱스 값을 전체 카드의 개수로 넣어서 사용
				cards[AnimalCardNew.getCardCount()] = new AnimalCardNew(animal, name, month,personName);
				System.out.println("작성이 완료되었습니다.");
			}else if(option == 0) {
				System.out.println("진료카드를 종료합니다.");
				break;
			}
			
		}
	}
	
	

}