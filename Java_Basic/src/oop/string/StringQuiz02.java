package oop.string;

import java.util.Scanner;

public class StringQuiz02 {
	
	public static void main(String[] args) {
		/*
        1. 주민등록번호 13자리를 입력받습니다.
        2. 주민등록번호는 -을 포함해서 받을 예정입니다.
        3. 13자리가 아니라면 다시 입력받습니다.
        4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
        */
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("주민등록번호 13자리를 입력해주세요(- 포함)\n> ");
		while(true) {
			String nums = sc.next();
			out : if(nums.trim().replace(" ", "").length() != 14) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break out;
			}else {
				switch(nums.indexOf(8)) { //charAt을 썻어야지ㅠ
				case 1: case 3: //당연이 값도 charAt에 맞춰야함,,
					System.out.println("남자로 등록되었습니다.");
					break;
					
				case 2: case 4:
					System.out.println("여자로 등록되었습니다.");
					break;
				}
			}
			break;
		}
		*/
		
		outer: while(true) {
			System.out.println("주민등록번호 13자리를 입력하세요.");
			System.out.println("-을 포함해서 입력하세요.");
			System.out.print("> ");
			String ssn = sc.next();
			
			ssn = ssn.replace("-", "");
			
			if(ssn.length() != 13) {
				System.out.println("주민등록번호는 13자리 입니다.");
			} else {
				switch(ssn.charAt(6)) {
				case '1': case '3':
					System.out.println("남자입니다.");
					break outer;
				
				case '2': case '4':
					System.out.println("여자입니다.");
					break outer;
					
				default:
					System.out.println("잘못 입력했습니다.");
				}
			}
			
		}
		
		sc.close();
	}
}
