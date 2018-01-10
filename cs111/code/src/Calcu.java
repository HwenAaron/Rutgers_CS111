
public class Calcu {
	
	public static void main(String[] args) {
		
		System.out.print("Enter First Num: ");
		double a = IO.readDouble();

		System.out.print("Enter First Num: ");
		double b = IO.readDouble();
		
		System.out.print("Enter 1 or 2 or 3 or 4: ");
		double input = IO.readDouble();
		
		if (input == 1) {
			System.out.println(a+b);
		} 
		else if(input == 2) {
			System.out.println(a-b);
		}
		else if(input == 3) {
			System.out.println(a*b);
		}
		else if (input == 4) {
			if (b == 0) {
				System.out.println("no solution");
				return;
			}else {
				System.out.println(a/b);
			}
		}else{
			System.out.println("Error");
		
		}
		
	}

}
