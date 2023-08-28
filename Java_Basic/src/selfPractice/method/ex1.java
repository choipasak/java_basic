package selfPractice.method;

public class ex1 {

	// 가변인수 (가변 파라미터)를 사용한 매개변수 작성.
	// 콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 내부로 전달합니다.
	static int calcNumberTotal2(int... nums) {
		int total = 0;
		for(int n: nums) {
			total += n;
		}
		return total;
	}
	
	
	//정수 n개를 전달하면 그 정수들의 총 합을 리턴하는 메서드(= 여러개의 값 전달)
	static int calcNumberTotal(int[] num) {
		int total = 0;
		for(int n : num) {
			total += n;
		}
		return total;
	}

	public static void main(String[] args) {
		
		int res = calcNumberTotal2(1,2,3,4,5,6,7,8,9);
		System.out.println(res);
		
		int[] arr = {1,2,3,4,5};
		int res1 = calcNumberTotal(arr);
		System.out.println(res1);
	}

}
