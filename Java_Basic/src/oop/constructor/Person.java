package oop.constructor;

public class Person {

	
	String name;
	int age;
	int height;
	
	Person(){} //다른생성자가 있어도 이렇게 기본생성자를 하나 만들어 주는 편이 좋다!
	// 생성해주는 이유 : 모든 입력값을 아래의 생성자처럼 3개를 받진 않으니까!
	
	Person(String uname, int uage, int uheight) {
		
		name = uname;
		age = uage;
		height = uheight;
		
	}
	
	void info(){
		System.out.println("*** 정보 ***");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height + "cm");
		System.out.println("***********");
	}

}
