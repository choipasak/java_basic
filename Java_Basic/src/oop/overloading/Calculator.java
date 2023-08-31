package oop.overloading;



public class Calculator {
	
	private int length;
	private int width;
	private int ups;
	private int downs;
	private int height;

	/*
    # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
     생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.
     
    - 오버로딩 적용 조건:
    1. 매개 변수의 데이터 타입이 다를 것! or
    2. 매개 변수의 전달 순서가 다를 것! or
    3. 매개 변수의 개수가 다를 것.
    */
	
	void inputData(){} //매개값을 받지 않는 평범한 메서드
	
	void inputData(int a){} //이게 오버로딩(위와 매개변수가 다름). 중복 허용
	
	void inputData(int a, int b){}//(O). 매개변수 개수가 다름
	
//	void inputData(int b, int a){}//(X). 데이터 타입이 위와 똑같아서 구분 불가. 변수 이름은 상관X
	
	void inputData(String s){}//(o) 데이터 타입 다름
	
	void inputData(int a, double d){}//(O)
	
	void inputData(double d, int a){}//(O) 규칙2번으로 구분 가능.
	
//	void inputData(int number){} (x). 변수 이름이 다른건 상관이 없음. 
								//정수 매개값 1개를 받는 메서드가 이미 선언됨.
	
//	int inputData(int number) { //void->int 리턴타입으로 변경
		//오버로딩은 메서드명과 매개변수값을 기준으로 판단. => 리턴타입은 오버로딩에 영향X
//		return 0;
//	} (X) 반환 유형 (return type)은 오버로딩에 영향을 미치지 못합니다.
	
	int calcRectArea(int length) {
		return length*length;
//		자바에서는 제곱승을 Math.pow(length, 2); length의 2승 
	}
	
	int calcRectArea(int width, int length) {
		return width*length;
	}
	
	double calcRectArea(int ups, int downs, int height) {
		return ((ups+downs)*height)/2.0;
	}
	
	

}
