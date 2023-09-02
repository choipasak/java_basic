package selfPractice.javavible.ch3;

import java.util.Scanner;

public class p01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요> ");
		int age = sc.nextInt();
		System.out.println();
		if(age >= 30) {
			System.out.println("30대입니다.");
		}else if(age >= 20) {
			System.out.println("20대입니다.");
		}else {
			System.out.println("10대입니다.");
		}
		
	}

}
