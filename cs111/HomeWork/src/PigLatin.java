
public class PigLatin {
	public static String translate(String original) {
		char[] vowel = {'a','e','i','o','u'};
		String str = original.toLowerCase();
		String s="";
		for (int i = 0; i<vowel.length; i++) {
			if (str.charAt(0)==vowel[i]){
				s+=str+"vai";
				break;
			}else {	
				String firstChar = str.substring(0, 1);
				String rest = str.substring(1, str.length());
				s+= rest+firstChar+"ai";
			}
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.print("Enter word: ");
		String s= IO.readString();
		IO.outputStringAnswer(translate(s));
	}
}
