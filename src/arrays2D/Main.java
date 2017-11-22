package arrays2D;

public class Main {

	public static void main(String[] args) {
		Array2DSampler test = new Array2DSampler();

	}
	
	/**
	 * PRECONDITION: 	i>=0 and i < arr.length
	 * increases the element at i by 1
	 * decreases the elements at i - 1 and i + 1, if the exist
	 * AVOIDS ArrayIndexOutOfBoundsExeption
	 * @param arr
	 * @param i
	 */
	public static void changeNeighbors(int[] arr, int index) {
		if(index -1 >= 0) {
			arr[index-1]--;
		}
		if(index + 1 < arr.length) {
			arr[index+1]++;
		}
		arr[index]++;
	}

}
