package arrays;

public class Thing extends ArraysMain {
	private String description;
	
	public Thing(String description) {
		this.description = description;
	}
	
	
	public String toString() {
		return "I am a " + this.description + ". What did you expect!?";
	}
	

}
