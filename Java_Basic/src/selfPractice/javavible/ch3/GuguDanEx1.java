package selfPractice.javavible.ch3;

import java.util.Scanner;

public class GuguDanEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인수 입력 : ");
		int dan = sc.nextInt();
		System.out.println();
		System.out.println(dan + "단");
		System.out.println("=====================");
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		

	}

}
