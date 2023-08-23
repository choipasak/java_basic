package basic.quiz;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		/*
        1. 정수를 두개 입력받으세요. (x, y)
        2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
        ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"
        
        처음에는 x에 무조건 작은 값이 들어올 것이라고 예상하고 작성하겠습니다.
        다 하신 분은 만약 x에 큰 값이 들어왔을 경우에는
        어떻게 대처할 지 생각해 보세요.
        (x에 큰 값이 들어와도 정상적으로 출력이 되었으면 좋겠습니다.
        입력: 7, 3 -> "3부터 7까지의 누적합계: 25")
        - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
       */
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num1 = sc1.nextInt();
		System.out.println();
		
		
		System.out.print("정수를 한번 더 입력하시오 : ");
		int num2 = sc1.nextInt();
		System.out.println();
		
		/*
		if(num1 < num2) {
			int i = num1;
			int res1 = 0;
			while(i <= num2) {
				res1 = res1 + i++;
			}
			System.out.printf("%d부터 %d까지의 누적합계: %d\n", num1, num2, res1);
			
		}else if (num1 > num2) {
			int j = 0;
			int res2 = num2;
			while(j <= num1) {
				res2 = res2 + j++;
			}
			System.out.printf("%d부터 %d까지의 누적합계: %d", num2, num1, res2);
		}else {
			System.out.println("수를 다시 입력하십시오.");
		}
		*/
		
		
		int i = num1;
		int res1 = 0;
		while (num1 <= num2) {
			res1 += i;
		}
		System.out.println(res1);
		
		sc1.close();
	}

}
