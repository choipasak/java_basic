package selfPractice.string;

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
		System.out.println("주민등록번호 13자리를 입력해주세요 (- 포함)");
		System.out.print("> ");
		out : while(true) {
			String num = sc.nextLine();
			num = num.replace("-", "");
			if(num.length() != 13) {
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
			}else {
				switch(num.charAt(6)) {
				case '1': case '3':
					System.out.println("| 남자 | 등록되었습니다.");
					break out;
					
				case '2': case '4':
					System.out.println("| 여자 | 등록되었습니다.");
					break out;
				}
			}
		}
	}
}
