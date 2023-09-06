package etc.api.util.random;

import java.util.Random;

public class RandomExample {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		//실수 난수: 0.0 <= ~ < 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수 난수: nextInt();
		//기본범위: int의 전범위
		int i = r.nextInt();
		System.out.println(i);
		
		//0 ~ 5까지의 정수 난수 생성(끝값이 미만으로 인식됨)
		//nextInt()의 괄호 안에 숫자를 주면 숫자 미만으로 범위가 잡힌다.
		int j = r.nextInt(6);
		System.out.println(j);
		
		//10 ~ 100까지의 정수 난수 생성
		int k = r.nextInt(91) + 10;
		System.out.println(k);
		
	}

}
