package RPG;

public class Matango extends Monster {
	//フィールド
	//コンストラクタ
	public Matango(int hp, char suffix) {
		super(hp, suffix);
		String name = "お化けキノコ" + suffix;
		setName(name);
	}

	//抽象メソッドの実装
	public void attack(Character c) {
		System.out.println(getName() + "は" + c.getName() + "に10のダメージ");
		c.setHp(c.getHp() - 10);
	}
	public void run() {
		System.out.println(getName() + "はキノコのカサを揺らしながら逃げ出した");
	}

}
