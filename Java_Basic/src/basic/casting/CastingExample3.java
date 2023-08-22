package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {

		char c = 'B';
		int i = 2;
		
		int intResult = c + i; //i가 66으로 변환
		char charResult = (char) (c + i); 
		
		// 서로 다른 데이터 타입간의 연산은
		// 데이터 크기가 큰 타입으로 맞춰져서 결과로 출력된다.
		// 서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에
		// 작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행됩니다.
		
		System.out.println(intResult);
		System.out.println(charResult);
		
		int k = 10;
		double d = k / 4.0;
		System.out.println(d);
		// 왜 결과가 2.0일까!
		// 먼저 int 자료형으로 나눈 후, double의 변수로 들어가기 때문에
		// 결과는 2.0이 된다!
		// 결과가 2.5가 나오게 하고 싶다면,
		// k 나 4중에 한쪽을 double로 바꾸면 된다.
		// (double)을 붙여주거나, .0을 붙여주거나
		
		// int보다 작은 크기의 데이터 연산은 자동으로 값이
		// int형으로 변환되어 처리됩니다.(데이터 손실의 방지)
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);
		
		
		
		
		
		
	}

}
