package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		/*
		주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.

		ex) 입력값: 9201013-1234567
		출력값: 1992년 10월 13일 31세 남자 

		입력값: 040906-4123456
		출력값: 2004년 9월 6일 19세 여자 

		입력값은 하이픈이 포함된 문자열이어야 합니다. 
		하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
		또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요! (- 포함)");
		while(true) {
			System.out.print("입력값: ");
			String nums = sc.nextLine();
			nums.replace("-", "");
			if(!(nums.trim().replace(" ", "").length() == 13 || Integer.parseInt(nums.toString())) {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}else {
//			int fnum = Integer.parseInt(nums);
				if(nums.charAt(6) != 1 || nums.charAt(6) != 2 || nums.charAt(6) != 3 || nums.charAt(6) != 4) {
					System.out.println("다시 입력하십시오.");
					break;
				}
			}
			
		}//while 끝
	}

}
