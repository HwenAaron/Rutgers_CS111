
public class PayFee {
	public static void main(String[] argss) {
		double payment;
		double base = 10000*.02;
		do {
			
			System.out.print("Enter you payment amount: ");
			payment = IO.readDouble();
			
			if(payment<=599) {
				IO.outputDoubleAnswer(10);
			}
			else if(payment > 500 && payment < 5000) {
				if(payment * .01>20) {
					IO.outputDoubleAnswer(Math.ceil((payment*.01)*100)/100);
				}
				else {
					IO.outputDoubleAnswer(20);
				}
			}
			else if(payment >= 5000 && payment < 10000 ) {
				if(payment * .02>120) {
					IO.outputDoubleAnswer(Math.ceil((payment*.02)*100)/100);
				}
				else {
					IO.outputDoubleAnswer(120);
				}	
			}
			else {
				if(payment >= 10000 && payment < 15000) {
					double temp = payment - 10000;
					double fee = base + (temp*.03);
					IO.outputDoubleAnswer(Math.ceil(fee*100)/100);
				}
				else if (payment > 15000){
					double base2 = 5000*.03;
					double temp = payment - 15000;
					double fee = base + base2 + (temp*.04);
					
					IO.outputDoubleAnswer(Math.ceil(fee*100)/100);
				}
			}

		}while (payment <= 0);
	}
}
