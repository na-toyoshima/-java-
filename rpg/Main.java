package rpg;

public class Main {
	public static void main(String args[]){

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;

		SuperHero sh1 = new SuperHero();
		sh1.name="super hero";
		sh1.hp = 250;

		Weapon w = new Weapon();
		System.out.println(w.name +" has been generated. ");

		//Hero h2 = new Hero();
		//Sh2.name = "アサカ";
		//h2.hp = 100;
		//System.out.println(h2.name);

		/*Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);*/


		/*Sword s = new Sword();
		s.name ="炎の剣";
		s.damage =10;
		Hero.sword = s;*/



		System.out.println("勇者"+ h1.name+"を生み出しました");
		System.out.println(sh1.name + " has been generated.");
		//System.out.println(s.name + "を装備しています。");

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		System.out.println("お化けキノコ"+ m1.suffix+"を生み出しました");

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		System.out.println("お化けキノコ"+ m2.suffix+"を生み出しました");

		h1.attack(m1);
		sh1.fly();
		sh1.attack(m1);
		h1.run();
		sh1.run();
		/*h1.slip();
		m1.run();
		h1.attack();
		m2.run();
		h1.sit(25);
		h1.run();*/


	}
}
