package basic.operator;

public class LogicalOperator {

	public static void main(String[] args) {

		// 비교(관계) 연산자 (<, <=, >, >=, ==, !=)
		// 좌항과 우항의 크기를 비교하여,
		// 결과값으로 항상 논리형 타입의 값을 도출합니다.
		
		int x = 10, y = 20;
		System.out.println(x != y);
		
		/*
		 # 논리 연산자 (&, &&, |, ||)
         - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
         1. &, &&: 양쪽 항의 논리값이 모두 true일 경우에만 true가 도출됩니다.
         2. |, ||: 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다.
         
         &&, || -> 단축 평가 연산 (short circuit operation)
         - 좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우
          우항의 연산을 진행하지 않습니다.
		*/
		
		System.out.println(x > 10 &&(y / 0 == 10));
		// 괄호안의 계산식이 0으로 나눠서 오류나는 식인데 &&때문에 건너뛰짐
		// &&를 &로 바꾸는 순간 에러가 남
		
		System.out.println(x >= 10 ||(y / 0 == 10));
		// 좌항의 값이 true여서 결과는 true
		
		// 논리 반전 연산자 (! : 단항)
		// true -> false, false -> true로 반전
		int z = 10;
		System.out.println(!(z == 10));
		// 
		
	}

}
