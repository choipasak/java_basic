package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		Scanner sc = new Scanner(System.in);
		System.out.println("문제를 풀어보세요!");
		System.out.println("0을 입력하시면 프로그램을 종료합니다.");
		
		int correct = 0;
		int wrong = 0;
		
		
		
		while(true) {
			
			int num1 = (int) (Math.random()*100+1);
			int num2 = (int) (Math.random()*100+1);
			int sym = (int)(Math.random()*2);
			// 0이상 2미만 난수 생성
			//sym으로 0은 -, 1은 +로 지정해서 랜덤으로 나오게 해준다.
			int sCorrect; //정답
			if (sym == 0) { // 부호에 대한 if문
				System.out.printf("%d + %d = ???\n", num1, num2);
				sCorrect = num1 + num2;
			}else {
				System.out.printf("%d - %d = ???\n", num1, num2);
				sCorrect = num1 - num2;
			}
			System.out.print("> ");
			int res = sc.nextInt();
			
				if(res == sCorrect) {
			// 여기서는 위에서 지정해준 sCorrect를 결과값과 동일하다고만 
			// 조건에 걸어주면 더이상의 수정은 없어도 된다!
					System.out.println("\n정답입니다!");
					correct++;
				}else if(res == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;// 여기다가 정답횟수랑 오답횟수 써줘도 됌. 어차피 탈출하니까
				}else {
					System.out.println("틀렸습니다!");
					wrong++;
				}
			}
			System.out.println("================");
			System.out.println("정답 횟수 : " + correct + "회");
			System.out.println("오답 횟수 : " + wrong + "회");
			
			sc.close();
		}
		

	}


