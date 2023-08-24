package basic.loop;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) continue;// 조건:짝수 라는 뜻/ 이러면 홀수는 다 패스
			
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");
	}

}
