package basic.array;

import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {
		
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.
        
        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.
         
        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)
        
         추가 문제 
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
        입력값 = 배열안의 어떤인덱스의 값
       */
		
		String[] foods = new String[50];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("먹고 싶은 음식을 입력하세요.\n'배불러'를 입력하시면 종료됩니다!");
		
		outer:
		for(int i=0; i<foods.length; i++) {
			System.out.print(">");
			String names = sc.next();
			
			if(names.equals("배불러")) {
				System.out.println("종료합니다.");
				break;
			}
			
			//쓴게 배불러가 아닌경우, 인덱스도 필요없고 중복값만 체크하면 되니까
			// forEach문 사용한다
			for (String f : foods) {
				//여기에 f는 null일때 break를 넣어줘도 된다
				if(names.equals(f)) {
					System.out.println("이미 존재하는 음식입니다.");
					i--; //이거 안해주면 i회차 하나 날림
					continue outer;//continue 하면 for문의 증감식으로감
				}
			}
			
			foods[i] = names;
		}
		
		System.out.println("================");
		
		for(String n : foods) {
			if(n == null) {
				break;
			}
			System.out.print(n + " ");
		}
		
		sc.close();
	}

}
