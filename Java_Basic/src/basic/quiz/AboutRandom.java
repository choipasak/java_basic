package basic.quiz;

public class AboutRandom {

	public static void main(String[] args) {
		
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
        
        3. +, -기호가 랜덤으로 출력되며 그에 따라 결과도 -값이 나올수 있게 하세요
       */
		
		// 사용자로부터 문제의 답을 받을 수 있게 하기
		Scanner sc = new Scanner(System.in);
		System.out.println("~ 문제 풀이 ~");
		
		
		while(true) {
			
			int num1 = (int) ((Math.random()*100)+1);
			int num2 = (int) ((Math.random()*100)+1);
		}
		
		
		
		
	}

}
