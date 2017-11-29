package algorythms;

public class Pokemon {
	
	int level;
	int hp;
	String name;
	boolean poisoned;

	public Pokemon(String name, int level) {
		this.name = name;
		this.level = level;
		hp = 100;
		poisoned = false;
	}

	void iChooseYou() {
		System.out.println(name.concat(name));
	}
	
	String getName() {
		return name;
	}
	
	void setHP(int newHP) {
		hp = newHP;
	}
	
	public void levelUp(Effect e) {
		level++;
		e.happen();
	}
	void setPoisoned(boolean b) {
		poisoned = b;
	}
	
	void lapse() {
		// which subtracts 15 points from hp only if the Pokemon is poisoned.
		
		if(poisoned) {
			hp -=15;
		}
	}
	
	 public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
		attack.attack(target);
		System.out.println("The attack hit");
		}else{
			 System.out.println("The attack missed");
		}
	}
	 
	public static void main(String[] args) {
		Pokemon squirtle = new Pokemon("Squirtle",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		squirtle.iChooseYou();
		bulbasaur.iChooseYou();
	}

	public int getHP() {
		return hp;
	}

}
