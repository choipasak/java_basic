package selfPractice.random;

import java.util.Scanner;

public class UpdownGame {

	public static void main(String[] args) {
		/*
		 - 난수를 생선한 뒤 사용자 입력은 받아,난수랑 일치하는지 확인한다.
		 일치 여부는 숫자가 큰지/작은지/맞는지로 알려준다.
		 1 ~ 10000 사이 난수를 발생한다. 
		 해당 난수를 맞추는 게임이며 입력 마다 "Up!" "Down!"을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int ran = (int) (Math.random()*100+1);
		while(true)	{
			System.out.println("정답을 맞춰보세요!\n> ");
			int correct = sc.nextInt();
			if (ran == correct) {
				System.out.println("정답입니다!");
				System.out.println("============");
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if (correct == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if (ran > correct) {
				System.out.println("Up!");
				continue;
			}else if (ran < correct) {
				System.out.println("Down!");
				continue;
			}
		}
		
		
		
		
		
	}

}
