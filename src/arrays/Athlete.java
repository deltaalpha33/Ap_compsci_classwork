package arrays;

public class Athlete extends Person {
	private int money;

	public Athlete(String firstName, String lastName, Borough home, int money) {
		//the first line must call a super constructor
		super(firstName, lastName, home);
		this.money = money;
	}
	
	public String toString() {
		//to call superclass methods, use super.
		return super.toString() + " I also have $" + money + "!";
	}

}
