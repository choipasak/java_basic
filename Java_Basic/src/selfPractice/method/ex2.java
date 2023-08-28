package selfPractice.method;

public class ex2 {

	static double[] calcArrayTotal(int[] num){
		int sum = 0;
		for(int n : num) {
			sum += n;
		}
		double avg = sum/(double)num.length;
		return new double[] {sum, avg};
	}
	
	public static void main(String[] args) {
		
		/*
        1. 메서드 이름은 calcArrayTotal로 정의하겠습니다.
        2. 이 메서드는 정수 배열을 하나 전달받아서 해당 배열 내부에 있는
        모든 정수의 합계(int)와 평균(double)을 '배열'에 담아서
        리턴하는 메서드입니다.
        3. 2번에 정의한 조건대로 메서드를 선언하시고, 실제로 main에서 호출해서
        합계와 평균(소수점 둘째 자리까지)을 출력해 주세요.
        {57, 89, 78, 91, 93, 47}
        */
		
		int[] in = {57, 89, 78, 91, 93, 47};
		double[] res = calcArrayTotal(in);
		System.out.printf("%.0f, %.2f", res[0], res[1]);
		

	}

}
