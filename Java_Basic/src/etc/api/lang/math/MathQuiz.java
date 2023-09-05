package etc.api.lang.math;

public class MathQuiz {
	
	/*
	int num;
	
	public static int page(int num) {
		if(num <= 30 && num >20) {
			return 3;
		}else if(num > 10) {
			return 2;
		}else if(num > 0) {
			return 1;
		}
		return 0;
	}
	*/
	
	//선생님버전
	public static int page(int num) {
		return (int) Math.ceil(num / 10.0);
	}
	
	public static void main(String[] args) {
		
		/*
        1 ~ 10이 전달되면 1이 반환되고,
        11 ~ 20이 전달되면 2가 반환되고,
        21 ~ 30이 전달되면 3이 반환되고.......
        이러한 로직을 수행하는 static 메서드 page를 선언해 보세요.
        */
		System.out.println(page(654));
		
	}

}
