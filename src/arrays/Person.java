package arrays;

public class Person {
	public static final String[] FIRST_START ={ "Chr", "Am", "L", "D", "Th", "Br", "D", "H", "Al"};
	public static final String[] FIRST_MIDDLE = {"ala", "ima", "e", "o", "anna", "ola", "ada", "ata", "oma", "eno"};
	public static final String[] FIRST_END = {"na", "ck", "n", "tt", "rian", "lius", "lion", "les"};
	
	public static final String[] LAST_START ={ "Bl", "Am", "L", "D", "Th", "Br", "D", "H", "Al", "Ph", "Fr", "Dr", "Kr"};
	public static final String[] LAST_MIDDLE = {"an", "ist", "ast", "own", "il", "all"};
	public static final String[] LAST_END = {"na", "ck", "n", "tt", "rian", "lius", "lion", "les"};
	
	
	
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String lastName;
	private Borough home;
	private Hobby hobby;
	private Person[] friends;
	private String nickname;
	
	public Person(String firstName,String lastName, Borough home) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.home = home;
		this.friends = new Person[3];
		this.hobby = Hobby.randomHobby();
		this.nickname = createNickname(this.firstName);
	}
	
	/*
	 * PASS BY VALUE
	 * the parameters of a method contain only values, not references
	 * therefore, when they are changed, the REFERENCE to the original object does not change
	 */
	public static String createNickname(String name) {
		//returns a string equal to name up to the index (but not including the second vowel
		//createNickname("Jonathan") -> "Jon"
		boolean foundFirstVowel = false;
		for(int i = 0; i < name.length(); i++) {
			if(isVowel(name.substring(i,i+1))) {
				if(!foundFirstVowel) {
					foundFirstVowel = true;
				}
				else {
					return name.substring(0, i);
				}
			}
		}
		
		return name; //no vowels
		
	}
	
	public static boolean isVowel(String testString) {
		String vowels = "aeiou";
		return vowels.contains(testString.toLowerCase());
	}
	
	public void stateYourFriends() {
		String statement = "My friends are ";
		for(int i = 0; i < this.friends.length-1; i++) {
			statement += this.friends[i].firstName + " " + this.friends[i].lastName + ", ";
		}
		
		statement += "and " + friends[friends.length -1].firstName + " " + friends[friends.length -1].firstName;
		System.out.println(statement);
	}
	
	
	public void mingle(Person[] peers) {
		for(Person p: peers) {
			if(p != this) {
				setInFirstPlace(p);
			}
		}
	}
	public void setInFirstPlace(Person f) {
		for(int i = friends.length -1; i > 0; i--) {
			//move friend from in front, back
			friends[i] = friends[i-1];
		}
		friends[0] = f;
	}
	
	public String toString() {
		return "My name is " + firstName + " " + lastName +". Call me " +nickname + " and I am from " + home + ".";
	}
}
