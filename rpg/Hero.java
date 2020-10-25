package rpg;

public class Hero{
	String name = "ミナト";
	int hp = 100;
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name +"の攻撃");
		m.hp -=5;
		System.out.println(m.suffix+"に5ポイントのダメージを与えた");
	}
		//逃げる
		public void run() {
			System.out.println(this.name +"is running away!");
		}
		public final void slip() {
			this.hp -= 5;
			System.out.println(this.name + "は転んだ");
			System.out.println("5のダメージ！");
			}
		public Hero() {
			System.out.println("constructor of Hero is running");
		}
	}



/*9章のコード
	public class Hero {
	String name;
	int hp;
	static Sword sword;

	public void attack() {
		System.out.println(this.name+"は"+Hero.sword.name+"で攻撃した");
		System.out.println("敵に"+Hero.sword.damage+"ポイントのダメージを与えた");
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name +"は逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp +"でした");
	}

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
	}
}*/
