package oop.modi.constructor.pac1;

public class A {
	
	A a1 = new A(true);
	A a2 = new A(50);
	A a3 = new A(3.14); //같은클래스 같은패키지 모두호출 문제없음
	

	
	//생성자 선언
	public A(boolean b){}
	A(int i){} //default
	private A(double d){}
}
