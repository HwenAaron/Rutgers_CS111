
public class MaxWithArray {

	public static void main (String[] args) {
		
		// declare an array
		int[] scores = getValues();
		int max = scores[0];
		for ( int i = 1; i < scores.length; i++ ) {
			if ( max < scores[i] ) {
				max = scores[i]; // found a new maximum value
			}
		}
		IO.outputIntAnswer(max);
	}
	
	/*
	 * Returns an array of integers of size n
	 */
	public static int[] getValues () {
		System.out.print("How many values? ");
		int n = IO.readInt();
		int[] arrayOfInts = new int[n]; // allocating an array of size n
		// populating the array
		for ( int i = 0; i < n; i++ ) {
			System.out.print("Enter value: ");
			arrayOfInts[i] = IO.readInt(); // store integer at index i
		}
		return arrayOfInts;
	}
}