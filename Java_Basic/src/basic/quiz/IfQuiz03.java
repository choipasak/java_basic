package basic.quiz;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		/*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		int num1 = sc1.nextInt();

		System.out.println("정수를 한번 더 입력하시오 : ");
		int num2 = sc1.nextInt();
		
		System.out.println("정수를 한번 더 입력하시오 : ");
		int num3 = sc1.nextInt();
		
		int max = 0, mid = 0, min = 0;
		
		/*
		 맥스값을 어케구하지
		 1. 하나씩 다 비교해본다If로 개구림
		 2. 하나의 조건에 &&로 다 넣는다? 개구림
		 3. 평균값을 기준으로 나눈다 실패
		 4. 
		 */
		
		if(num1 > num2 && num1 > num3) { // num1이 max다!
			max = num1;
			if(num2 > num3) {
				mid = num2;
				min = num3;
			}else {
				mid = num3;
				min = num2;
			}
		}else if(num2 > num1 && num2 > num3) { // num2가 max!
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			}else {
				mid = num3;
				min = num1;
			}
		}else { // num3가 max!
			max = num3;
			if(num2 > num1) {
				mid = num2;
				min = num1;
			}else {
				mid = num1;
				min = num2;
			}
		}
		
		System.out.printf("max : %d, mid : %d, min : %d", max, mid, min);
		
		sc1.close();
	}

}
