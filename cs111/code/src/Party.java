
public class Party {
	public static void main(String[] args) {
		
		System.out.print("People count: "); // int
		int pplCount = IO.readInt();
		System.out.print("# of pizza slice per person: "); //int
		int slicePerPerson = IO.readInt();
		System.out.print("# of soda per person: ");//in
		int sodaPerPerson = IO.readInt();
		System.out.print("cost of pizza: ");//double
		double pizzaCost = IO.readDouble();
		System.out.print("Slice per pizza: ");//int
		int slicePerPizza = IO.readInt();
		System.out.print("Cost of Soda box: ");//idouble
		double sodaCost = IO.readDouble();
		System.out.print("Soda per box: ");//int
		int sodaPerBox = IO.readInt();
		
		int number_of_Slices = pplCount*slicePerPerson;
		double number_of_Pizza = Math.ceil((double)number_of_Slices / (double)slicePerPizza);
		double pizza_Cost = pizzaCost*number_of_Pizza;
		
		int number_of_Soda = pplCount*sodaPerPerson;
		double number_of_Box = Math.ceil((double)number_of_Soda / (double)sodaPerBox);
		double soda_Cost = sodaCost * number_of_Box;
		
		double totalCost = soda_Cost + pizza_Cost;
		double round = Math.ceil(totalCost*100)/100;
		IO.outputDoubleAnswer(round);
		
	}
}
