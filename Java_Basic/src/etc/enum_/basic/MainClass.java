package etc.enum_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Developer kim = new Developer();//객체 생성
		kim.name = "김철수";
		kim.career = 3;
		kim.lang = Languages.JAVA;
		//kim.lang = "메롱"; lang의 타입이 String이여서 다른 것들을 받는 걸 막을 수 없음
		//이런 걸 방지 하기 위해서 아예 지정한 상수값들을 모아서 모음집을 만들어 그게 아니면 받지 않게 한다
		//ㄴ> enum(enumerate): 상수 열거용 객체 / 해당하는 상수가 아니면 값이 들어오지 못하게 함.
		//코드의 가독성도 좋아짐.
		
		Developer hong = new Developer();//객체 생성
		hong.name = "홍길동";
		hong.career = 10;
		hong.lang = Languages.PYTHON;
		
		Developer park = new Developer();//객체 생성
		park.name = "박뚜띠";
		park.career = 5;
		park.lang = Languages.CPP;
		
		
		System.out.println("kim의 주력 언어: " + kim.lang.getName());
		System.out.println("kim의 주력 언어: " + hong.lang.getName());
		System.out.println("kim의 주력 언어: " + park.lang);
		
		
		//enum객체의 내용들인 상수를 하나씩 꺼내보고 싶다!
		//values(): 열거형 타입에 존재하는 모든 상수를 배열에 담아서 리턴.
		for(Languages lang : Languages.values()){
			System.out.println(lang);
		}
		
		//ordinal(): 열거형 타입에 열거되어 있는 순서를 정수 값으로 리턴
		System.out.println(kim.lang.ordinal()); //0
		//kim의 lang이 enum에서 몇번째 인덱스인지 알려준다!
		System.out.println(park.lang.ordinal()); //2
		
		//valueOf(str): 매개값으로 전달된 문자열과 일치하는 요소를 리턴
		System.out.println(Languages.valueOf("CPP")); //CPP
		//System.out.println(Languages.valueOf("Merong")); (X) 예외 발생 
		
		//만약 
	}

}
















