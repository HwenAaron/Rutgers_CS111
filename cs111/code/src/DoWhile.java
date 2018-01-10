
public class DoWhile {
	public static void main(String[] args) {
		
		System.out.print("Enter terminating value: ");
		int terminator = IO.readInt();
		int sum = 0; // sum will be updated inside our loop to hold the sum
		
		System.out.print("Enter next number: ");
		int number = IO.readInt();
		
		do {
			
				sum += number;
				System.out.print("Enter next number: ");
				number = IO.readInt();
			
					
		} while ( number != terminator );
		
		IO.outputIntAnswer(sum);
	}
}
