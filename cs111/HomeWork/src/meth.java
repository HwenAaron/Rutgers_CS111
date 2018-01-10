
public class meth {
	public static String toUpperCase(String str) {
		String s="";
		for (int i =0; i<str.length(); i++) {
			char c = str.charAt(i);
			s+=Character.toUpperCase(c);
			return s;
		}
		return s;
	}

}
