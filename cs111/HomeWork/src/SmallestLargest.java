
public class SmallestLargest {
	public static void main(String[] args) {
		System.out.print("Enter Termination Number: ");
		double terNum = IO.readDouble();
		double num;
		double min=0;
		double max=0;
		System.out.print("Enter Number: ");
		double cNum = IO.readDouble();
		if(cNum==terNum) {
			IO.reportBadInput();
			return;
		}else{
			max = cNum;
			min = cNum;
		}System.out.print("Enter Number: ");
		double cNum1 = IO.readDouble();
		if(cNum1==terNum) {
			IO.reportBadInput();
			return;
		}else{
			if(cNum1 > max){
				max = cNum1;
			}
			if (cNum1 < min){
				min = cNum1;
			}
		}
		
		do  {
			System.out.print("Enter Number: ");
			num = IO.readDouble();
			if(num > max && num!=terNum){
				max = num;
			}
			if (num < min && num!=terNum){
				min = num;
			}
		} while(num!=terNum);
		IO.outputDoubleAnswer(min);
		IO.outputDoubleAnswer(max);
	}
}
