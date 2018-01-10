import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LuckyNines {
	public static int countLuckyNines(int lowerEnd, int upperEnd) {
		if (lowerEnd>upperEnd) 
			return -1;
		int count = 0;
		for (int temp = lowerEnd; temp <= upperEnd; temp++) {
			String str = String.valueOf(temp);
			Pattern pat = Pattern.compile("9");
			Matcher match = pat.matcher(str);
			while (match.find()) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.print("Enter Lower Value: ");
		int lowerEnd = IO.readInt();
		System.out.print("Enter Upper Value: ");
		int upperEnd = IO.readInt();
		IO.outputIntAnswer(countLuckyNines(lowerEnd, upperEnd));
	}
	
	
}
