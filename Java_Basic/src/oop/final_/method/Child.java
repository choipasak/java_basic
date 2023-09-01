package oop.final_.method;

public class Child extends Parent{ //Parent 클래스가 final이 되버려서 상속불가

	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}
	
//	@Override
//	void method3() {
//		System.out.println("안대");
//	} (X) -> final 메서드는 오버라이딩을 막습니다. (물려주는 대로 써라~)

}
