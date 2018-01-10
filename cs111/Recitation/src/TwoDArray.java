import 
public class TwoDArray {
	
	public static int countOne(double[][] arry) {
		int count = 0;
		for (int i =0 ; i<arry.length; i++) {
			for (int j = 0 ; j<arry[i].length; j++) {
				if (arry[i][j]==1.0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		double[][] arry= new double[5][5];
		for (int i =0 ; i<arry.length; i++) {
			for (int j = 0 ; j<arry[i].length; j++) {
				double x = Math.round(Math.random());
				arry[i][j]=x;
			}
		} 
	}
}
