package oop.poly.player;

public class Mage extends Player{
	
	int mana;
	
	Mage(String name) {
		super(name);
		this.mana = 200;
	}
	
	public void blizzard(Player[] p) { //매개변수 가변인수로 해도 됐었네 그대신 전달하는 매개변수가 많이 쓰긴해야함.
		System.out.println(this.name + "님이 눈보라 시전!!");
		this.mana -= 20;
		System.out.printf("-20mp (남은 mp : %d)\n", this.mana);
		System.out.println("========================");
		for(int i=0; i<p.length; i++) {// 향상for문으로 해줘도 됌. 왜냐면 인덱스값을 뭘 할게 아니니까
			int atk = (int)(Math.random()*6+10);
			System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
					, p[i].name, atk, this.hp-atk);
		}//향상된for문이였으면 this.hp -= atk를 변수로 미리선언하고 출력문에도 간단히 쓰기 가능.
	}
	//여기서 return으로 Player로 설정해서 하는것은 의미가 없는 짓
	/*
	public Player blizzard() {
		System.out.println(this.name + "님이 눈보라 시전!!");
		this.mana -= 20;
		System.out.printf("-20mp (남은 mp : %d)\n", this.mana);
		System.out.println("========================");
		for(int i=0; i<p.length; i++) {// 향상for문으로 해줘도 됌. 왜냐면 인덱스값을 뭘 할게 아니니까
			int atk = (int)(Math.random()*6+10);
			System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
					, p[i].name, atk, this.hp-atk);
	}
	*/
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 마나: " + mana);
	}

}
