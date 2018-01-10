
public class WordCount {
	public static int countWords(String original, int maxLength) {
		String[] words = original.split("\\s+");
		int count =0;
		
		for (int i = 0; i < words.length; i++) {
		    words[i] = words[i].replaceAll("[^a-zA-Z]", "");
		    words[i] = words[i].toLowerCase();
		    words[i] = words[i].replaceAll("[0-9]","");
		    words[i] = words[i].replaceAll("\\s+","");

		    
		   	if (words[i].length()<=maxLength && words[i].length()!=0 ) {
		    	count++;
		    }
		    
		    //System.out.println(words[i]);
		}
	/*	
		List<String> lst = Arrays.asList(words);
		for (int k =0; k< lst.size(); k++) {
			lst.removeAll(Arrays.asList(null,""));

			lst.add(k, lst.get(k).replaceAll("[^a-zA-Z]", ""));
			lst.add(k, lst.get(k).replaceAll("[0-9]",""));
			lst.add(k, lst.get(k).replaceAll("[^a-zA-Z]", ""));
			
			if (lst.get(k).length() <= maxLength) {
				count++;
			
			}
		}
*/
		
		return count; 
	}
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		String s = IO.readString();
		System.out.print("Enter max length: ");
		int x = IO.readInt();
		IO.outputIntAnswer(countWords(s, x));
		
	}
}
