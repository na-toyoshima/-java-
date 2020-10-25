package rpg;
import java.util.Random;
public class Cleric {
	String name;
	int mp=10;
	int hp=50;
	final int MAX_MP=10;
	final int MAX_HP=50;

	public void selfAid() {
		System.out.println(this.name+"は、セルフエイドを唱えた");
		mp -= 5;
		hp = MAX_HP;
		System.out.println(this.name+"のHPが最大まで回復した");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は"+ sec +"秒、天に祈った");
		int recover = new Random().nextInt(3) + sec; //理論上の回復量を乱数を用いて計算
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		//this.MAX_MP - this.mpか、 recoverのどちらか低い値がrecoverActualに代入される
		this.mp += recoverActual;
		System.out.println("MPが"+ recoverActual +"回復した");
		return recoverActual;
	}
}
