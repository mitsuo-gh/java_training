package RPG;

public abstract class Monster {
	private String name;
	private int hp;
	private char suffix;

	public Monster(int hp, char suffix) {
		this.hp = hp;
		this.suffix = suffix;
	}
	 public abstract void run();
	 public abstract void attack(Character c);

	 public void setHp(int hp) {
		 this.hp = hp;
	 }
	 public int getHp() {
		 return this.hp;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return this.name;
	 }

}
