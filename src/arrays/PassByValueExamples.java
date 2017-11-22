package arrays;

import java.util.Arrays;

public class PassByValueExamples {

	public static void main(String[] args) {
		String s = "Hello";
		Person p = new Person("Random", "Dude", Borough.NY_BOROUGHS[0]);
		int x = 5;
		int[] arr = {1,2,3};
		test1(p,x,arr);
		test2(p);
		changeEVERYTHING(s,x,arr);
		
		System.out.println("p is now " +p+", x is " +x+ " and arr is " + Arrays.toString(arr));
		
	}

	private static void test1(Person p, int x, int[] arr) {
		String name = p.getFirstName();
		name = "Origial";
		
	}
	
	private static void test2(Person p) {
		p.setFirstName("Original");
		
	}
	
	private static void test3(int[] arr) {
		arr[0] = 999;
		arr[1] = 998;
	}
	
	private static void changeEVERYTHING(String s, int x, int[] arr) {
		s = "Goodbye";
		x = -5;
		arr = new int[2];
		arr[0] = -1;
		arr[1] = -2;
		
	}

}
