package basic.begin;

public class Identifier {

	public static void main(String[] args) {
		/*
		 1. 식별자의 이름은 중복을 허용하지 않습니다.
		 2. 대/소문자를 철저하게 구분합니다.
		*/
		
		int age = 35;
		int Age = 40;
		
		System.out.println(age);
		System.out.println(Age);
		
		// 3. 식별자 이름은 숫자로 지정하거나 시작하면 안됩니다.
		// int 700 = 365; 
		// int 7number = 4083; 이런 경우들..
		int number7 = 7;
		int num7ber = 7;
		int num1234ber = 123;
		
		// 4. 식별자 이름에 '공백' 들어가면 안됩니다.
		// int my birth day = 19921013; 뒤에 birth랑 day를 인식못함
		// int mybirthday = 19921013; 식별자가 가독성이 좋지 않음
		int myBirthDay = 19921013; // camel case
		int my_birth_day = 19921013; // snake case
		
		// 5. 식별자에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($) 뿐입니다.
		// 하지만 사용을 권장하지는 않습니다.
		// 저 특수문자들은 사용하기로 약속된 곳이 지정되어 있습니다.
		String $hello_ = "안녕";
		
		// 6. 키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
		// 키워드는 이미 어떠한 내용을 내표하고 있는 지정 문자입니다.
		// String class = "클래스"; class는 예약어
		String Class = "클래스"; // 대문자로 바꾸면 가능. 권장X
		String className = "클래스"; // 권장
		
		// 7. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다만,
		// 사용을 권장하지는 않습니다.
		int 숫자 = 10;
		String 名 = "춘식이";
		System.out.println(숫자);
		System.out.println(名);
		
		
		
		
		
		
	}

}
