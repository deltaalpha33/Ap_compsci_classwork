package arrays;

public class Person {
	public static final String[] FIRST_START ={ "Chr", "Am", "L", "D", "Th", "Br", "D", "H", "Al"};
	public static final String[] FIRST_MIDDLE = {"ala", "ima", "e", "o", "anna", "ola", "ada", "ata", "oma", "eno"};
	public static final String[] FIRST_END = {"na", "ck", "n", "tt", "rian", "lius", "lion", "les"};
	
	public static final String[] LAST_START ={ "Bl", "Am", "L", "D", "Th", "Br", "D", "H", "Al", "Ph", "Fr", "Dr", "Kr"};
	public static final String[] LAST_MIDDLE = {"an", "ist", "ast", "own", "il", "all"};
	public static final String[] LAST_END = {"na", "ck", "n", "tt", "rian", "lius", "lion", "les"};
	
	
	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String firstName,String lastName, Borough home) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.home = home;
	}
	
	public String toString() {
		return "My name is " + firstName + " " + lastName + " and I am from " + home + ".";
	}
}
