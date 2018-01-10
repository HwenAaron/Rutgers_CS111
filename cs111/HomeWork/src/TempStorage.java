
public class TempStorage {
	public static void main(String[] args) {
		System.out.print("Enter Termination Number: ");
		double terNum = IO.readDouble();
		double num;
		double cNum =0;
		double maxOne=0;
		double maxTwo=0;
		for (int i = 0; i<2; i++) {
			do  {
				System.out.print("Enter Number: ");
				cNum = IO.readDouble();
				if (cNum==terNum) {
					IO.reportBadInput();
				}
				maxOne = cNum;
				maxTwo = cNum;
			} while(cNum==terNum);
		}	
		do  {
			System.out.print("Enter Number: ");
			num = IO.readDouble();

			if(maxOne < num && num!=terNum){
				maxTwo = maxOne;
				maxOne =num;
			}else if(maxTwo < num && num!=terNum){
				maxTwo = num;
			}
		} while(num!=terNum);
		IO.outputDoubleAnswer(maxOne);
		IO.outputDoubleAnswer(maxTwo);
	}	
}
