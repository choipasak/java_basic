package oop.modi.constructor.pac1;

public class B {

	A a1 = new A(true); // public
	A a2 = new A(50); // default : 같은 패키지여서 접근 허용
//	A a3 = new A(5.56); // (X) : private, 다른 클래스여서 불가능
	
}
