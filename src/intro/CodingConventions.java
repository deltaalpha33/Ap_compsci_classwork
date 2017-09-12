package intro;

public class CodingConventions {
	//fields on top
	
	private String name;
	private String description;
	
	//le constuctor returns an instance of the class
	public CodingConventions(String name, int descriptionIndex) {
		this.name = name;
		description = IntroMain.DESCRIPTIONS[descriptionIndex];
	}
	
	public void doStuff() {
		//STATIC MeThODe call
		String output = name + " " + description;
		System.out.println(output);
	}
}
