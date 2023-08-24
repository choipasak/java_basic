package basic.loop;

import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {
		
		/*
        # 무한 루프
        
        - 무한 루프는 반복 횟수를 정하지 않고 무한하게 반복문을
         실행하는 구조입니다.
         
        - 처음 반복문을 구성할 때, 개발자가 사전에 정확한 반복 횟수를
         파악할 수 없다면, 무한루프를 일단 구성해 두고
         특정 조건을 통해 종료할 수 있도록 코드를 설계합니다.
         
        - 일반적으로 정확한 반복 횟수를 알고 있다면 for문을 사용하고,
         정확한 반복 횟수를 모른다면 while을 통한 무한 루프를 형성하여
         사용합니다. while(true), for(;;)
        */
		
		int i = 1;
		while(true) {
			if(i > 10)break;
			
			System.out.println("ㅇ안녕하세용"+i);
			i++;
		}
		
		System.out.println("========================");
		
		//입력받는 행위를 할거고, 몇번만에 받을지는 모르는 상황!
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("15 x 6 = ?");
			System.out.print("> ");
			System.out.println("\n\n! 정답을 모르시면 0을 입력하면 종료됩니다.");
			int answer = sc.nextInt();
			
			if(answer == 90) {
				System.out.println("정답입니다!");
				break; // 반드시 포함!!!@
			}else if(answer == 0) {
				System.out.println("정답은 90이였습니다!");
				break;
			}else {
				System.out.println("틀!틀!틀!틀!틀!틀!틀!틀!틀!");
			}
			
			
		}
		sc.close();
		
		
		
		
		

	}

}
