package oop.this_super;

public class Mage extends Player{
	
	int mana;
	
	Mage(String name) {
		super(name);
		this.mana = 200;
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정이진: " + mana);
	}

}
