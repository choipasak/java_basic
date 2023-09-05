package etc.api.lang.math;

public class MathExample {
	
	public static void main(String[] args) {
		
		//올림
		int i = (int) Math.ceil(1.1); //ceil은 return이 double타입이구나~
		System.out.println(i);
		
		//내림
		double d = Math.floor(1.5);
		System.out.println(d);
		
		//반올림
		double d2 = Math.round(3.141592);
		System.out.println(d2);
		//원하는 소수점자리에서 반올림 -> 소수점의 위치를 바꾼다
		double d3 = Math.round(3.141592*1000) * 0.001;
		System.out.println(d3);
		
		//제곱
		double d4 = Math.pow(3.0, 4.0);
		System.out.println(d4);
		
		//최대값
		int max = Math.max(2, 10);// 둘 중 더 큰값을 리턴
		System.out.println(max);
	
		//최소값
		int min = Math.min(2, 10);// 둘 중 더 작은값을 리턴
		System.out.println(min);
		
		
		
		
		
	}
}
