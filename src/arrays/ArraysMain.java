package arrays;

import java.util.Arrays;
public class ArraysMain {

	private int[] testArray;
	
	public ArraysMain() {
		testArray = new int[50];
		//this.populate(testArray);
		//this.countOccurences(testArray, 2, 12);
		
		this.populate1ToN(testArray);
		swap(testArray, 0 , 1);
		System.out.println(Arrays.toString(testArray));
		
		
	}
	private void swap(int[] testArray2, int i, int j) {
		// TODO Auto-generated method stub
		
	}
	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
	}
	private void countOccurences(int[] arr, int start, int end) {
		int[] counter = new int[end - start + 1];
		for(int value : arr) {
			counter[value - start]++;
		}
		
		int total = 0;
		for(int value : counter) {
			total += value;
		}
		
		for(int i = 0; i < counter.length; i++) {
			System.out.println("The value " +(i+start) + " was rolled " + counter[i] + " times.");
		}
		
		for(int i = 0; i < counter.length; i++) {
			System.out.println("The value " +(i+start) + " was rolled " + counter[i]/(double)total *100 + " precent of the time.");
		}
		
		
	}
	/**
	 * This method populates arr wit results from rolling 2 dice
	 * @param arr
	 */
	private void populate(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = this.diceRoll(2);
		}
		
	}
	public void arrayNotes() {
		//two ways to construct an array
		//int[] firstWay = {0,1,2,3,4,5};
		//this way will only work with the declaration.
		//will not work:
		//first way = {6,7,8,9,10};
		String[] secondWay = new String[5];
		//you can go on like so, creating values at each index:
//		secondWay[0] = 1;
//		secondWay[1] = 10;
		
		//Two ways to iterate through an array
		for(int i = 0; i < secondWay.length; i++) {
			System.out.println("the #" + i + " element is "+secondWay[i]);
		}
		
		//"For each int in secondWay"
		for(String value: secondWay) {
			System.out.println("Element is " + value);
		}
		//Note: primitive arrays are automatically populated with 0s
		//Object arrays are not populated (null)
	}

	public static void main(String[] args) {
		ArraysMain sample = new ArraysMain();
		//1. Arrays are collections of primitives and Objects
		//Special Note: this is the only collection of primitives
		
		//2. Size cannot be edited
		
		//3. Elements of an array are REFERENCES to objects

	}
	
	public int diceRoll(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += (int)(Math.random() * 6) + 1;
		}
		return sum;
	}
}
