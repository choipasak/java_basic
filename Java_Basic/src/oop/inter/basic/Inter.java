package oop.inter.basic;

//인터페이스 : 객체의 규격(기능)을 표준화해서 명세하는 역할.
public interface Inter extends ParentInter {
	
	//인터페이스에서 변수를 선언하면 상수(static+final)로 인식
	int num = 5; //식별자가 상수처럼 표현됨
	
	
//	Inter(){} 객체를 생성하지 못한다 => 객체생성불가 
	//인터페이스는 생성자를 가질 수 없습니다(객체화 될 수 없는 개념입니다.)
	
	//인터페이스에서는 메서드를 선언하면 추상 메서드로 지정됩니다.
	void method1(); //추상메서드취급함
	
	//객체를 생성할 수 없으니 필드도 못가지고 메서드(추상처럼 껍데기만)도 생성자도 못가짐
	//그래서 변수가 static인 상수로 선언되는 것.
	//인터페이스는 이 인터페이스를 구현하려는 클래스에서 내용이 만들어짐
	
	public static void staticMethod() {
		System.out.println("가능가능");
	}

}
