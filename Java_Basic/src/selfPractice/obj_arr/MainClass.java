package selfPractice.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//객체를 배열에 담는 연습!
		
		/*
		Person kim = new Person("김철수", 32, "남자");
		Person lee = new Person("이영희", 25, "여자");
		Person park = new Person("박뽀삐", 50, "남자");
		
		kim.personInfo();
		lee.personInfo();
		park.personInfo();
		*/
		
		//Person객체를 넣을거니까 Person 배열
//		Person[] people = new Person[3];
//		people[0] = new Person("김철수", 32, "남자");
		
//		int[] arr = {1,2,3,4,5};
		Person[] people = {
				new Person("김철수", 32, "남자"),//배열 안에서 바로 새로운 객체 생성
				new Person("이영희", 25, "여자"),//배열안에 객체가 생기는게 아니라,
				new Person("박뽀삐", 50, "남자")// heap안에서 다른곳에서 생성되고 배열안에 주소값!
		}; // Person[] 선언 후 바로 초기화.
		
//		System.out.println(Arrays.toString(people)); //배열안의 객체들의 주소값이 들어있음
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo(); 이렇게 할 수도 있지만 귀찮음
		
		for(int i=0; i<people.length; i++) {
			people[i].personInfo();
		}
		
		System.out.println("===================");
		
		//향상for문도 사용가능함.
		for(Person p : people) {
			p.personInfo();
		}
		
		
	
	
	}

}













