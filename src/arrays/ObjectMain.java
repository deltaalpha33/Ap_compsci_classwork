package arrays;

public class ObjectMain {
	
	public ObjectMain() {
		Object[] people = new Object[12];
		this.populate(people);
		people[0] = new Thing("toaster oven");
		for(Object p : people) {
			System.out.println(p);
		}
		
	}
	

	public void populate(Object[] people) {
		for(int i = 0; i < people.length; i++) {
			String firstName = this.randomNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = this.randomNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough home = this.randomBorough();
			
			//BIG IDEA:
			//In an Object array, you can have multiple data types
			//This is unlike a primitive array
			if(Math.random() < .6) {
				//60 percent of the time
				int money = (int)(Math.random()*20 + 1) * 100000;
				people[i] = new Athlete(firstName, lastName, home, money);
			}
			else {
				//40 percent of the time
				people[i] = new Person(firstName, lastName, home);
			}
			
		}
		
	}
	
	public Person[] selectGroup(Person[] population, int length) {
		Person[] returnArr = new Person[length];
		Person currentPerson;
		for(int a = 0; a < length; a++) {
			do {
				int index = (int)(Math.random()*population.length);
				currentPerson = population[index];
				
			}while(this.arrayContains(returnArr, currentPerson));
		}
		return returnArr;
	}
	
	public boolean arrayContains(Person[] population, Object item) {
		for(Person value: population) {
			if(value == item) {
				return true;
			}
		}
		return false;
	}
	public Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random() * Borough.NY_BOROUGHS.length)];
	}

	public String randomNameFrom(String[] first, String[] middle, String[] end) {
		return this.get(first) + this.get(middle) + this.get(end);
	}
	
	public String get(String[] strArr) {
		return strArr[(int)(Math.random() * strArr.length)];
	}

	public static void main(String[] args) {
		ObjectMain obj = new ObjectMain();

	}

}
