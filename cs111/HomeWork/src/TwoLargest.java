
public class TwoLargest {
	public static void main(String[] args) {
		System.out.print("Enter Terminating Number: ");
		double terNum = IO.readDouble();
		double num;
		double fMax = 0;
		double sMax= 0;
		
		System.out.print("Enter Number: ");
		double num1 = IO.readDouble();
		
		while (num1 == terNum) {
			IO.reportBadInput();
			System.out.print("Enter Number: ");
			num1 = IO.readDouble();
		}
		fMax = num1;
		
		System.out.print("Enter Number: ");
		double num2 = IO.readDouble();
		while (num2 == terNum) {
			IO.reportBadInput();
			System.out.print("Enter Number: ");
			num2 = IO.readDouble();
		}
		if (num2 >= fMax ) {
			fMax = num2;
			sMax = num1;
		}
		else {
			sMax = num2;
		}
		
		do {
			System.out.print("Enter Number: ");
			num = IO.readDouble();
			if (num > fMax && num!=terNum) {
				sMax = fMax;
				fMax = num;
			}
			else if (num > sMax && num!=terNum) {
				sMax = num;
			}
		}while (num != terNum);
		IO.outputDoubleAnswer(fMax);
		IO.outputDoubleAnswer(sMax);
	}
}
