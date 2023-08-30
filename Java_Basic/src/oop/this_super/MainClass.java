package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player(); //p1은 참조변수. 객체의 주소값을 가진 변수
		p1.name = "유저1"; // 이것도 귀찮다! -> 입력값으로 줄래
		System.out.println("p1의 주소값: " + p1);
		p1.characterInfo();
		
		System.out.println("======================");
		
		Player p2 = new Player("플레이어2"); //referance변수 = 참조변수
		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		System.out.println("======================");
		
		Player p3 = new Player("플레이어3", 200);
		System.out.println("p3의 주소값: " + p3);
		p3.characterInfo();
		
		System.out.println("======================");
		
//		p3.attack(p3);
		p3.attack(p2);
		
		System.out.println("======================");
		
		Warrior w1 = new Warrior("전짱전사짱이라는뜻");
		w1.characterInfo();
		
		Mage m = new Mage("법짱");
		m.characterInfo();
		
		Hunter h = new Hunter("헌짱");
		h.characterInfo();
		

	}

}






