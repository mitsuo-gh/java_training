package RPG;

public class SuperHero extends Hero {
	boolean flying;

	public SuperHero(String name, int hp) {
		super(name, hp);
	}

	public void fly (Character c) {
		this.flying = true;
		System.out.println(c.getName() + "は飛び上がった！");
	}
	public void Land(Character c) {
		this.flying = false;
		System.out.println(c.getName() + "は地上に舞い降りた！");
	}

}
