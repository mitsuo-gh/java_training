package RPG;

public class Wizard extends Character {
	private int mp;
	private Wand wand;

	//コンストラクタ
	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}
	//抽象メソッドの実装
	public void attack(Monster m) {
		System.out.println(getName() + "は" + m.getName() + "をヒールの裏で踏みにじった！！");
		System.out.println("10のダメージ！");
		m.setHp(m.getHp() - 10);
	}
	public void run() {
		System.out.println(getName() + "は勇者みつおを置いて逃げ出した！");
	}
	//ユニークメソッド
	public void heal(Character c) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * wand.getPower());
		c.setHp(c.getHp() + recoverPoint);
		System.out.println(c.getName() + "のHPを" + recoverPoint + "回復した！");
	}
	
}
