package intro;

public class IntroMain {
	
	public static final String[] DESCRIPTIONS = {" is a teacher at BTHS", " is a student at BTHS"};
	
	public static void main(String[] args) {
		//the object is instantiated in its declaration ie. the constructor is called
		//local vars are not fields, they are only used le scope #RAII
		
		int numberOfPeople = 10;
		for(int i = 0; i < numberOfPeople; i++) {
			CodingConventions conventionsInstance = new CodingConventions("Dimtris", i%2);
			conventionsInstance.doStuff();
		}
		
	}
  
}
