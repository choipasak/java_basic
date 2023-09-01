package oop.static_.singleton;

public class Singleton {
	
	/*
	 # 싱글톤 디자인 패턴: 클래스의 객체를 단 1개로 제한하기 위한 코드 디자인 패턴.
	 
	 1. 외부에서 이 클래스의 객체를 생성하지 못하게 생성자를 단 1개만 선언하고,
	 private 접근 제한을 붙임.
	 */
	
	private Singleton() {
		System.out.println("객체가 생성됨!");
	}
	
	//2. 생성자를 호출할 수 있는 영역은 같은 클래스 내부 뿐이므로
	//자신의 클래스 내부에서 스스로의 객체를 단 1개만 생성함.
	private static Singleton s = new Singleton();// 같은 클래스여서 생성 가능해짐
	
	//3. 외부에서 이 클래스의 객체를 요구할 시, 2번에서 미리 만들어 놓은
	//단 하나의 객체의 주소값을 공개된 메서드를 통해 리턴합니다.
	public static Singleton getInstance() {// 싱글톤타입 메서드는 getInstance()라고 짓는게 관례
		return s; 
		// static메서드여서 객체의 값이 리턴이 안됨.->객체생성선언 자체를 static으로 바꿔준다.
		//어 근데 그러면 누구나 다시 객체에 바로 접근이 가능하잖아
		//이러면 다른값이 들어갈 수도 있으니까 접근제어를 private으로 선언.
		
	}
	
	//이게 다 객체를 하나만 생성하게 하기위한 패턴. 싱글톤 디자인 패턴.

	
	
	/////////////////////////////////

	public void method1() {
		System.out.println("여러 군데에서 쓰이는 중요한 메서드");
	}
	
	public void method2() {
		System.out.println("프로그램 내에서 꼭 한번 불러야 하는 귀한 메서드");
	}

}
