package algorythms;

public class MainBattle {

	public MainBattle() {
		// TODO Auto-generated constructor stub
	}
	
	 public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Squirtle is preparing to attack with water blast");
		 squirtle.attack(bulbasaur, new Attack() {
		 
			 public void attack(Pokemon target) {
				 int hp = target.getHP();
				 target.setHP(hp/2);
			 }
		 });
		 System.out.println("Bulbasaur is preparing to attack with poison.");
		 bulbasaur.attack(squirtle, new Attack() {
		 
		 public void attack(Pokemon target) {
			 target.setPoisoned(true);
			 }
		 });
		 
		 squirtle.lapse();
		 bulbasaur.lapse();
		 printScore(squirtle, bulbasaur);
		 
		bulbasaur.levelUp(new Effect() {
			public void happen() {
				bulbasaur.setHP(100);
			}
		});
	}
	 
	private static void printScore(Pokemon p1, Pokemon p2) {
		System.out.println(p1.getName()+", HP = " + p1.getHP());
		System.out.println(p2.getName()+", HP = " + p2.getHP());
	}

}

