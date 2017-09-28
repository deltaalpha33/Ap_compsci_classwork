package attendance;

public class Student implements Attendee{
	
	String firstName;
	String lastName;
	boolean isPresent = false;
	
	public Student(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getReportString() {
		//returns three words separated by 20 spaces: 
		//at index 0, the last name
		//at index 20, the first name
		//at index 40, the word PRESENT or ABSENT
		//ADDED CHALLENGE:
		//if last name or first name is longer than 20 characters, 
		//cut off the last three letters and replace with "..."
		String reportString = "";
		if(this.firstName.length() > 20) {
			reportString += this.firstName.substring(0, 17) + "...";
		}
		else {
			reportString += this.firstName;
			for(int i = 0; i < 20 - this.firstName.length(); i++) {
				reportString += " ";
			}
		}
		
		
		String truncatedLastName = "";
		if(this.lastName.length() > 20) {
			truncatedLastName += this.lastName.substring(0, 17) + "...";
		}
		else {
			truncatedLastName = this.lastName;
		}
		
		reportString += truncatedLastName;
		for(int i = 0; i < 20 - truncatedLastName.length(); i++) {
			reportString += " ";
		}
		
		if(this.isPresent) {
			reportString += "PRESENT";
		}
		else {
			reportString += "ABSENT";
		}
		return reportString;
	}
	
	public boolean isPresent() {
		return this.isPresent;
	}
	
	public boolean matches(String last) {
		return this.lastName.toLowerCase().equals(last.toLowerCase());
	}

	public boolean matches(String first, String last) {
		return this.firstName.toLowerCase().equals(first.toLowerCase()) && this.lastName.toLowerCase().equals(last.toLowerCase());
	}
	
	public void setPresent(boolean present) {
		this.isPresent = present;
	}
}
