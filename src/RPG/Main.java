package RPG;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard("薄皮貴婦人マツダーラ", 100, 30);
		Hero h = new Hero("勇者みつお", 150);
		Matango m = new Matango(50, 'A');
		w.attack(m);

	}

}
