
public class Calc {
	public static void main(String[] srgs) {
		double n = 11 ;
		for (int i = 0; i<3; i++) {
			double funx = Math.pow(n, 2);
			double ans1 = funx - (11*n)+1;
			double dvdx = (2*n)+11;
			double ans3 = ans1/dvdx;
			double ansFin = n - ans3;
			System.out.println(ansFin);
			n = ansFin;
		}
	}
}
