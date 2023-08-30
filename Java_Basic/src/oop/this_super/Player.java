package oop.this_super;

public class Player { //얘도 상속을 받고있음 Object라는 클래스를 상속.컴파일러가 자동으로 붙여줌
	
	String name;
	int level;
	int atk;
	int hp;
	
	Player() {
		System.out.println("Player의 기본 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
		level = 1;
		atk = 3;
		hp = 50;
	}
	
	Player(String name){ //overloading
//		System.out.println("this의 주소값: " + this);
//		level = 1;
//		atk = 3;
//		hp = 50; 위의 player랑 겹치니까 차라리 위의 Player를 호출해서 사용하겠다!
		this(); // 같은 클래스의 다른 생성자를 부르는 문법.
		
		System.out.println("Player의 2번 생성자 호출!");
		
		//좌항이 필드가 아니라 매개변수로 봐지고있음. 인식X
		//해결: 1.이름을 필드와 매개변수 식별자를 다르게 해준다.
		//2. 좌항에 this. 을 사용
		this.name = name; //지금 호출되는 객체의 필드. name값이라는 의미
		// this = p2라고 보면된다. 그 객체의 주소값!
	}
	
	Player(String name, int hp){
		this(name); //2번생성자를 호출 중복코드를 줄임.
		// 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다!
		System.out.println("Player의 3번 생성자 호출!");
//		this.name = name;
		this.hp = hp;
	}
	
	void attack(Player target) {//매개값으로 Player객체를 보내라.
		//여기서 this는 때리는 주체의 객체
		
//		System.out.println("target: " + target);
//		System.out.println("this: " + this);
		
		//자기 자신을 때리는것을 방지
		if(target == this) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return; // void메서드의 break;같은 존재. 강제종료
		}
		
		//출력 메세지: x가 y를 공격합니다.
		System.out.println(this.name + "이 " + target.name + "을 공격합니다.");
		
		//맞는 사람의 hp를 10감소하고 나의 체력을 5회복
		target.hp -= 10;
		this.hp += 5;
		
		
		//결과를 출력하자.(나의 체력 : XX, 상대의 체력: XX)
		System.out.println("나의 체력: " + this.hp + ", 상대의 체력: " + target.hp);
	}
	
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
//		System.out.println("이 메서드를 호출한 객체의 이름: " + this.name);
	}

}
