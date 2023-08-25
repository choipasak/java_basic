package selfPractice.whileloop;

import java.util.Scanner;

public class SpendAll10000 {

	public static void main(String[] args) {

		//문제.10000원 모두 쓰기
		// 사용할 금액을 입력 받아서 10000원에서 공제
		// 현재 10000원 있습니다.
		// 결제금액 >>> 5000원
		// 현재 5000원 있습니다.
		// 결제 금액 >>>10000원 5000원이 부족하니다.
		// 다 쓰면 현재 0원 있씁니다. 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int money = 10000;
			int use = sc.nextInt();
			System.out.printf("현재 %d원 있습니다.", money);
			
			if(money > use) {
				int change = money-use;
				System.out.println("결제금액");
				System.out.println(change);
			}
		}
	}

}
