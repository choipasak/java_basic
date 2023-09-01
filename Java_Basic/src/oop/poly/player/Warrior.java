package oop.poly.player;

public class Warrior extends Player {
	
	int rage;
	
	Warrior(String name) {
		super(name); //이렇게 안적어도 자동으로 JVM이 생성해줌. 부모의 생성자를 호출.
		this.rage = 60;
	}
	
	/*
    - 전사의 고유 기능인 rush 메서드를 작성합니다.
    
    - rush의 대상은 모든 직업들 입니다.
    
    - 만약 rush의 대상이 전사라면 10의 피해를 받고,
     마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
     
    - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
    
    - 남은 체력도 출력해 주세요.
    
    - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
    */
	/*
	public void rush(Player p) {
		if(p instanceof Warrior) {
			p.hp -= 10;
			System.out.printf("player[Rush] -> 전사[-10hp / 남은체력: %d]\n", p.hp);
		}else if(p instanceof Mage) {
			p.hp -= 20;
			System.out.printf("player[Rush] -> 법사[-20hp / 남은체력: %d]\n", p.hp);
		}else if(p instanceof Hunter) {
			p.hp -= 15;
			System.out.printf("player[Rush] -> 헌터[-15hp / 남은체력: %d]\n", p.hp);
		}
	}
	*/
	
	//선생님 버전
	public void rush(Player p) {
		System.out.printf("%s님이 %s님에게 돌진을 시전했습니다!\n"
				, this.name, p.name);
		
		int damage;
		String job;
		if(p instanceof Warrior) {
			damage = 10; job = "전사";
		}else if(p instanceof Hunter) {
			damage = 15; job = "마법사";
		}else {
			damage = 20; job = "헌터";
		}
		p.hp -= damage;
		System.out.printf("%s님(%s)이 %d의 피해를 입었습니다.\n", p.name, job, damage);
		System.out.printf("%s님의 남은 체력: %d\n", p.name, p.hp);
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}

}
