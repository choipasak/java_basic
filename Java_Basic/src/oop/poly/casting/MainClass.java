package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.n1 = 1;
		//		p.n2 = 2; (X) 자식꺼

		p.method1();
		p.method2();
		//		p.method3(); (X) 자식꺼

		System.out.println("======================");

		Child c = new Child();
		c.n1 = 1; //부모에게 물려받은 속성
		c.n2 = 2; // 자식의 고유 속성

		c.method1();
		c.method2();
		c.method3(); // 여기까지는 다형성을 적용한게X

		System.out.println("======================");

		//다형성 적용(promotion)
		Parent p2 = new Child(); // 부모타입 변수에 자식 개체 추가
		p2.n1 = 1;
//		p2.n2 = 2; (X)

		p2.method1();
		p2.method2();
//		p2.method3(); (X) 부모는 여전히 자식의 요소를 알 수 없음(생성자가 Child인데도)
		//왜냐 : 어떠한 객체를 참조하고 있는가 = 참조변수의 데이터 타입이 무엇인가
		//p2의 데이터 타입은 Parent임. 그래서 실제 객체에 접근했을 때 Parent의 관점으로
		//객체에 접근함. 그래서 자식의 기능 사용불가! 상속받은 기능들은 자식관점으로 출력된다.

		/*
		 - 다형성이 적용되면 자식 클래스의
		 본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.

		 - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
		 ㄴ> 타입을 자식으로 바꿔버린다. 끌어내린다.
		 */
		Child c2 = (Child) p2; //부모 타입을 자식 타입으로 강제 변환(Downcasting)
		/*
		 처음엔 우항에 빨간줄이 그어짐 : 아직 타입을 끌어내리지 않아서 우항이 부모타입으로 더 높기때문
		 형변환처럼 부모->자식 타입변환도 부모타입 앞에(Child) 작성해주면 됌
		 Heap영역에 Child의 새로운 영역이 생긴게 아니라 변수는 새로 stack에 생성되고,
		 p2와 가리키는 주소값이 똑같다. 그니까 사용하는 객체는 1개고!, 접근하는 방법이 2개가 된것임!
		 */
		
		c2.n2 = 2;
		
		c2.method1();
		c2.method2();
		c2.method3();
		System.out.println("p2의 주소값:" + p2);
		System.out.println("c2의 주소값:" + c2);//sop의 결과 똑같은 주소나옴!
		
		Object o = new String("안녕하세용");//실체는 String임. 시각은 Object
		//그럼 String의 모든것을 다 볼수 있냐 -> 없음
		//왜 : Object에는 없는 것들이기때문
		String str = (String) o;
		System.out.println("문자열의 길이> " + str.length());
		
		//다형성이 한번도 발생하지 않은 경우에는
		//강제 형 변환을 사용할 수 없습니다.
		Parent ppp = new Parent();//다형성X
		Child ccc = (Child) ppp;//근데 형변환을 해버림. 문법상의 에러는없음
		//자식의 시각으로 부모에게 접근한다는 문장(Error)
		//자식이 생성될땐 항상 부모의객체도 같이 생성된다했는데 super()
		//부모의 객체만 생성되고 자식객체는 생성이 안되있음. 자식의 대한 정보가 없음.
		
		
	}

}










