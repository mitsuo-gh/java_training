package RPG;

public abstract class Character {
	//フィールド
	private String name;
	private int hp;
	private boolean defence;
	//コンストラクタ
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	//メソッド
	public abstract void run();
	public abstract void attack(Monster m);

	//ゲッター、セッター
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
}
