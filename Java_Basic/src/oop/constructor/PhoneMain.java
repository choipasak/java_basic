package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone(); //이게 생성자 호출문! 뒤의 Phone()이 생성자임.
		basic.showSpec();
		
		Phone basic2 = new Phone();
		basic2.showSpec();
		
		System.out.println("===========================");
		
		Phone galaxy = new Phone("갤럭시 s23");
		galaxy.showSpec();
		
		Phone iPhone14 = new Phone("아이폰14", "스페이스 그레이");
		iPhone14.showSpec();
	}

}
