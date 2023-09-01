package oop.final_.field;

public class Person {

	//final 변수는 불변의 값을 의미합니다.
	//그렇기 때문에 반드시 초기화가 필요합니다.
	//초기화는 직접 하는 방법과, 생성자를 이용하는 방법이 있습니다.

	//final 변수 초기화 방법
	final String nation = "대한민국";//방법1
	final String name;
	int age;
	
	//final변수를 생성자로 초기화 하면 기본생성자를 만들지 못함.

	public Person(String name) {//방법2
		this.name = name;
	}

}
