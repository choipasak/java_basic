package basic.array;

import java.util.Arrays;

public class Array2DQuiz {

	public static void main(String[] args) {

		int[][] score = {
				{79, 80, 99}, //A학생
				{95, 85, 89}, //B학생
				{90, 65, 56}, //C학생
				{69, 78, 77}  //D학생
				//과목: 3과목
		};
		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};


		/*
        1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        2. 각 과목의 평균을 출력해 보세요.
        3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
		 */

		/*
		//1번
		for(int i=0; i<stuName.length; i++) {
			int sum = 0;
			for(int j=0; j<subName.length; j++) {
				sum += score[i][j];
			}
			double savg = (double)sum/3;
			System.out.printf("평균 : %.1f\n", savg);

		}
		System.out.println("==========================");

		//2번
		for(int i=0; i<subName.length; i++) {
			int sum = 0;
			for(int j=0; j<stuName.length; j++) {
				sum += score[j][i];
			}
			int avg = sum/score.length;
			System.out.println("과목 당 평균 : " + avg);
		}
		System.out.println("==========================");

		//3번
		int sum = 0;
		for(int i=0; i<stuName.length; i++) {
			for(int j=0; j<subName.length; j++) {
				sum += score[i][j];
			}
//			System.out.println(sum);
			int aavg = sum / 12;
		}
		System.out.println(aavg);
		 */
		
		//선생님 풀이
		// 1번
		int idx = 0; //stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
		double totalavg = 0.0;
		for(int[] stu : score) {
			int total = 0;
			for(int s : stu) {
				total += s;
			}
			double avg = (double)total / subName.length;
			totalavg += avg;
			System.out.printf("%s 평균 : %.1f\n", stuName[idx], avg);
			idx++; // 학생이름 다음 인덱스로 넘어가게 해주기. 
		}
		System.out.println("============================");
		
		// 2번
		for(int i=0; i<subName.length; i++) {
			int sum = 0;
			for(int j=0; j<stuName.length; j++) {
				sum += score[j][i];
			}
			double subavg = (double)sum / stuName.length;
			System.out.printf("%s 평균 : %.1f\n", subName[i], subavg);
		}
		System.out.println("============================");
		
		//3번
		//1번에서 구해준 것 토대로 
		double classAvg = totalavg / stuName.length;
		//QQQQQQQQQQQQQQQQQQ근데 for문 밖에서 선언한거
		System.out.printf("우리반 평균: %.1f점\n", classAvg);
	}

}











