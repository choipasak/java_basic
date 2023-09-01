package oop.abs.quiz;

public class Circle extends Shape {
	
	private int r;
	
//	public Circle() {}
	
	public Circle(String name, int r) {
		super(name);
		this.r = r;
	}

	@Override
	public double getArea() {
		return this.r*this.r*Math.PI;
	}

	
	public int getR() {
		return r;
	}

}
