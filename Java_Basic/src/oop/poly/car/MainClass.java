package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();

		Porshe p1 = new Porshe();
		Porshe p2 = new Porshe();
		Porshe p3 = new Porshe();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		Sonata[] sonatas = {s1, s2, s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		//다형성을 적용해서 이종모음 배열을 선언할 수 있다.(전제조건 : 상속)
		Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
		// 상위타입 = 하위타입들 이여서 자동 형변환 시켜준다.
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("=======================");
		
		//참조변수의 다형성발생
		System.out.println("*** 타이어 교체 작업! ***");
		t1.frontLeft = new NTire();
		t1.frontRight = new NTire();
		t1.rearLeft = new NTire();
		t1.rearRight = new NTire();
		
		System.out.println("=======================");
		
		//매개변수의 다형성발생
		Driver kim = new Driver();
		kim.drive(s1);
		kim.drive(p2); //drive()의 매개변수가 소나타여서 p1이 매개변수로 들어가지X
		kim.drive(t3);
		
		System.out.println("=======================");
		
		Car c = kim.buyCar("소나타"); // 달린다는 말 출력을위해 객체생성
		c.run();//달린다 메서드
		
	}

}










