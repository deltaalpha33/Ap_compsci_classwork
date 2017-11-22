package arrays;

import java.util.Arrays;

public class ObjectMain {
	
	public ObjectMain() {
//		Person[] people = new Person[12];
//		this.populate(people);
//		Person[] group = selectGroup(people, 5);
//		for(Object p : group) {
//			System.out.println(p);
//		}
		
		int numberOfPeople = 120;
		Person[] people = new Person[numberOfPeople];
		populate(people);
		//Person[] group = selectGroup(people, numberOfPeople);
		//analyzeCommonalities(people, group);
		for(Person p: people) {
			p.mingle(people);
			System.out.println(p);
			//p.stateYourFriends();
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
	private int countCommonalities(Object[] arr1, Object[] arr2) {
		int  count=0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				count ++;
			}
		}
		return count;
	}
	
	private void analyzeCommonalities(Person[] people, Person[] group) {
		double totalCommonality = 0;
		double averageCommonality = 0;
		double trials = 500;
		for(int i = 0; i < trials; i++) {
			group = selectGroup(people, people.length);
			totalCommonality += this.countCommonalities(people, group);
		}
		averageCommonality = totalCommonality/trials;
		System.out.println("After "+trials+" trials, shuffling "+people.length+" people, on average,"+averageCommonality+" people end up in the same position where they started");
	}
	


	public Person[] selectGroup(Person[] population, int length) {
		Person[] returnArr = new Person[length];
		Person currentPerson;
		for(int a = 0; a < length; a++) {
			do {
				int index = (int)(Math.random()*population.length);
				currentPerson = population[index];
				
			}while(this.arrayContains(returnArr, currentPerson));
			returnArr[a] = currentPerson;
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
