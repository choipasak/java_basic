package oop.static_.method;

public class Count {
	
	public int a;// 인스턴스 변수
	public static int b; //정적 변수
	
	/*
    # 인스턴스 메서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
     인스턴스 메서드 안에서는 정적(static) 변수와
     인스턴스 변수 모두를 참조할 수 있습니다.
    */
	
	public int method1() {//메서드를 객체로 작성
		return this.a + Count.b;
	}
	
	
	/*
    - static블록(메서드, 정적 초기화자) 내부에서는
     static이 붙은 변수나 메서드만 사용할 수 있습니다.
     this는 사용할 수 없습니다. -> 나타낼 주소값이 없기 때문 -> 객체 생성 없이도 호출되기 때문.
     
    - static 블록 내부에서 non-static멤버를 사용하려면
     반드시 객체를 생성해서 주소값을 통해 참조해야 합니다.
    */
	
	
	public static int method2() {//메서드를 static으로 작성
		Count ccc = new Count();// a를 초기화 하기 위해 객체생성
		return ccc.a + Count.b; // this.a : static에서는 this를 쓸 수 없다고 뜸!
		//왜: 메서드가 static임->생성한 객체가 없음->this의 객체의 주소값이 없음.
		
	}

}









