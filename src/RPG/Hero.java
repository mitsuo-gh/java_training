package RPG;

public class Hero extends Character {

	//コンストラクタ
	public Hero (String name, int hp) {
		super(name, hp);
	}
	//抽象メソッドの実装
	public void attack(Monster m) {
		System.out.println(getName() + "は" + m.getName() +"に10のダメージ");
		m.setHp(m.getHp() - 10);
	}
	public void run () {
		System.out.println(getName() + "は、逃げ出した！");
	}

	public void die() {
		System.out.println(getName() + "は死んでしまった！");
		System.out.println("GAMEOVERです。");
	}
	String s = getName().toString();



}
