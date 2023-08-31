package oop.poly.car;

public class Driver {
	
	public void drive(Car c) {//차마다 클래스를 만들기 싫어서 매개변수로 부모타입인 Car를 사용
		
		System.out.println("운전을 시작합니다!");
		c.run();
	}

//	public Car buyCar(String name) {
//		System.out.println("테슬라를 구입합니다.");
//		return new Tesla();
	//이러면 return을 소나타를 하고싶을땐 또 다른 메서드를 생성해야만함
	//여기에 다형성 적용. 메서드의 리턴 타입에 다형성을 적용해 모두의 부모인 Car로 지정한다.
	//그러면 상속관계이므로 리턴으로 어떤 종류의 차를 리턴하던지 다 가능하다.
	//만약 리턴타입을 Object라고까지 선언하면 어떤 객체든. 까지 가능
	
	//새로 모든 차 종류에 가능한 메서드 작성
	public Car buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다.");
			return new Sonata();
		}else if(name.equals("포르쉐")) {
			System.out.println("포르쉐를 구입합니다.");
			return new Porshe();
		}else if(name.equals("테슬라")) {
			System.out.println("테슬라를 구입합니다.");
			return new Tesla();
		}else {
			System.out.println("뭐 달라고!");
			return null;
		}
	}// 이렇게 작성해주면 하나의 메서드로 그 상황에 맞는 다른 객체도 리턴할 수 있다.
}
