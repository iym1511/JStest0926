package chap06_array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 확인
		int[] numbers; // 배열의 참조변수 선언
		numbers = new int[6]; // 배열의 생성
		int[] numbers2 = new int[6]; // 배열 생성
		int[] numbers3 = numbers2; // 배열의 주소 전달
		
		// {} 중괄호를 통해서 값을 바로 입력가능(초기화)
		int[] scores = {10, 20, 40, 70};
		int index = 0;
		
		// [] 대괄호를 이용하여 배열의 값 접근
		// [] : 인덱스 (0~) : 정수값(변수)
		numbers[0] = 1;
		System.out.println(scores[index+1]);
		System.out.println(scores); // 배열은 바로출력x
		System.out.println(numbers);
		System.out.println(numbers2);
		System.out.println( numbers3);
		
		numbers2[0]=5;
		System.out.println(numbers2[0]);
		System.out.println(numbers3[0]);
		
		// for 문을 이용한 배열요소 출력
		// 배열의 길이를 직접입력해줄수있지만 length를 사용해서 쓸수있다
		for(int i=0; i<scores.length; i++) { // length 현재 scores에있는길이 0~3(총4)
			System.out.println(scores[i]);
		}
		// for-each 루프
		// 배열안에 있는 요소를 score에 담아서 사용할수 있다 ★★
		// 배열안에있는 값을 가져오는 것이기 때문에 배열의 값을 수정할 수 없다
		for(int score : scores) {
			System.out.println(score);
		}
		
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		// 실습, double배열 초기화
		// double 배열의 초기화 배열에 학생들의 키 저장 후 평균 구하기
		double[] heights = {170.1, 173.2, 168.5, 176.2, 180.1};
		double sum=0;
		for(int i=0; i<heights.length; i++) { // 0부터 1,2,3,4 에 있는 배열값 출력
			sum+=heights[i];
			//System.out.println(height[i]); 나열된거 확인
		}
		System.out.println("학생 키 평균 : "+sum/heights.length); // 5칸 배열되있으니 sum/5하고 같음
		
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 2차원 배열
		// 2차원 배열의 선언과 생성
		int [][] numArray = new int[3][5];
		int count =1;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<5; j++) {
				numArray[i][j] = count; // count값을 numArray값에 담음
				count++;
				System.out.print(numArray[i][j]+" ");
			}
			System.out.println();
		}
					
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		
		// 2차원 배열 초가화         // 0            // 1          // 2
		int[][] tableArray = {{10, 20, 30}, {40, 50, 60, 65}, {70, 80, 90}};
		for(int i = 0; i < tableArray.length; i++) {
			for(int j = 0; j<tableArray[i].length; j++) { //, 단위로 끊어진 {10, 20, 30} 을 들고옴
				System.out.print(tableArray[i][j]+" ");
			}
			System.out.println();
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 실습 2차원배열 - 단어장
		String [][] words = {{"chair", "의자"}, {"computer", "컴퓨터"}, {"integer", "정수"}};
		for(int i = 0; i < words.length; i++) {
			for(int j = 0; j< words[i].length; j++) {
				System.out.print(words[i][j]+" ");
			}
			System.out.println();
		}
		
		//--------------------------------------------------------
		System.out.println("--------------------------");
		
		// 선택정렬코드 ★★★★어려움
		int[] numberSort = {5, 2, 6, 1};
		int temp, least;
		
		for(int i = 0; i<numberSort.length-1; i++) {
			least = i;
			for (int j = i+1; j<numberSort.length; j++) {	// +1은 두칸쨰부터 시작하기떄문
				// 값들을 하나씩 비교하면서 최소값 확인
				if(numberSort[j] < numberSort[least]) {
					least = j; // 현재 값이 더 작다면 인덱스값을 넣어줌
				}
			}
			// 반복문이 끝난후에 가장 작은 값의 위치를 바꿔줌
			temp = numberSort[i]; // 첫번째의값을 저장
			// 첫번째 자리에 가장작은 값 할당
			numberSort[i] = numberSort[least];
			numberSort[least] = temp;
		}
		
		
		
		
	}

}