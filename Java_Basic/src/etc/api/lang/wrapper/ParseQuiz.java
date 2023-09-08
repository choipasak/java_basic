package etc.api.lang.wrapper;

import java.time.LocalDate;
import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		/*
		주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.

		ex) 입력값: 920113-1234567
		출력값: 1992년 10월 13일 31세 남자 

		입력값: 040906-4123456
		출력값: 2004년 9월 6일 19세 여자 

		입력값은 하이픈이 포함된 문자열이어야 합니다. 
		하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
		또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);
		String nums;
		try {
			while(true) {//입력값이 올바른가! 내용만 
				System.out.println("주민등록번호를 입력해주세요! (-포함)");
				System.out.print("> ");
				nums = sc.next();
				nums.replace("-", "");
				//Q. replace의 기능 : 보여주기형식
				char checknum = nums.charAt(6);
				if(nums.trim().length() != 14) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("다시 입력해주세요.");
					continue;
				}else {
					//여기서 문제@@@@@@@@@@
//					int fnum = Integer.valueOf(nums.replace("-", "")).intValue();
//					if(nums.toString().matches())
//					System.out.println(fnum);
					
					//if()
					//System.out.println(a);

					if(nums.charAt(6) != 1 || nums.charAt(6) != 2 || nums.charAt(6) != 3 || nums.charAt(6) != 4) {
						System.out.println("다시 입력하십시오.");
						continue;
					}else {
						int year = LocalDate.now().getYear();
						switch(checknum) {
						case 1:
							System.out.printf("19%d%d년 %d%d월 %d%d일 %d세 남자"
									,nums.charAt(0), nums.charAt(1), nums.charAt(2), nums.charAt(3)
									,nums.charAt(4),nums.charAt(5), year-19);
							break;
						}

					}
				}
			}//while 끝

		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}

	}
}
