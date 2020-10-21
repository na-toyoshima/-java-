package rpg;
public class SuperHero extends Hero{
		boolean flying;
		//戦う
		public void fly() {
			this.flying = true;
			System.out.println("he is flying!");
		}
		public void land() {
			this.flying = false;
			System.out.println("he is landing!");
		}
		public void run() {
			System.out.println("he is withdrawing");
		}
		public void attack(Matango m) {
			super.attack(m);
			if (this.flying) {
				super.attack(m);
			}
		}
		public SuperHero() {
			System.out.println("constructor of SuperHero is running");
		}
		}
