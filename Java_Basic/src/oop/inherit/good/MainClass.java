package oop.inherit.good;

public class MainClass {
	

	public static void main(String[] args) {
		
		Warrior w = new Warrior();
		w.atk = 3;
		w.hp = 50;
		w.level = 1;
		w.name = "전사1";
		w.rage = 60;
		w.characterInfo();
		
		Mage m = new Mage();
		m.name = "법사1";
		m.atk = 5;
		m.hp = 40;
		m.level = 1;
		m.mana = 100;
		m.characterInfo();
		
		Hunter h = new Hunter();
		h.name = "헌터1";
		h.atk = 3;
		h.hp = 50;
		h.level = 1;
		h.pet = "늑대";
		h.characterInfo();

	}

}
