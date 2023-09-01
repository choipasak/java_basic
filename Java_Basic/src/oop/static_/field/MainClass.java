package oop.static_.field;

public class MainClass {

	public static void main(String[] args) {

		Count c1 = new Count();

		c1.a += 5;
		c1.b += 5;

		System.out.println("인스턴스 변수인 c1.a: " + c1.a);
		System.out.println("인스턴스 변수인 c1.b: " + c1.b);

		System.out.println("============================");

		Count c2 = new Count();

		c2.a += 7;//객체(인스턴스가 새로 만들어져서 c2의 a는 7이다.)
		c2.b += 7;// 얘는 static이여서 객체로 접근이 아님

		System.out.println("인스턴스 변수인 c2.a: " + c2.a);
		System.out.println("인스턴스 변수인 c2.b: " + c2.b);

		System.out.println("============================");

		Count c3 = new Count();

		c3.a += 8;
		c3.b += 8;

		System.out.println("인스턴스 변수인 c3.a: " + c3.a);
		System.out.println("인스턴스 변수인 c3.b: " + c3.b);


		/*
		 결과
		 	인스턴스 변수인 c1.a: 5
			인스턴스 변수인 c1.b: 5
			============================
			인스턴스 변수인 c2.a: 7
			인스턴스 변수인 c2.b: 12
			============================
			인스턴스 변수인 c3.a: 5
			인스턴스 변수인 c3.b: 20
		 */
		
		//다시 c1.b를 찍어보면
		System.out.println("인스턴스 변수인 c1.b: " + c1.b); //20이 나옴
		System.out.println("인스턴스 변수인 c2.b: " + c2.b); //20이 나옴

		//이렇게 출력되는 이유는 객체마다 생성되는 것이 아니기때문.
		
		/*
		 - static이 붙은 데이터는 그 static 데이터가 선언된
		 클래스의 이름으로 바로 참조할 수 있습니다.
		 - 일반 멤버변수(필드)와 혼동할 가능성이 있기 때문에
		 주소값으로 접근하지 않습니다.
		 - 객체가 생성되지 않아도 접근이 가능하다!
		 */
		
		Count.b++; //정적 변수는 이렇게 선언해야 한다!
		
		System.out.println("정적 변수 Count.b: " + Count.b);
	}

}



















