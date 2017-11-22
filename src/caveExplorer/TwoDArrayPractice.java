package caveExplorer;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		String[][] pic = new String[6][10];
		for(String[] row: pic) {
			for(int col = 0; col < row.length; col++) {
				row[col] = " ";
				
			}
		}
//		drawHorizontalLine(pic, 4);
//		drawVerticalLine(pic, 6);
//		drawSlot(pic, 4, 6);
		drawBox(pic, 4, 6);
		print(pic);

	}

	/**
	 * A box looks like this:
	 * 
	 * ___
	 * |*|
	 * |_|
	 * 
	 * The * marks the coordinates of the box
	 * as much of the box
	 * @param pic
	 * @param row
	 * @param col
	 */
	private static void drawBox(String[][] pic, int row, int col) {
		String[][] box = {{"_","_","_"},{"|", " ","|"},{"|", "_", "|"}};
		for(int i = row - 1; i < row + 2; i++) {
			for(int j = col -1; j < col + 2; j++) {
				if(i > 0 && i< pic.length && col > 0 && col < pic[row].length) {
					pic[i][j] = box[i-row+1][j-col+1];
				}
			}
		}
	}

	/**
	 * A slot looks like this:
	 *	| |
	 *the coordinates of the slot are where the space between the two vertical lines is found
	 *Catch: No array Index OUt of Bounds Exceptions
	 * @param pic
	 * @param i
	 * @param j
	 */
	private static void drawSlot(String[][] pic, int row, int col) {
		if(row < 0 || row >= pic.length) {
			return;
		}
		
		if(col > 0) {
			pic[row][col-1] = "|";
		}
		if(col < pic[row].length - 1) {
			pic[row][col+1] = "|";
		}
	}

	private static void drawVerticalLine(String[][] pic, int col) {
		for(int i = 0; i < pic.length; i++) {
			pic[i][col] = "|";
		}
		
	}

	private static void drawHorizontalLine(String[][] pic, int row) {
		for(int i = 0; i < pic[row].length; i++) {
			pic[row][i] = "-";
		}
		
	}

	/**
	 * @param pic
	 * write a method that prints every string in the pic,
	 * not sperated by arrays and no brackets
	 */
	private static void print(String[][] pic) {
		for(String[] row : pic) {
			for(String col : row) {
				System.out.print(col);
			}	
			System.out.println("");
		}
		
	}

}
