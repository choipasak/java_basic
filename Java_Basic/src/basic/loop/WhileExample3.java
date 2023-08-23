package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {

		
		/*
		 * 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		 * 인지를 판별하시면 됩니다!
		 * 그럼 약수가 2개인것을 출력!
		 * 1. 반복문 돌릴 변수 선언
		 * 2. 약수의 개수 담은 변수 선언
		 * 3. 입력한 정수까지의 i
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 정수를 입력해주세요 :");
		int num = sc.nextInt();
		
		int i = 1; // begin : 소수의 판별을 위해서 입력받은 정수 num을 지속적으로 나누어 볼 변수.
		int count = 0; // 나누어 떨어진 횟수를 기억할 변수
		
		while(i <= num) {
			if(num%i==0 ) {
				count++;
			}
			i++;
		}
		if(count == 2) {
			System.out.println(num + "은(는) 소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		System.out.println("========================");
		
		//소수판별 다른 방법
		int j = 2; //begin
		while(num%j != 0) {// end
			j++;// step
		}
		
		System.out.printf("%d은(는) %s.\n", num, (num == j? "소수입니다":"소수가 아닙니다"));
			
		
		
		
		
		
		sc.close();
	}

}
