package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "콘", "어피치", "춘식이"};
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));

		/*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

		 2. 입력받은 이름이 없다면 없다고 해주세요.

		 -추가
		 배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
		 더 이상 지울 친구가 없다면 프로그램 종료.
		 */

		/*
		if(name.length() >= 2) {
			System.out.println("입력받은 이름이 없습니다.");
		}else {
			for(int i=0; i<kakao.length-1; i++) {
				kakao[i] = kakao[i+1];
			}
//			System.out.print(Arrays.toString(kakao));

			String[] temp = new String[kakao.length-1];

			for(int j=0; j<temp.length; j++) {
				temp[j] = kakao[j];
			}
			System.out.println(Arrays.toString(temp));
			//String[] newka = new String[kakao.length];
		}
		 */


		while(true) {
			
			if(kakao.length == 0) {
				System.out.println("더 이상 삭제할 친구가 없어용!");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.println("삭제를 원하는 친구를 입력하세요 : ");
			String name = sc.next();
			
			boolean flag = false;
			
			for(int i=0; i<kakao.length; i++) {
				if(name.equals(kakao[i])) {//이게 이름 잘 썼는지 확인용 for문
					flag = true; //flag가 true가 되면 break..?
					for(int j=i; j<kakao.length-1; j++) {//j=i는 선택한 이름의 index를 말함
						kakao[j] = kakao[j+1];// 그리고 선택된 이름 이후부터 땡겨주기시작
					}
					break;
				}
			}
			
			if(!flag) { //flag == false???그니까 true로 안걸리고 내려왔냐
				System.out.println(name + "은(는) 없는 이름입니다.");
			}else { // 땡긴 배열 새로운 배열에 일단 담아서 뒤에 중복된 부분 잘라버리기
				String[] temp = new String[kakao.length-1];
				for(int k=0; k<temp.length; k++) {
					temp[k] = kakao[k];
				}
				kakao = temp; // temp를 kakao에 덮어씀
				temp = null; //temp지움
				
				System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
			}
			
		}
		
		sc.close();

	}

}
