package oop.poly.car;

public class Car {
	
	Tire frontLeft;//객체의 주소값이 변수에 들어간다.
	Tire frontRight;//객체타입의 필드도 선언 가능하다.
	Tire rearLeft;
	Tire rearRight;
	
	void run() {
		System.out.println("자동차가 달립니다!");
	}

}
