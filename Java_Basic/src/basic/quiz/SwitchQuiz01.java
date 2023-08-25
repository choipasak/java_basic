package basic.quiz;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

		/*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
		 */

		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num1 = sc1.nextInt();

		System.out.print("[ + , - , * , / ] 중에서 하나를 입력하시오");
		String opsymbol = sc1.next();

		System.out.print("정수를 한번 더 입력하시오 : ");
		int num2 = sc1.nextInt();

		int res = 0;

		boolean flag = false; // 나눗셈에서 num2값이 0을 받을 경우에
							 // 연산되지 않게하기 위해 만든 스위치

		switch(opsymbol) {

		case "+":
			res = num1 + num2;
			break;

		case "-":
			res = num1 - num2;
			break;

		case "*":
			res = num1 * num2;
			break;

		case "/":
			if (num2 == 0) { //만약 num2를 0을 받았을 경우
				System.out.println("연산을 할 수 없는 입력값 입니다.");
				flag = true; //맨 밑에 있는 sop를 출력되지 않게 하기위해 false값 할당.
				//원래는 연산안된다고 출력되고도 맨 밑의 계산식이 출력 됬었음.
				break;
			}

		default:
			System.out.println("기호를 제대로 입력해 주세요.");
		}
		
		if(!flag) { // 이제 여기는 flag값이 false인게 오면 출력되지 않는다.
			System.out.printf("%d %s %d = %d\n", num1, opsymbol, num2, res);
		}

		sc1.close();

	}

}
