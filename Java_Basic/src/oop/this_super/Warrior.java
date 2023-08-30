package oop.this_super;

public class Warrior extends Player {
	
	int rage;
	
	Warrior(String name) {
		//모든 생성자에는 super()가 내장되어 있습니다.
		//자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
		//부모의 속성과 기능이 실존하게 되고, 물려 줄 수 있기 때문입니다.
		super(name); //이렇게 안적어도 자동으로 JVM이 생성해줌. 부모의 생성자를 호출.
		//바로 직속부모를 칭함
		//모든 클래스에는 super();가 다 내장되어있다!
		this.rage = 60;
	}
	
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}

}
