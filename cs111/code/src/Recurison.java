
public class Recurison {
	
	public static void main(String arg[]) {
		//System.out.println(reverseStr("animation"));
		//System.out.println(recurReverseStr("animation"));
		int[][] arr3 = { {1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10} };
		int[] arr = {1, 2, 3, 18};
		int[] arr2 = new int[8];
	//	System.out.println(arr3[1][1]);
		for(int i = 0 ; i<arr3.length; i++) {
			for(int j = 0; j<arr3[i].length; j++) {
				arr3[i][j] = 69;
			}
			
		}
		//System.out.println(arr3[1][1]);-
	}
	public static String makeStars(int num) {
	    if (num == 0) {
	        return "";
	    }
	    return "*" + makeStars(num - 1);
	}
	public static String reverseStr(String s) {
		String str = "";
		for (int i = s.length(); i>0; i--) {
			str= str+s.charAt(i-1);
		}
		return str;
	}
	public static String recurReverseStr(String s) {
		if (s.isEmpty()) {
			return s; 
		} else {
			return recurReverseStr(s.substring(1)) + s.charAt(0);
		}
			
	}
}
