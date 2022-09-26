
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 연습문제 

		int[] score = { 50, 60, 36, 90, 100 };
		int count = 0;
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 60) {
				count++;
				sum += score[i];
				// System.out.println(sum); 출력 확인
				avg = sum / count; // 여기 안담고 프린트에서 바로 출력가능
				// System.out.println(avg); 출력 확인
				System.out.println(i + 1 + "번 : " + "합격");
			}
		}
		System.out.println("합격자 평균 : " + avg);

	}

}
