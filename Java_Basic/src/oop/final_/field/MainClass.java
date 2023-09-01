package oop.final_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
//		kim.nation = "미국"; //nation은 final 이여서 불가
//		kim.name = "김마이클"; name도 final이여서 불가
		kim.age = 30;
		
		Person park = new Person("박영희");
//		park.nation = "영국"; 당연히 안됌
//		park.name = "박영국"; 당연히 안됌
		
	}

}
