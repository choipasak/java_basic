package oop.abs.quiz;

public class Circle extends Shape {
	//기본으로 깔아주는 기본생성자가 부모에 없어 그래서너가 여기서 명시해줘야해 라는게 뜸.
	//부모에 기본생성자가 없을 경우에 그렇게 말해줌
	
	
	private int r;
	
//	public Circle() {}이렇게 명시하는게 아니라
	
	public Circle(String name, int r) {//이렇게 명시
		super(name);
		this.r = r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}
	
	@Override
	public double getArea() {
		return this.r*this.r*Math.PI;
	}

	

}
