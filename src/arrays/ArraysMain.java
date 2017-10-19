package arrays;

import java.util.Arrays;
public class ArraysMain {

	private String[] suits;
	private String[] values;
	
	public ArraysMain() {
		
		
	}
	public void createDeck() {
		suits = new String[50];
		suits[0] = "Clubs";
		suits[1] = "Hearts";
		suits[2] = "Diamonds";
		suits[3] = "Spades";
		
		for(int i = 0; i < values.length; i ++) {
			values[i] = "" + (i +1);
		}
		values[0] = "Ace";
		values[12] = "King";
		values[11] = "Queen";
		values[10] = "Jack";
	}
	
	public void printDeck() {
		for(String suit: this.suits) {
			for(String value: this.values) {
				System.out.println(suit + " " + value);
			}
		}
		
	}

	public void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			swap(arr, i , (int)(Math.random()*arr.length));
		}
	}
	private void swap(int[] arr, int i, int j) {
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
		
	}
	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
	}
	public void countOccurences(int[] arr, int start, int end) {
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
	public void populate(int[] arr) {
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
		
		//1. Arrays are collections of primitives and Objects
		//Special Note: this is the only collection of primitives
		
		//2. Size cannot be edited
		
		//3. Elements of an array are REFERENCES to objects
		ArraysMain arrayMain = new ArraysMain();
		//int[] arr = new int[10];
		int[] arr = {1,2,3,4};
		//arrayMain.reverseOrder(arr);
		int[] longestData = arrayMain.longestConsecutiveSeqAndIndex(arr);
		System.out.println(Arrays.toString(longestData));
		//System.out.println(Arrays.toString(arrayMain.subArray(arr, 4, 3)));
		
//		int[] diceRolls = new int[10000];
//		arrayMain.populate(diceRolls);
//		int[] data = arrayMain.longestConsecutiveSeqAndIndex(diceRolls);
//		System.out.println("The longest sequence is " + data[0] 
//				+ " rolls  It happended on roll #" + data[1]
//				+ " the sequence was: " 
//				+ Arrays.toString(arrayMain.subArray(diceRolls, data[1], data[0])));
		


	}
	public int[] longestConsecutiveSeqAndIndex(int[] arr) {
		int[] data = new int[2]; //element 0 is length , element 1 is position
		data[0] = 0;
		for(int i = 0; i < arr.length; i++) {
			int sequenceLength = this.consecutiveSequenceLength(arr, i);
			if(sequenceLength > data[0]) {
				data[0] = sequenceLength;
				data[1] = i;
			}
		}
		return data;
		
	}
	
	public int longestConsecutiveSequence(int[] arr) {
		int longest = 0;
		for(int i = 0; i < arr.length; i++) {
			int sequenceLength = this.consecutiveSequenceLength(arr, i);
			if(sequenceLength > longest) {
				longest = sequenceLength;
			}
		}
		return longest;
	}
	public int consecutiveSequenceLength(int[] arr, int startPos) {
		for(int i = 0; i < arr.length - startPos -1; i++) {
			
			if(arr[startPos+i] != (arr[startPos + i + 1])) {
				return i;
			}
		}
		return arr.length - startPos; //reached the end with no different chars
		
	}
	
	public void cycleThrough(int[] arr, int n) {
		for(int i = 0; i < n; i ++) {
			this.frontToBack(arr);
		}
	}
	public void frontToBack(int[] arr) {
		int temp = arr[0];
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length -1] = temp;
	}
	
	public int diceRoll(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += (int)(Math.random() * 6) + 1;
		}
		return sum;
	}
	
	public void reverseOrder(int[] arr) {
		for(int i = 0; i < arr.length/2; i++) {
			this.swap(arr, i, arr.length - i - 1);
		}
	}
	public int[] subArray(int[] arr, int psn, int length) {
		int[] returnArr = new int[length];
		for(int i = 0; i < length; i++) {
			returnArr[i] = arr[psn+i];
		}
		return returnArr;
	}
}
