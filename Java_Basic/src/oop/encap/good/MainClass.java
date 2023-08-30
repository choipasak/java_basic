package oop.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyBirth m = new MyBirth();
//		m.year = 45635645; private 이여서 아무 값도 넣을 수가 없어짐.
		m.setYear(1992);
		m.setMonth(8);
		m.setDay(30);
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n"
				, m.getYear(),  m.getMonth(), m.getDay());
		
		m.birthInfo(2555, 12, 10);
		m.birthInfo(2000, 8, 30);
		
		m.isValidateMonth(9, 31);
	}

	
}
