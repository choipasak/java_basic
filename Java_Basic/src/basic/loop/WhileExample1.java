package basic.loop;

public class WhileExample1 {

	public static void main(String[] args) {

		/*
        # while문의 진행 순서.
        1. 제어변수를 선언함. (시작값이 정해짐)
        2. while문의 조건식을 검사해서 true면 반복문이 시작.
         false라면 반복문 종료.
        3. while문 블록 내부가 한 번 진행되면(끝까지 내려가면)
         다시 조건식을 검사하여 true라면 반복문 계속 진행,
         false라면 반복문 종료.
        4. 반복문 내에는 증감식을 배치해서 제어변수의 값을 조정.
        */
		
		
		int n =1;// 제어변수: 반복문의 횟수를 제어할 변수(begin)
		
		while(n <= 10) { // 논리형 조건식 : 반복문의 끝을 지정(end)
			System.out.println("안녕반갑");
			n++; // 증감식 : 반복문의 종료를 위해 제어변수의 값을 조성(step)
		}
		
		System.out.println("=============================");
		
		// 1~10까지의 누적 합계구하기
		
		int i = 1;
		int total = 0; //누적합계를 담아 줄 변수
		while(i <= 10) {
			total += i++;
		}
		System.out.println("1~10까지의 누적 합계: " + total);
		
	}

}
