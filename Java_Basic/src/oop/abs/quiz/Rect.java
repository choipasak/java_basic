package oop.abs.quiz;

public class Rect extends Shape{

	private int length;
	private int width;
	
//	public Rect() {}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	//정사각형용 생성자
	public Rect(String name, int length) {
		super(name);
		this.length = length;
	}
	
	//직사각형용 생성자
	public Rect(String name, int length, int width) {
		super(name);//이거는 부모의 이름저장하는 생성자 사용
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		if(width == 0) {
			return length*length;
		}else {//직사각형일때
			return width*length;
		}
	}

}
