package basic.begin;

public class PrintExample {

	public static void main(String[] args) {

		/*
		 자바의 표준 출력 형식은 크게 3가지 입니다.
		 1. 개행을 포함하지 않는 print()
		 2. 자동으로 개행을 포함해 주는 println()
		 개행 : 줄바꿈
		*/
		
		System.out.print("안녕뵤");
		System.out.println("Hello");
		System.out.print("바이바이");
		System.out.println("No!");
		
		/*
		 3. 형식 지정 표준 출력 함수 printf()
		 서식 문자를 이용해서 문자열을 완성시킨 후
		 서식 문자에 들어갈 값을 지정해서 출력하는 방식
		 
		 # 포맷팅 서식 문자 종류
         %d: 부호가 있는 정수 데이터 (decimal)
         %f: 실수 데이터 (floation point)
         ㄴ %.nf : n에 원하는 소수점 아래 자릿수를 적어준다.
         %s: 문자열 (String)
         만약, 문자로 %를 사용하고 싶다면 %%로 쓰면 된다!
         
         # 탈출 코드 (escape code) -> printf에만 동작하는 게 아니에요.
         - 반드시 따옴표 내에 위치해야 합니다
         - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호입니다.
         \n: 줄 개행 명령, 반복 가능!
         \t: 가로 공백 (스페이스 4칸)탭처럼
		 
		 변수에 있는 값 '그대로' 출력하고 싶을때 유용
		 */
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		// 12월 25일은 크리스마스입니다. 를 출력해보자
		// println이면 변수명 다 써줘야하고 길어짐
		// 그래서 편하게 printf()를 사용함
		System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
		
		System.out.println("메롱\t메롱ㄹ");
		
		//실수를 표현하는 서식문자 %f -> 기본 6자리까지 표현.
        //%.[자리수를 지정하는 숫자]f -> 원하는 자리수까지 표현.
        //%라는 문자 자체를 표현할 때는 %% 쓰시면 됩니다.
		double rate = 64.126;
		System.out.printf("합격률 : %.3f%%입니다.\n", rate);
		
		
		
		
		
		
		
		
		
		
	}

}
