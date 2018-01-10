
public class Terminal {
	public static int countWords(String original, int maxLength) {
		String[] words = original.split("\\s+");
		int count =0;
		for (int i = 0; i < words.length; i++) {
		    words[i] = words[i].replaceAll("[^\\w]", "").replaceAll("[0-9]","");
		}
		for (int j =0; j<words.length; j++) {
		    if (words[j].length()>=maxLength) {
		    	count++;
		    } 
		}
		return count;
	}
	
	public static void main(String[] args) {
		//System.out.print(" Enter string: ");
		//String s = IO.readString();
		//System.out.print("Enter max length: ");
		//int x = IO.readInt();
		//IO.outputIntAnswer(countWords(s, x));
		String s = "12345454";
		s = s.replaceAll("[^a-zA-Z]", "");
	    s = s.toLowerCase();
	    s = s.replaceAll("[0-9]","");
	    s = s.replaceAll("\\s+","");
		System.out.println(s.length());
		System.out.println(s);
		int max =3;
		int count = 0;
		if (s.length()<= max && s.length()!=0){
			count++;
		} 
		System.out.println(count);
	}
}
