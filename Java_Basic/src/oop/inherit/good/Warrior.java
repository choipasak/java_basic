package oop.inherit.good;

/*
# 자식 클래스, 하위 클래스 (Child, Sub class)

- 부모 클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를
 자식 클래스라고 합니다.

- 상속을 적용시키려면 자식 클래스 선언부의 클래스 이름 뒤에
 키워드 extends를 쓰고, 물려받을 부모 클래스의 이름을 적으시면 됩니다.

 */


public class Warrior extends Player { //Player를 상속한다는 표기

	int rage;

	/*
    # 메서드 오버라이딩(재정의)
    - 부모가 물려주는 메서드는 모든 자식들에게 다 맞게 설계되기 힘들기 때문에
     부족한 점이 있거나, 아예 맞지 않는 경우에는 자식 클래스 쪽에서
     내용을 추가하거나 수정할 수 있습니다. 이를 오버라이딩 이라고 합니다.

    - 만약 자식 클래스에서 부모가 물려준 메서드를 새롭게 재 정의한다면
     자식이 수정한 메서드가 우선적으로 호출됩니다.

    - 오버라이딩의 규칙이 있습니다. (3가지 모두 일치해야 오버라이딩 인정)
    1. 부모가 물려주는 메서드와 이름이 똑같을 것!
    2. 부모가 물려주는 메서드와 리턴 타입이 똑같을 것!
    3. 부모가 물려주는 메서드와 매개변수의 선언 방식이 똑같을 것!
	 */

	// 또 다른 방법 호출할 출력함수명 ctrl shift 하면 자동완성해줌
	@Override // <- (Annotation) : 간단한 기능을 가진 일종의 주석임. 오버라이딩의 문법체크를 해줌.
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
	}

	/*
	//이클립스의 쉽게 오버라이딩 해주는 단축키 alt shift s 하고 overriding 선택
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();

		//rage해당 출력만 작성해주면 된다!
		System.out.println("분노: " + rage);
	}
	 */

	/*
	 //정석의 방법
	void characterInfo() {
		super.characterInfo();
		//부모클래스(super class)의 함수를 호출!(이걸 깔고 가겠다는 소리)

		//Overriding: 메서드 재정의 후 사용, 오버라이딩된 내용을 우선 출력
		System.out.println("# 분노: " + rage);
		//오버라이딩 된 characterInfo()여서 메인에서 출력하면 위의 한줄만 출력된다.
	}
	 */






}
