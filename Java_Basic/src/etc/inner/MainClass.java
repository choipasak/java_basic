package etc.inner;

public class MainClass {

	//내부 클래스(inner class)
	//해당 객체와 밀접한 연관이 있는 경우 클래스 내에서 클래스를 선언.
	//이 main에서만 사용 가능하다.
	//그래서 대부분 private로 선언함 근데 원래 class에는 pirvate을 붙이지 못하잖아.
	//근데 내부클래스 한정으로 private선언을 할 수 있음
	//그리고 이 공간에서만 사용할 수 있게 private static으로 선언해준다.
	//정리
	//일반적인 class를 정의할 때는 private을 사용할 수 없지만
	//클래스 내에 클래스를 선언하는 경우에는 private 선언이 가능.
	//static -> 메모리 효율을 높이기 위해 선언. (바깥쪽 클래스 호출 시마다 재생성하는 것을 방지)
	private static class SubCalculator implements Calculator{
		//SubCalculator라는 클래스 파일은 없음. 내부 클래스이기 때문에
		@Override
		public int operate(int n1, int n2) {
			return n1 - n2;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		// 덧셈 계산을 하는 계산기를 만들어 쓰고 싶다.
		Calculator addCal = new AddCalculator();
		//다형성을 적용해 Calculator 인터페이스를 
		System.out.println(addCal.operate(30, 50));
		
		//뺄셈 계산을 하는 계산기가 필요.
		Calculator sub1 = new SubCalculator();
		System.out.println(sub1.operate(100, 40));
		//내부클래스의 static은 원래 알던 static과 다른 방식으로 움직인다.클래스를 호출해서 사용하지 못함.
		
		//곱셈 계산을 하는 계산기가 필요.(익명 클래스. 이름이 없는 클래스임)
		//말 그대로 이름이 없는 클래스를 즉석에서 선언.
		//선언한 클래스 내에서는 주소값을 통해 객체를 사용할 수 있지만
		//외부에서는 지목할 방법이 없기 때문에 객체 사용이 불가능.
		Calculator mulitCal = new Calculator() {
			
			@Override
			public int operate(int n1, int n2) {
				//이름이 없는 익명 클래스 생성
				//즉석에서 빠르게 선언해서 쓰고 끝냄
				//mulitCal의 변수로만 한번 사용하고 끝나는 메서드임
				return n1 * n2;
			}
		};
		
		System.out.println(mulitCal.operate(5, 7));
		
		// 나눗셈을 하는 계산기 (람다) -> 인터페이스의 추상메서드가 딱 1개일 경우에만 가능.
		// 어차피 인터페이스에 추상메서드가 1개이기 때문에 이름을 따로 명시하지 않음.
		// 메서드 내부 로직이 단 한 줄이라면 괄호{} 생략이 가능 -> return 값으로 취급.
		Calculator divCal = (n1, n2) -> n1 / n2;
		//원래라면 익명함수를 선언해서 오버라이딩한 다음에 사용했어야 했던 것을 한줄로 표현가능!
		//추상메서드가 1개여서 가능한 일
		System.out.println(divCal.operate(25, 5));
		
		Pet dog = new Pet() {
			
			@Override
			public void play() {
				System.out.println("강아지는 마당에서 놀아요");
			}
			
			@Override
			public void eat() {
				System.out.println("강아지는 사료를 먹어요");
			}
		};
		
		dog.play();
		dog.eat();//이렇게 객체를 바로 반납해줘야함.
		
		//진짜로 한번쓰고 버리는 거(극적인 예시)
		System.out.println(new Calculator() {
			
			@Override
			public int operate(int n1, int n2) {
				return n1 % n2;
			}
		}.operate(10, 3));
		//진짜 한번 출력하고 버리는 거임.
		
	}

}













