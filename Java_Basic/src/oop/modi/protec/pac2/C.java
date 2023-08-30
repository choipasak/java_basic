package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A{

	//	A a1 = new A(30); (X) protected 패키지가 다르면 허용X 근데 상속받으면 허용함.
	//	A a2 = new A(5.65); (X) default 얘는 그냥 불가능
	//둘다 허용범위가 똑같은데 protected는 상속받은 경우에는 접근가능하다.

	public C() {

		/*
		 - protected 제한자는 패키지가 다른 경우
		 두 클래스 사이에 상속 관계가 있다면
		 super 키워드를 통해 참조를 허용합니다.
		 */




		super(30);
		//		super(5.64); (X) default
		super.x = 1; //상속받아서 protected여도 허용
		//		super.y = 2; (X)
		super.method1();
		//		super.method2(); //(X)

	}

}
