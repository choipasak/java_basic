package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));

		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));

		System.out.println("=====================");

		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요: ");
		String name = sc.next();

		// 방법 3번
		boolean flag = false;

		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스: " + i + "번");
				flag = true;
				break;
			}/*else {
				flag = true;
				break;
			}*/
		}
		if(!flag) {
			System.out.println(name + "은 없는 음식입니다!");
		}
		
		/*
		 * 방법 1번

		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스: " + i + "번");
				break;
			}else if(i == foods.length-1) {
				System.out.println("없는 음식입니다.");
				
				 * 이렇게 작성한 의미는
				 * i가 3이 됬는데도 if문이 진행이 안된거면
				 * 없는 음식을 입력한게 맞다.
				 * 라고 생각해서 조건이 저렇게 된 것이다!
				 
			}
		}
		
		방법 2번
		
		int i;
		for(i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스: " + i + "번");
				break;
			}
		}
		
		if(i == foods.length){
			System.out.println("없는 음식입니다.");
		}
		
		*/
	}

}
