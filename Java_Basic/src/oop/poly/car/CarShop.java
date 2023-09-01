package oop.poly.car;

public class CarShop {
	
	/*
    - 키워드 instanceof는 객체가 지정한 클래스 타입을 가질 수 있는
     객체인지를 검사할 때 사용하는 연산자 입니다.
     
    - instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수
     있는 지를 물어봐서 그렇다면 true, 그렇지 않다면 false를 도출합니다.
    */
	
	public void carPrice(Car c) {
		//모든 차 종류가 들어올수있지만 무엇이 매개변수로 전달되는지를 모름 -> instanceof 사용
		if(c instanceof Sonata) {
			//Sonata타입을 가질 수 있니? 라는 의미임.
			//c가 Sonata객체냐? 가 아님. 타입을 물어보는 키워드임.
			System.out.println("소나타의 가격은 3000만원 입니다.");
		}else if(c instanceof Tesla) {
			System.out.println("테슬라의 가격은 7000만원 입니다.");
		}else if(c instanceof Porshe) {
			System.out.println("포르쉐의 가격은 2억 4천만원 입니다.");
		}
	}

}
