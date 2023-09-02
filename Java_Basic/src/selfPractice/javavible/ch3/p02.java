package selfPractice.javavible.ch3;

import java.util.Scanner;

public class p02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어로 아무말을 입력해주세요...");
		args[0] = sc.next();
		int first = args[0].charAt(0);
		if(Character.isUpperCase(first)) {
			System.out.println("대문자 입니다.");
		}else if(Character.isLowerCase(first)) {
			System.out.println("소문자 입니다.");
		}else {
			System.out.println("숫자입니다!");
		}

	}

}
