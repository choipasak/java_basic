package oop.modi.member.pac1;

public class B {
	
//	public int x;
//	int y; //default
//	private int z;

	public B() {
		
		A a = new A();
		a.x = 1;
		a.y = 2;
//		a.z = 3; (X) : private이라 클래스가 바껴서 안됨.
		
		a.method1();
		a.method2();
//		a.x (); (X) : 다른 클래스여서 접근제한.
	}
	
}
