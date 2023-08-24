package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
         
        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
       */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받은 수 -> ");
		int num = sc.nextInt();
		int count = 0;
		
		System.out.print("소수 : ");
		for(int i=1; i<=num; i++) {
			int cnt = 0;// 소수의 개수를 기억해 줄 변수.
			// 밖에 선언하면 cnt가 기억을 하게 되서 안된다.
			for(int j=1; j<=i; j++) {
				if(i % j == 0) cnt++; //이건 i의 약수의 개수를 구하는거라고 했다.
					
			}
			if(cnt == 2) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n소수의 개수 : " + count + "개");
		
		sc.close();
	}

}
