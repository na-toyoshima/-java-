package rpg;

public class Wizard {
	String name;
	int hp;
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した");
		System.out.println("現在のHPは"+ h.hp +"です");
	}
}
